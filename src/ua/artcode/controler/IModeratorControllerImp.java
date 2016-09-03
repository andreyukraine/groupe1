package ua.artcode.controler;

import ua.artcode.controler.IModeratorController;
import ua.artcode.db.IAppDB;
import ua.artcode.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT on 21.08.2016.
 */
public class IModeratorControllerImp implements IModeratorController {


    private IAppDB appDBImpl;
    private List<Service> myServices = new ArrayList<>();
    private List<Company> myCompanies = new ArrayList<>();
    private List<Worker> myWorkers = new ArrayList<>();
    private List<Client> myClients = new ArrayList<>();
    private List<Order> myOrders = new ArrayList<>();

    // Вызов конструктора в которой образ базы данных совмещен с перемннной данного класа
    public IModeratorControllerImp(IAppDB appDB) {
        this.appDBImpl = appDB;
    }

    // Метод регистрирования Модератора, в ходе которого Модератор добавляется в общую базуданных
    @Override
    public Moderator register(String fullname, String email, String phone, String pass, String role) {
        if (fullname.length() == 0 || email.length() == 0 || phone.length() == 0 || pass.length() == 0 || role.length() == 0){
            return null;
        }

        Moderator moderator = appDBImpl.addModerator(fullname, email, phone, pass, role);
        return moderator;
    }

    // Добавление компании в общую базу всех компаний и в список компаний модератора
    @Override
    public Company addCompany(String nameCompany, String city, String descriptionCompany) {

        Company company = appDBImpl.addCompany(nameCompany, city, descriptionCompany);
        myCompanies.add(company);

        return company;
    }

    // Редактирование компании в общей базе всех компаний и в списке компаний модератора
    @Override
    public Company editCompany(String oldNameCompany, String newNameCompany, String description) {
        appDBImpl.editCompany(oldNameCompany, newNameCompany, description);

        Company newCompany = null;
        for (int i = 0; i < myCompanies.size(); i++) {
            if (oldNameCompany == myCompanies.get(i).getNameCompany()){
                myCompanies.get(i).setNameCompany(newNameCompany);
                myCompanies.get(i).setDescriptionCompany(description);
                newCompany = myCompanies.get(i);
            }
        }

        return newCompany;
    }


    //Найти компанию в общем списке компаний в базе
    @Override
    public Company findCompany(String nameCompany) {
        Company findCompany = appDBImpl.findCompany(nameCompany);
        return findCompany;
    }

    //Найти воркера в базе приложения по имени
    public Worker findWorker(String nameWorker) {
        Worker findWorker = appDBImpl.findWorker(nameWorker);
        return findWorker;
    }

    //Метод показать все свои компании
    public void showMyCompany(){

        for (int i = 0; i < myCompanies.size(); i++) {
            System.out.println(myCompanies.get(i).toString());
        }

    }

    //Метод показать всеx своих работников
    public void showMyWorkers(){

        for (int i = 0; i < myWorkers.size(); i++) {
            System.out.println(myWorkers.get(i).toString());
        }

    }


    // Удаление компании с общей базы всех компаний и со списка компаний модератора (своего списка, который создал)
    @Override
    public boolean removeCompany(String nameCompany) {

        if (nameCompany.length() == 0){
            return false;
        }

        Company company1 = null;
        for (int i = 0; i < myCompanies.size(); i++) {
            if(nameCompany == myCompanies.get(i).getNameCompany()){
                company1 = myCompanies.get(i);
                break;
            }
        }

        boolean res1 = myCompanies.remove(company1.getId());

        Company companyForDelete = appDBImpl.findCompany(nameCompany);
        boolean res2 = appDBImpl.removeCompany(nameCompany);

        return res1 && res2;
    }

    // Добавление сервиса с общего списка базы всех сервисов в свой список сервисов модератора, а также присвоение сервиса компании
    @Override
    public Service addService(String nameService) {

        if (nameService.length() == 0){
            return  null;
        }

        Service service = appDBImpl.getService(nameService);
        myServices.add(service);

        return service;
    }


    // Исправить (поиск имени сервиса в базе) поиск компании среди списка моих компаний
    //Присвоить сервис компании
    @Override
    public Company asignServiceToCompany(String companyName, String serviceName) {

        if (companyName.length() == 0 || serviceName.length() == 0){
            return null;
        }

        Company company = appDBImpl.findCompany(companyName);
        company.addService(serviceName);
        return company;
    }

