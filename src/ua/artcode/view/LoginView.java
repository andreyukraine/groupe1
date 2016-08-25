package ua.artcode.view;

import ua.artcode.controler.IClientController;
import ua.artcode.controler.IModeratorController;
import ua.artcode.controler.IModeratorPSAController;
import ua.artcode.controler.IWorkerController;

import java.util.Scanner;

/**
 * Created by IT on 21.08.2016.
 */
public class LoginView {

    private Scanner scanner;
    private IModeratorPSAController iModeratorPSAController;
    private IModeratorController iModeratorController;
    private IWorkerController iWorkerController;
    private IClientController iClientController;

    // constructors --------------------------------------------------------------------------------

    public LoginView(Scanner scanner, IModeratorPSAController iModeratorPSAController,
                     IModeratorController iModeratorController,IWorkerController iWorkerController,IClientController iClientController) {
        this.scanner = scanner;
        this.iModeratorPSAController = iModeratorPSAController;
    }

    // methods --------------------------------------------------------------------------------------

    public void showLoginMenu() {
        System.out.println("Input login");
        String login = scanner.nextLine();
        System.out.println("Input pass");
        String pass = scanner.nextLine();

        // check if user is in the system

        if("moderatorPSA".equals(login)){
            ModeratorPSAView moderatorPSAView= new ModeratorPSAView(scanner,iModeratorPSAController);
            moderatorPSAView.showMainMenu();
        }else if ("moderator".equals(login)){
            ModeratorView moderatorView = new ModeratorView(scanner, iModeratorController);

        }else if ("worker".equals(login)){
            WorkerView workerView = new WorkerView(scanner, iWorkerController);

        }else if ("client".equals(login)){
            ClientView clientView = new ClientView(scanner, iClientController);
        }
    }

}
