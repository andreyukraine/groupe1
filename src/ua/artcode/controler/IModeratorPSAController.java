package ua.artcode.controler;
import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public interface IModeratorPSAController {

    //регистрация
    ModeratorPSA register(String fullname, String email, String phone, String pass, String role);

    public Service addService(String nameService, String descriptionService);

    //добавить сервис

    Service createService(String nameService, String descriptionService);

    //удалить сервис
    Service[] removeService(long serviceId);

    //редактировать сервис
    Service editService(long serviceId, Service service);

    //добавить компанию
    //Company[] addCompany(Company company);

    //подтвердить/отказать добавление компании
    Company[] changeStatusCompany(Company company);

    //удалить компанию
    Company[] removeCompany(long companyId);

    //ответить на коментарий сервиса PSA
    Comment replyToComment(long commentID, Comment comment);

    //удалить комментарий сервиса PSA
    Comment removeComment(long commentID);

    //добавить пользователя
    User[] addUser(User user);

    //изменить пользователя
    User[] editUser(long userId, User user);

    //удалить пользователя
    User[] removeUser(long userId);

    //посмотреть все компании
    Company[] listAllCompany();

    //посмотреть все сервисы
    Service[] listAllService();


}
