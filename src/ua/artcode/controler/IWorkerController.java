package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public interface IWorkerController {

    //регистрация
    Worker register(String nameWorker, Company company, String descriptionWorker, Status status, String email, String pass);

    //посмотреть все закрепленные сервисы
    Service[] myServices(Worker worker);

    //статус сотрудника
    Status statusWorker(int statusIndex);

    //заказы сотрудника
    Order[] ordersWorker(Worker worker);

    // закрыть заказ
    Order[] closeOrder(Order order);

}
