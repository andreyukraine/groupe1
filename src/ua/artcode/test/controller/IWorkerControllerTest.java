package ua.artcode.test.controller;

import ua.artcode.controler.IWorkerController;
import ua.artcode.controler.IWorkerControllerImp;
import ua.artcode.model.Company;
import ua.artcode.model.Status;
import ua.artcode.model.Worker;

/**
 * Created by IT on 22.08.2016.
 */
public class IWorkerControllerTest {

    static IWorkerController iWorkerController = new IWorkerControllerImp();
    public static void main(String[] args) {
        Company company = new Company("Marmelad", null, "descriptionMarmelad", null);
        Status status = new Status();

        Worker worker = new Worker("Lada", "@yandex.com", "063153","1234567", "worker", company, "bla", status);


        registerTest("Lada",company, "bla", status,"@yandex.com","1234567", worker);
    }


    static boolean registerTest(String fullname, Company company, String descriptionWorker,
                                Status status, String email, String pass, Worker worker1){
        Worker worker = iWorkerController.register(fullname, company, descriptionWorker, status, email, pass);

        boolean booleanCheck = worker.getFullname().equals(worker1.getFullname());
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                booleanCheck , "registerTest", worker1.getFullname(), worker.getFullname());
        return booleanCheck;
    }
}


