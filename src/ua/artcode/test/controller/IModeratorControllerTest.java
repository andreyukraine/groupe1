package ua.artcode.test.controller;

import ua.artcode.controler.IModeratorController;
import ua.artcode.controler.IModeratorControllerImp;
import ua.artcode.model.Company;
import ua.artcode.model.Moderator;

/**
 * Created by IT on 21.08.2016.
 */

public class IModeratorControllerTest {
    static IModeratorController iModeratorController = new IModeratorControllerImp();
    public static void main(String[] args) {
        Company company = new Company("gggg", null, "ttt", null, null);
        String name = "rrr";
        Moderator moderator = new Moderator(name,"rt","123","re",company);
        registerTest(name,"rt","123","re",company, moderator );

    }



    static boolean registerTest(String nameModerator, String email, String pass, String role, Company company, Moderator moderator1){

        Moderator moderator = iModeratorController.register(nameModerator, email, pass, role, company);
        boolean booleanrez = moderator.getNameModerator().equals(moderator1.getNameModerator());
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                booleanrez , "registerTest", moderator1.getNameModerator(), moderator.getNameModerator());
        return booleanrez;
    }

}
