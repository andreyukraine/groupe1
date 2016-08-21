package ua.artcode.controler;

import ua.artcode.model.Company;
import ua.artcode.model.MyService;
import ua.artcode.model.User;
import ua.artcode.model.Worker;

/**
 * Created by serhii on 21.08.16.
 */
public interface IManagerController {

    User register(String email,String pass, String fullname, String phone);

    // @param company without id
    // @return company with id
    Company addCompany(Company company);

    Company editCompany(Company company);

    Company findCompany(long id);

    Company deleteCompany(long id);

    Company addService(long companyId, MyService service);

    // start == offset
    MyService[] findServices(String keyword, int start, int length);

    Worker createWorker(Worker worker);

    Worker[] getOwnWorkers(long managerId);

    Company addWorkerToCompany(long companyId, long workerId);

}
