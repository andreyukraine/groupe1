package ua.artcode.test.controller;

import ua.artcode.controler.IWorkerController;
import ua.artcode.controler.IWorkerControllerImp;
import ua.artcode.db.AppDBImpl;
import ua.artcode.db.IAppDB;
import ua.artcode.model.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by IT on 22.08.2016.
 */
public class IWorkerControllerTest {

    static IWorkerController iWorkerController = new IWorkerControllerImp();
    static IAppDB copyAppDB = new AppDBImpl();

    /*public static Service[] services = new Service[10];
    public static Worker[] workers = new Worker[10];
    public static Order[] orders = new Order[10];*/

    // TODO заменено на динамические массивы
    private List<Service> services = new ArrayList<>();
    private List<Worker> workers = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {

        //Worker worker = new Worker();
        Worker worker = copyAppDB.addWorker("Lada", "@gmail", "+380", "123457", "molodetc", "Worker");
        //workers[0] = worker;

        Service service = new Service("CutWood", "Hydystch");
        copyAppDB.addService(service);

        Service service1 = new Service("CutWood1", "Hydystch");
        copyAppDB.addService(service1);

        Service service2 = new Service("CutWood2", "Hydystch");
        copyAppDB.addService(service2);

        Service service3 = new Service("CutWood3", "Hydystch");
        copyAppDB.addService(service3);

        Service service4 = new Service("CutWood4", "Hydystch");
        copyAppDB.addService(service4);


        /*services[0] = service;
        services[1] = service1;
        services[2] = service2;
        services[3] = service3;
        services[4] = service4;*/

        //service.setWorkers(workers);

        //Client client = new Client("Gena", "krokodil@mail.ru", "245", "cheburashka", "client");
        Client client = copyAppDB.addClient("Gena", "krokodil@mail.ru", "245", "cheburashka", "client");
        //Order order = new Order(10, service, client, "cut surrouded trees");
        Order order = copyAppDB.addOrder(10, service, client, "cut surrouded trees");

        //orders[0] = order;

        //worker.setOrders(order);
        copyAppDB.asignOrderToWorker(order, worker);


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


