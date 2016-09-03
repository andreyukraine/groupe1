package ua.artcode.db;

import ua.artcode.exceptions.ServiceNotUpdateException;
import ua.artcode.model.*;

/**
 * crud operation
 */
public interface IAppDB {

    //
    Service addService(Service service);
    Service updateService(long serviceId, Service service) throws ServiceNotUpdateException;


    boolean removeService(String nameService);
    Service editService(String nameService, String descriptionSevice);
    Service getService(String nameService);
    Service findService(String nameService);

    Company addCompany(String nameCompany, String city, String descriptionCompany);
    // Назначить заказу работника

    Company addCompany(Company company);
    boolean removeCompany(String nameCompany);
    Company editCompany(String oldNameCompany, String newNameCompany, String description);
    Company getCompany(String nameCompany);
    Company findCompany(String nameCompany);

    boolean removeModerator(String nameOfModerator);
    Moderator addModerator(String fullname, String email, String phone, String pass, String role);

    Worker addWorker(String fullname, String email, String phone, String pass, String descriptionWorker, String role);
    boolean removeWorker(String workerName);

    Client addClient(String fullname, String email, String phone, String pass, String role);
    boolean removeClient(String nameClient);

    Worker findWorker(String nameWorker);
    Worker editWorker(String oldWorkerName, String newWorkerName, String descriptionWorker);

    Order findOrder(long idOrder);
    Order addOrder(int leadTime, Service service, Client client, String descriptionOrder);
    boolean removeOrder(long idOrder);
    Order editOrder(long idOrder, String newDescription);

    // Назначить статус заказа
    Order assignStatusOrder(Order order, Status status);

    // Назначить заказу работника
    Order asignOrderToWorker(Order order, Worker worker);

}
