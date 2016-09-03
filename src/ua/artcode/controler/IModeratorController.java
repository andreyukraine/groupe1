package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by serhii on 21.08.16.
 */
public interface IModeratorController {

    // @param company without id
    // @return company with id

    // зарегистрация
    //TODO  reducted удалено компанию от модератора
    Moderator register(String fullname, String email, String phone, String pass, String role);

    // создаем компанию
    Company addCompany(String nameCompany, String city, String descriptionCompany);

    // изменяем данные про компанию
    Company editCompany(String oldNameCompany, String newNameCompany, String description);

    // ищем компанию в базе приложения по имени
    Company findCompany(String nameCompany);

    //Найти воркера в базе приложения по имени
    Worker findWorker(String nameWorker);

    // удаляем компанию
    boolean removeCompany(String nameCompany);

    void showMyCompany();

    // добавить сервис в список сервисов модератора
    Service addService(String nameService);

    //Присвоить сервис компании
    Company asignServiceToCompany(String companyName, String serviceName);

    // Удаление сервиса со списка сервисов модератора
    boolean removeService(String serviceName);

    // Наяти сервис среди сервисов модератора
    Service findService(String serviceName);

    //выбрать сервис
    Service[] chooseService(Service ... args);

    Worker createWorker(String fullName, String email, String phone, String pass, String description, String role);

    //удалить сотрудника с компании
    boolean removeWorker(String workerName);

    // добавить сотрудника в компанию
    Company asignWorkerToCompany(String companyName, String workerName);

    void showMyWorkers();

    //передаем заказ в работу сотруднику
    Worker asignOrderWorker(long idOrder, String workerName);

    // посмотреть всех сотрудников
    // TODO reduct добавлен параметр компания (посмотреть всех сотрудников в компании)
    void showAllWorkersInCompany(String companyName);

    //назначить сервису работника
    //TODO reducted добавлин параметр service и вывод boolean
    boolean asignServiceWorker(Service service, Worker worker);

    // редактировать сотрудника
    Worker editWorker (String oldWorkerName, String newWorkerName, String descriptionWorker);

    // изменить статус заказа
    Order assignStatusOrder(Order order, Status status);
    // присвоить ордеру воркера
    Order asignOrderToWorker(Order order, Worker worker);
    //посмотреть всех свободных сотрудников
    void showAllFreeWorker(Status status);


    Order findOrder(long idOrder);
}
