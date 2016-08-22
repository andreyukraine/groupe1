package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by IT on 22.08.2016.
 */
public class IModeratorPSAControllerImp implements IModeratorPSAController {
    @Override
    public ModeratorPSA register(String nameModerator, String email, String pass) {
        return null;
    }

    @Override
    public Service addService(String nameService, String descriptionService) {
        return null;
    }

    @Override
    public Service removeService(long serviceId) {
        return null;
    }

    @Override
    public Company addCompany(Company company) {
        return null;
    }

    @Override
    public Company removeCompany(long companyId) {
        return null;
    }

    @Override
    public Comment replyToComment(long commentID, Comment comment) {
        return null;
    }

    @Override
    public Comment removeComment(long commentID) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User editUser(long userId, User user) {
        return null;
    }

    @Override
    public User removeUser(long userId) {
        return null;
    }

    @Override
    public Company[] listAllCompany() {
        return new Company[0];
    }
}
