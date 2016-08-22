package ua.artcode.controler;

import ua.artcode.model.*;

/**
 * Created by IT on 22.08.2016.
 */
public class IWorkerControllerImp implements IWorkerController {
    @Override
    public Worker register(String nameWorker, Company company, String descriptionWorker, Status status, String email, String pass) {
        return null;
    }

    @Override
    public Service[] myServices(Worker worker) {
        return new Service[0];
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
