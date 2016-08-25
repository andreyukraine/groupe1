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
        System.out.println("1.Add service");
    }

    //get set-------------------------



}