    // Удаление сервиса со списка сервисов модератора
    @Override
    public boolean removeService(String serviceName) {
        if (serviceName.length() == 0){
            return false;
        }

        Service service = null;
        for (int i = 0; i < myServices.size(); i++) {
            if(serviceName == myServices.get(i).getNameService()){
                service = myServices.get(i);
                break;
            }
        }

        boolean res1 = myServices.remove(service.getId());
        boolean res2 = appDBImpl.removeService(serviceName);

        return res1 && res2;
    }

    @Override
    public Service findService(String serviceName) {
        Service findService = appDBImpl.findService(serviceName);
        return findService;
    }

    // Выбрать сервисы из своего списка
    @Override
    public Service[] chooseService(Service ... args) {
        if (args.length == 0){
            return null;
        }

        Service[] chooseArrayService = new Service [args.length];
        for (int i = 0; i < args.length; i++) {
            chooseArrayService[i] = args[i];
        }

        return chooseArrayService;
    }

    // Создать Воркера
    public Worker createWorker(String fullName, String email, String phone, String pass, String description, String role){
        Worker worker = appDBImpl.addWorker(fullName, email, phone, pass, description, role);
        myWorkers.add(worker);
        return worker;
    }

    // Удалить Воркера
    @Override
    public boolean removeWorker(String workerName) {
        if (workerName.length() == 0){
            return false;
        }

        Worker worker = null;
        for (int i = 0; i < myWorkers.size(); i++) {
            if(workerName == myWorkers.get(i).getFullname()){
                worker = myWorkers.get(i);
                break;
            }
        }

        boolean res1 = myWorkers.remove(worker.getId());
        boolean res2 = appDBImpl.removeWorker(workerName);


        return  res1 && res2;
    }

    // Редактировать Воркера
    @Override
    public Worker editWorker (String oldWorkerName, String newWorkerName, String descriptionWorker) {

        Worker updateWorker1 = appDBImpl.editWorker(oldWorkerName, newWorkerName, descriptionWorker);

        Worker updateWorker2 = null;
        for (int i = 0; i < myWorkers.size(); i++) {
            if (oldWorkerName == myWorkers.get(i).getFullname()){
                myWorkers.get(i).setFullname(newWorkerName);
                myWorkers.get(i).setDescriptionWorker(descriptionWorker);
                updateWorker2 = myWorkers.get(i);

            }
        }

        if (updateWorker1.getFullname().equals(updateWorker2.getFullname())){
            return updateWorker1;
        } else return null;

    }


    // Добавить Воркера в компанию
    @Override
    public Company asignWorkerToCompany(String companyName, String workerName) {
        if (companyName.length() == 0 || workerName.length() == 0){
            return null;
        }

        Company company = appDBImpl.findCompany(companyName);
        company.addWorker(workerName);
        return company;

    }

    // Назначить заказ Воркеру
    @Override
    public Worker asignOrderWorker(long idOrder, String workerName) {

        Worker worker = appDBImpl.findWorker(workerName);
        for (int i = 0; i < myOrders.size(); i++) {
            if (idOrder == myOrders.get(i).getId()){
                myOrders.get(i).setWorker(worker);
            }
        }

        return worker;
    }


    // Показать всех воркеров в компании
    @Override
    public void showAllWorkersInCompany(String companyName) {

        Company company = appDBImpl.findCompany(companyName);
        List<Worker> workersInCompany =  new ArrayList<>();
        workersInCompany = company.getAllWorkersInCompany();
        for (int i = 0; i < workersInCompany.size(); i++) {
            System.out.println("Worker{" +
                    "WorkerName=" +  workersInCompany.get(i).getFullname() + '\'' +
                    "Email=" + workersInCompany.get(i).getEmail() + '\'' +
                    "Phone=" + workersInCompany.get(i).getPhone() + '\'' +
                    '}');
        }

    }


    // Назначить сервису работника
    @Override
    public boolean asignServiceWorker(Service service, Worker worker) {
        return false;
    }

    public  Order findOrder(long idOrder){
        Order findOrder = appDBImpl.findOrder(idOrder);
        return  findOrder;
    }

    // Назначить статус заказа
    @Override
    public Order assignStatusOrder(Order order, Status status) {
        return null;
    }

    @Override
    public Order asignOrderToWorker(Order order, Worker worker) {
        return null;
    }

    // Показать все свободных работников
    @Override
    public Worker[] showAllFreeWorker(Status status) {
        return new Worker[0];
    }
}
