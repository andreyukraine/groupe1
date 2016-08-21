package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public interface IUserController {

    // зарегистрирация
    User register(String email, String fullname, String phone, String pass, String role);

    //поиск сервиса
    Service[] searchService();

    //создать заказ
    Order addOrder(Company company, Service service);

    //посмотреть свои заказы
    Order[] listOrders(User user);

    //оставить комментарий сервису
    Comment addCommentService (Service service);

    //оставить комментарий компании
    Comment addCommentCompany (Company company);

    //оставить комментарий сотруднику
    Comment addCommentWorker (Worker worker);

    //оставить комментарий про систему
    Comment addCommentPSA();

}
