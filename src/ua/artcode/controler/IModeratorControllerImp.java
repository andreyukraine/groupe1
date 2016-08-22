package ua.artcode.controler;

import ua.artcode.controler.IModeratorController;
import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public class IModeratorControllerImp implements IModeratorController {

    @Override
    public Moderator register(String fullname, String email, String pass, String role, Company company) {
        Moderator moderator= new Moderator(fullname,email,pass,"","",company);
        return moderator;
    }

    @Override
    public Company addCompany(Company company) {
        return null;
    }

    @Override
    public Company editCompany(Company company) {
        return null;
    }

    @Override
    public Company findCompany(long companyId) {
        return null;
    }

    @Override
    public Company removeCompany(long companyId) {
        return null;
    }

    @Override
    public Company addService(long companyId, Service service) {
        return null;
    }

    @Override
    public Company addWorkerToCompany(long companyId, long workerId) {
        return null;
    }

    @Override
    public Worker asignOrderWorker(Order order, long workerId) {
        return null;
    }

    @Override
    public Service[] chooseService() {
        return new Service[0];
    }

    @Override
    public Worker[] getOwnWorkers(long managerId) {
        return new Worker[0];
    }

    @Override
    public Worker[] showAllFreeWorker(Status status) {
        return new Worker[0];
    }

    @Override
    public Service asignServiceWorker(Worker worker) {
        return null;
    }
}
