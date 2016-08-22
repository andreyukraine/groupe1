package ua.artcode.test.controller;

import ua.artcode.controler.IModeratorController;
import ua.artcode.controler.IModeratorControllerImp;
import ua.artcode.model.Company;
import ua.artcode.model.Moderator;

/**
 * Created by IT on 21.08.2016.
 */

public class IModeratorControllerTest {
    //TODO test
    static IModeratorController iModeratorController = new IModeratorControllerImp();
    public static void main(String[] args) {
        Company company = new Company("Рога&Копыта", null, "descriptionCompany", null, null);
        Moderator moderator = new Moderator("Andrey","a.webears@gmail.com", "+380","123456", "moderator", company);
        registerTest("Andrey","a.webears@gmail.com","123456", "moderator", company, moderator);
    }


    static boolean registerTest(String fullname, String email, String pass, String role, Company company, Moderator moderator1){
        Moderator moderator = iModeratorController.register(fullname, email, pass, role, company);
        boolean booleanrez = moderator.getFullname().equals(moderator1.getFullname());
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                booleanrez , "registerTest", moderator1.getFullname(), moderator.getFullname());
        return booleanrez;
    }


}
