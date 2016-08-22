package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by serhii on 21.08.16.
 */
public interface IModeratorController {

    // @param company without id
    // @return company with id

    // зарегистрация
    Moderator register(String nameModerator, String email, String pass, String role, Company company);

    // создаем компанию
    Company addCompany(Company company);

    // изменяем данные про компанию
    Company editCompany(Company company);

    // ищем компанию
    Company findCompany(long companyId);

    // удаляем компанию
    Company removeCompany(long companyId);

    // добавить сервис компании
    Company addService(long companyId, Service service);

    // добавить сотрудника в компанию
    Company addWorkerToCompany(long companyId, long workerId);

    //передаем заказ в работу сотруднику
    Worker asignOrderWorker(Order order, long workerId);

    //выбрать сервис
    Service[] chooseService();

    // посмотреть всех сотрудников
    Worker[] getOwnWorkers(long managerId);

    //посмотреть всех свободных сотрудников
    Worker[] showAllFreeWorker(Status status);

    //назначить сервису работника
    Service asignServiceWorker(Worker worker);
}
