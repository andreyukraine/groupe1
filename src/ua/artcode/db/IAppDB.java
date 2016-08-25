package ua.artcode.db;

import ua.artcode.model.Company;
import ua.artcode.model.Service;

/**
 * crud operation
 */
public interface IAppDB {

    //
    Service addService(Service service);
    Service updateService(long serviceId, Service service);
}
