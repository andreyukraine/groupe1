package ua.artcode.db;

import ua.artcode.exceptions.ServiceNotUpdateException;
import ua.artcode.model.*;

import java.util.List;

/**
 * Created by serhii on 21.08.16.
 */
public class AppDBImpl implements IAppDB {

    private List<Company> companies;
    private List<Client> clients;
    private List<Moderator> moderator;
    private List<Service> services;


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

    public AppDBImpl(List<Company> companies, List<Client> clients, List<Moderator> moderator, List<Service> services) {
        this.companies = companies;
        this.clients = clients;
        this.moderator = moderator;
        this.services = services;
    }
    // geters & seters -----------------------------------------------------------------------------


    public List<Company> getCompanies() {
        return companies;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Moderator> getModerator() {
        return moderator;
    }

    public void setModerator(List<Moderator> moderator) {
        this.moderator = moderator;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
