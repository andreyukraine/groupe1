package ua.artcode.view;

import ua.artcode.controler.IClientController;

import java.util.Scanner;

/**
 * Created by IT on 25.08.2016.
 */
public class ClientView {

    Scanner scanner;
    IClientController iClientController;

    // constructors --------------------------------------------------------------------------------

    public ClientView(Scanner scanner, IClientController iClientController) {
        this.scanner = scanner;
        this.iClientController = iClientController;
    }
}
