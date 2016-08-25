package ua.artcode.run;

import ua.artcode.controler.*;
import ua.artcode.db.AppDBImpl;
import ua.artcode.db.IAppDB;
import ua.artcode.view.LoginView;

import java.util.Scanner;

/**
 * Created by IT on 25.08.2016.
 */
public class RunProgramms {

    public static final IAppDB appDB = new AppDBImpl();

    public static void main(String[] args) {

        IModeratorPSAController iModeratorPSAController = new IModeratorPSAControllerImp();
        IModeratorController iModeratorController = new IModeratorControllerImp();
        IWorkerController iWorkerController = new IWorkerControllerImp();
        IClientController iClientController = new IClientCotrollerImp();




        LoginView loginView =
                new LoginView(new Scanner(System.in),iModeratorPSAController, iModeratorController,iWorkerController,iClientController);
        loginView.showLoginMenu();
    }

}
