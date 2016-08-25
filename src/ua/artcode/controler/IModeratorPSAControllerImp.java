package ua.artcode.controler;

import ua.artcode.model.*;
import ua.artcode.run.RunProgramms;

import static ua.artcode.test.controller.IModeratorPSAControllerTest.companies;
import static ua.artcode.test.controller.IModeratorPSAControllerTest.services;
import static ua.artcode.test.controller.IModeratorPSAControllerTest.users;

/**
 * Created by IT on 22.08.2016.
 */
public class IModeratorPSAControllerImp implements IModeratorPSAController {

    @Override
    public ModeratorPSA register(String fullname, String email, String phone, String pass, String role) {
        ModeratorPSA moderatorPSA = new ModeratorPSA(fullname,email,phone,pass,role);
        return moderatorPSA;
    }




    public Service createService(String nameService, String descriptionService) {

        //TODO валиация входных данных
        Service service = new Service(nameService, descriptionService);
        return RunProgramms.appDB.addService(service);

    }

    @Override
    public Service addService(String nameService, String descriptionService) {
        return null;
    }

    public Service editService(long serviceId, Service service) {
        for (int i = 0; (i < services.length) & (services[i] != null); i++) {

                if (services[i].getId() == serviceId) {
                    services[i] = service;
                    return service;
                }

        }
        return service;
    }

    @Override
    public Company[] changeStatusCompany(Company company) {
        return new Company[0];
    }


    public Service[] removeService(long serviceId) {
        for (int i = 0; (i < services.length) & (services[i] != null)  ; i++) {
            if (services[i].getId() == serviceId){
                services[i].setNameService(null);
                services[i].setDescriptionService(null);
                return services;
            }
        }
        return services;
    }

//    public Company[] addCompany(Company company) {
//        for (int i = 0; i < companies.length ; i++) {
//            if (companies[i] == null) {
//                companies[i] = company;
//                return companies;
//            }
//        }
//        return companies;
//    }


    public Company[] removeCompany(long companyId) {
        for (int i = 0; (i < companies.length) & (companies[i] != null);  i++) {
            if (companies[i].getId() == companyId){
                companies[i] = null;
                return companies;
            }
        }
        return companies;
    }

    @Override
    public Comment replyToComment(long commentID, Comment comment) {
        return null;
    }

    @Override
    public Comment removeComment(long commentID) {
        return null;
    }

    @Override
    public User[] addUser(User user) {

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return users;
            }

        }
        return users;
    }

    @Override
    public User[] editUser(long userId, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userId){
                users[i] = user;
                return users;
            }
        }
        return users;
    }

    @Override
    public User[] removeUser(long userId) {
        for (int i = 0; i < users.length ; i++) {
            if (users[i].getId() == userId){
                users[i] = null;
                return users;
            }
        }
        return users;
    }

    @Override
    public Company[] listAllCompany() {
        return companies;
    }

    @Override
    public Service[] listAllService() {
        return services;
    }
}
