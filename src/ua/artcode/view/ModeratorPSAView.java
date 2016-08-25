package ua.artcode.view;

import ua.artcode.controler.IModeratorPSAController;

import java.util.Scanner;

/**
 * Created by IT on 25.08.2016.
 */
public class ModeratorPSAView {

    private Scanner scanner;
    private IModeratorPSAController iModeratorPSAController;

    // constructors --------------------------------------------------------------------------------

    public ModeratorPSAView(Scanner scanner, IModeratorPSAController iModeratorPSAController) {
        this.scanner = scanner;
        this.iModeratorPSAController = iModeratorPSAController;
    }

    // methods --------------------------------------------------------------------------------------

    public void showMainMenu(){
        System.out.println("1.Register");
        System.out.println("2.editCompany");
        System.out.println("3.removeCompany");
        System.out.println("4.findCompany");
        System.out.println("5.addService");
        System.out.println("6.addWorkerToCompany");
        System.out.println("7.asignOrderWorker");
        System.out.println("8.chooseService");
        System.out.println("9.showAllFreeWorker");
        System.out.println("10.asignServiceWorker");
        System.out.println("10.removeWorker");
        System.out.println("10.editWorker");
        System.out.println("10.removeService");
        System.out.println("10.assignStatusOrder");

    }

    //get set-------------------------



}
