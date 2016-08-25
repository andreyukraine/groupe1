package ua.artcode.db;

import ua.artcode.model.Company;
import ua.artcode.model.Moderator;
import ua.artcode.model.Service;
import ua.artcode.model.User;

import static ua.artcode.test.controller.IModeratorPSAControllerTest.services;

/**
 * Created by serhii on 21.08.16.
 */
public class AppDBImpl implements IAppDB {

    private Company[] companies;
    private User[] users;
    private Moderator[] moderator;
    private Service[] services1 = new Service[10];


    public Service addService(Service service) {
        for (int i = 0; i < services1.length; i++) {
            if (services1[i] == null) {
                services1[i] = service;
                return service;
            }
        }
        return null;
    }

    public Service updateService(long serviceId, Service service){
        for (int i = 0; i < services1.length; i++) {
            if (services1[i].getId() == serviceId){
                services1[i] = service;
                return service;
            }
        }
        return null;
    }
    // constructors --------------------------------------------------------------------------------

    // geters & seters -----------------------------------------------------------------------------


}
