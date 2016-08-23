package ua.artcode.controler;
import ua.artcode.model.*;

/**
 * Created by IT on 21.08.2016.
 */
public interface IModeratorPSAController {

    //регистрация
    ModeratorPSA register(String nameModerator, String email, String pass);

    //добавить сервис
    Service createService(String nameService, String descriptionService);

    //удалить сервис
    Service removeService(long serviceId);

    //добавить компанию
    Company addCompany(Company company);

    //удалить компанию
    Company removeCompany(long companyId);

    //ответить на коментарий
    Comment replyToComment(long commentID, Comment comment);

    //удалить комментарий
    Comment removeComment(long commentID);

    //добавить пользователя
    User addUser(User user);

    //изменить пользователя
    User editUser(long userId, User user);

    //удалить пользователя
    User removeUser(long userId);

    //посмотреть все компании
    Company[] listAllCompany();

    //редактировать сервис
    Service editService(long id);

    //посмотреть все сервисы
    Service[] listAllService();


}
