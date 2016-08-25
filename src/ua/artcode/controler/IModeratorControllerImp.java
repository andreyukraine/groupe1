package ua.artcode.controler;

import ua.artcode.controler.IModeratorController;
import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public class IModeratorControllerImp implements IModeratorController {

    Service [] services;
    Company [] companies;
    Worker [] workers;

    //TODO  reducted удалено компанию от модератора
    @Override
    public Moderator register(String fullname, String email, String phone, String pass, String role) {
        Moderator moderator= new Moderator(fullname, email, phone, pass, role);
        return moderator;
    }

    //TODO  reducted  изменено create на add
    @Override
    public boolean addCompany(Company company) {
        return false;
    }

    @Override
    public Company editCompany(String nameCompany, String newNameCompany) {
        return null;
    }

    @Override
    public Company findCompany(long companyId) {
        return null;
    }

    @Override
    public boolean removeCompany(long companyId) {
        return false;
    }

    @Override
    public boolean addService(long companyId, Service service) {
        return false;
    }

    @Override
    public boolean removeService(long serviceId) {
        return false;
    }

    @Override
    public Service[] chooseService(Service ... args) {
        Service[] chooseArrayService = new Service[args.length];
        return chooseArrayService;
    }

    public Worker createWorker(String fullName, String email, String phone, String pass){
       return null;
    }

    @Override
    public boolean addWorkerToCompany(long companyId, long workerId) {
        return false;
    }

    @Override
    public Worker asignOrderWorker(Order order, long workerId) {
        return null;
    }



    @Override
    public Worker[] getOwnWorkersInCompany(long companyId) {

        // метод не закончен
        Company company = new Company();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getId() == companyId){
                company = companies [i];
                break;
            }
        }

        Worker[] arrayWorkersInCompany = new Worker[company.getIndexOfWorker()];
        return arrayWorkersInCompany;
    }



    @Override
    public boolean asignServiceWorker(Service service, Worker worker) {
        return false;
    }

    @Override
    public Worker[] removeWorker(long workerId) {
        return new Worker[0];
    }

    @Override
    public Worker editWorker(long workerId) {
        return null;
    }



    @Override
    public Order assignStatusOrder(Order order, Status status) {
        return null;
    }

    @Override
    public Worker[] showAllFreeWorker(Status status) {
        return new Worker[0];
    }
}
