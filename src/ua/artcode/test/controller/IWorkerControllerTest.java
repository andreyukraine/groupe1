package ua.artcode.test.controller;

import ua.artcode.controler.IWorkerController;
import ua.artcode.controler.IWorkerControllerImp;
import ua.artcode.model.Worker;


/**
 * Created by IT on 22.08.2016.
 */
public class IWorkerControllerTest {

    static IWorkerController iWorkerController = new IWorkerControllerImp();

    public static void main(String[] args) {

        Worker worker = new Worker("Lada", "@gmail", "+380", "123457", "molodetc");


        registerTest(worker.getFullname(), worker.getEmail(), worker.getPhone(),
                worker.getPass(), worker.getDescriptionWorker(), worker);
    }


    static boolean registerTest(String fullname, String email, String phone, String pass,
                                String descriptionWorker, Worker worker1) {

        Worker worker = iWorkerController.register(fullname, email, phone, pass, descriptionWorker);

        boolean booleanCheck = worker.getFullname().equals(worker1.getFullname());

        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                booleanCheck, "registerTest", worker1.getFullname(), worker.getFullname());

        return booleanCheck;
    }
}


