package ua.artcode.controler;

import ua.artcode.model.*;

import java.util.List;

/**
 * Created by IT on 21.08.2016.
 */
public interface IWorkerController {

    //регистрация
    Worker register(String fullname, String email, String phone, String pass, String descriptionWorker);

    //посмотреть все закрепленные сервисы
    List<Service> myServices(Worker worker);

    //заказы сотрудника
    Order[] ordersWorker(Worker worker);

    // закрыть заказ
    Order[] closeOrder(Order order);

}
