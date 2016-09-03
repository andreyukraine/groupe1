package ua.artcode.db;

import ua.artcode.exceptions.ServiceNotUpdateException;
import ua.artcode.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 21.08.16.
 */
public class AppDBImpl implements IAppDB {

    private List<Company> companies = new ArrayList<Company>();
    private List<Moderator> moderators = new ArrayList<>();
    private List<Service> services = new ArrayList<>();
    private List<Worker> workers = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


    public Service addService(Service service) {
        services.add(service);
        return service;
    }

    public Service updateService(long serviceId, Service service) throws ServiceNotUpdateException{

        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getId() == serviceId) {
                services.set(i, service);
                return service;
            }
        }
       throw new ServiceNotUpdateException("Service doesn't exist");

    }

    // constructors --------------------------------------------------------------------------------

    public AppDBImpl() {
    }

    public AppDBImpl(List<Company> companies, List<Client> clients, List<Moderator> moderators, List<Service> services) {
        this.companies = companies;
        this.clients = clients;
        this.moderators = moderators;
        this.services = services;
    }
    // geters & seters -----------------------------------------------------------------------------

    public boolean removeService(String nameService){

        if(nameService.length() == 0){
            return false;
        }

        Service service = null;
        for (int i = 0; i < services.size(); i++) {
            if (nameService == services.get(i).getNameService()){
                service = services.get(i);
            }
        }

        services.remove(service);
        return true;
    }


    public  Service findService(String nameService){
        if (nameService.length() == 0){
            return null;
        }

        for (int i = 0; i < services.size(); i++) {
            if (nameService == services.get(i).getNameService()){
                Service service = services.get(i);
                return service;
            }
        }
        return null;
    }

    public Service editService(String nameService, String descriptionSevice){

        if (nameService.length() == 0){
            return  null;
        }

        Service service = null;
        for (int i = 0; i < services.size(); i++) {
            if (nameService == services.get(i).getNameService()){
                services.get(i).setNameService(nameService);
                services.get(i).setDescriptionService(descriptionSevice);
                service = services.get(i);
                return service;
            }
        }
        return null;
    }

    public Service getService(String nameService){

        if (nameService.length() == 0){
            return  null;
        }

        Service service = null;
        for (int i = 0; i < services.size(); i++) {
            if (nameService == services.get(i).getNameService()){
                service = services.get(i);
                return service;
            }
        }
        return null;
    }

    @Override
    public Company addCompany(String nameCompany, String city, String descriptionCompany) {

        Company company = new Company(nameCompany, city, descriptionCompany);
        companies.add(company);

        return company;
    }

    public Company addCompany(Company company){

        companies.add(company);

        return company;
    }


    @Override
    public boolean removeCompany(String nameCompany) {

        Company company = null;
        for (int i = 0; i < companies.size(); i++) {
            if (nameCompany == companies.get(i).getNameCompany()){
                company = companies.get(i);
            }
        }

        companies.remove(company);
        return true;
    }


    public Company getCompany(String nameCompany) {
        Company company = null;
        for (int i = 0; i < companies.size(); i++) {
            if (nameCompany == companies.get(i).getNameCompany()){
                company = companies.get(i);
            }
        }
        return company;
    }


    public Company editCompany(String oldNameCompany, String newNameCompany, String description) {

        if (newNameCompany.length() == 0 ) {
            return null;
        }

        Company newCompany = null;
        for (int i = 0; i < companies.size(); i++) {
            if (oldNameCompany == companies.get(i).getNameCompany()){
                companies.get(i).setNameCompany(newNameCompany);
                companies.get(i).setDescriptionCompany(description);
                newCompany = companies.get(i);

            }
        }
        return newCompany;
    }

    public Company findCompany(String nameCompany) {

        if (nameCompany.length() == 0){
            return null;
        }

        for (int i = 0; i < companies.size(); i++) {
            if (nameCompany == companies.get(i).getNameCompany()){
                Company company = companies.get(i);
                return company;
            }
        }
        return null;
    }


    public Moderator addModerator(String fullname, String email, String phone, String pass, String role) {

        Moderator moderator = new Moderator(fullname, email, phone, pass, role);

        moderators.add(moderator);

        return moderator;
    }

    public boolean removeModerator(String nameOfModerator) {

        if(nameOfModerator.length() == 0) {
            return  false;
        }

        Moderator moderator = null;
        for (int i = 0; i < moderators.size(); i++) {
            if(nameOfModerator.equals(moderators.get(i).getFullname())){
                moderator = moderators.get(i);
            }
        }

        moderators.remove(moderator);
        return true;
    }


    public Worker addWorker(String fullname, String email, String phone, String pass, String descriptionWorker, String role) {
        Worker worker = new Worker(fullname, email, phone, pass, descriptionWorker);

        workers.add(worker);
        return worker;
    }

    public boolean removeWorker(String workerName) {

        if (workerName.length() == 0){
            return false;
        }

        Worker worker = null;
        for (int i = 0; i < workers.size(); i++) {
            if(workerName.equals(workers.get(i).getFullname())){
                worker = workers.get(i);
            }
        }
        workers.remove(worker);
        return true;
    }

    public  Worker findWorker(String nameWorker){
        if (nameWorker.length() == 0){
            return null;
        }

        for (int i = 0; i < workers.size(); i++) {
            if (nameWorker == workers.get(i).getFullname()){
                Worker worker = workers.get(i);
                return worker;
            }
        }
        return null;
    }

    public Worker editWorker(String oldWorkerName, String newWorkerName, String descriptionWorker) {

        if (newWorkerName.length() == 0 ) {
            return null;
        }

        Worker updateWorker  = null;
        for (int i = 0; i < workers.size(); i++) {
            if (oldWorkerName == workers.get(i).getFullname()){
                workers.get(i).setFullname(newWorkerName);
                workers.get(i).setDescriptionWorker(descriptionWorker);
                updateWorker = workers.get(i);

            }
        }
        return updateWorker;
    }

    public Client addClient(String fullname, String email, String phone, String pass, String role) {
        Client client = new Client(fullname, email, phone, pass, role);

        clients.add(client);
        return client;
    }

    public boolean removeClient(String nameClient) {

        if (nameClient.length() == 0){
            return false;
        }

        Client client = null;
        for (int i = 0; i < clients.size(); i++) {
            if(nameClient.equals(clients.get(i).getFullname())){
                client = clients.get(i);
            }
        }
        clients.remove(client);
        return true;
    }

    public  Order findOrder(long idOrder){
        if (idOrder >= orders.size() || idOrder < 0){
            return null;
        }

        Order order = null;
        for (int i = 0; i < orders.size(); i++) {
            if (idOrder == orders.get(i).getId()){
                order = orders.get(i);
                return order;
            }
        }
        return null;
    }

    @Override
    public Order addOrder(int leadTime, Service service, Client client, String descriptionOrder) {
        Order order = new Order(2, service, client, descriptionOrder);

        orders.add(order);
        return null;
    }

    @Override
    public boolean removeOrder(long idOrder) {
        orders.remove(idOrder);
        return false;
    }

    @Override
    public Order editOrder(long idOrder, String newDescription) {

        for (int i = 0; i < orders.size(); i++) {
            if (idOrder == orders.get(i).getId()) {
                orders.get(i).setDescriptionOrder(newDescription);
                Order order = orders.get(i);
                return order;
            }
        }
        return null;
    }

    // Назначить статус заказа
    public Order assignStatusOrder(Order order, Status status){

        order.setStatus(status);

        return order;
    }

    // Назначить заказу работника
    public Order asignOrderToWorker(Order order, Worker worker){

        order.setWorker(worker);
        return order;
    }

    /*public List<Company> getCompanies() {
        return companies;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Moderator> getModerator() {
        return moderators;
    }

    public void setModerator(List<Moderator> moderator) {
        this.moderators = moderators;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }*/
}
