package ua.artcode.controler;

import ua.artcode.model.*;

//import static ua.artcode.test.controller.IWorkerControllerTest.services;


/**
 * Created by IT on 22.08.2016.
 */
public class IWorkerControllerImp implements IWorkerController {
    @Override
    public Worker register(String fullname, String email, String phone, String pass, String descriptionWorker) {

        Worker worker = new Worker(fullname, email, phone, pass, descriptionWorker);
        return worker;
    }

    @Override
    public Service myServices(Worker worker) {
        /*for (int i = 0; i < services.length; i++) {
            if(services[i].getWorkers().equals(worker)) {
                return services[i];
            }
        }*/
        return null;
    }

    @Override
    public Status statusWorker(int statusIndex) {
        return null;
    }

    @Override
    public Order[] ordersWorker(Worker worker) {
        return new Order[0];
    }

    @Override
    public Order[] closeOrder(Order order) {
        return new Order[0];
    }
}
