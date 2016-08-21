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


    // создаем компанию
    Company addCompany(Company company);


    // изменяем данные про компанию
    Company editCompany(Company company);

    // ищем компанию
    Company findCompany(long id);

    // удаляем компанию
    Company deleteCompany(long id);

    // добавить сервис компании
    Company addService(long companyId, MyService service);

    // start == offset

    // поиск сервиса по слову
    MyService[] findServices(String keyword, int start, int length);

    // создаем сотрудника
    Worker createWorker(Worker worker);

    // посмотреть все сотрудников
    Worker[] getOwnWorkers(long managerId);

    // добавить сотрудника в компанию
    Company addWorkerToCompany(long companyId, long workerId);

}
