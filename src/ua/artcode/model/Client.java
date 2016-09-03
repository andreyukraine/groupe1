package ua.artcode.model;

import ua.artcode.controler.IModeratorController;

/**
 * Created by IT on 22.08.2016.
 */
public class Client extends User {


    // TODO reduct добавлен контроллер
    private IModeratorController iModeratorController;


    // constructors --------------------------------------------------------------------------------

    public Client(String fullname, String email, String phone, String pass, String role) {
        super(fullname, email, phone, pass, role);
    }

    public Client() {
    }

    // geters & seters -----------------------------------------------------------------------------

}
