package ua.artcode.model;

import ua.artcode.controler.IModeratorController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT on 21.08.2016.
 */
public class Worker extends User {

    //w+1
    //w+2
    private long id;
    private Company company;
    private String descriptionWorker;
    private Status status;
    private Rate rateWorker;

    // TODO reduct for delete
    //private Service[] service;
    //private Order[] orders;

    // TODO reduct добавлены List servicesOfWorker, ordersOfWorker, IModeratorController iModeratorController, indexOfOrder

    private List<Service> servicesOfWorker = new ArrayList<>();
    private List<Order> ordersOfWorker = new ArrayList<>();
    private IModeratorController iModeratorController;
    private long indexOfOrder;
    private long indexOfWorker;

    // constructors --------------------------------------------------------------------------------

    public Worker(String fullname, String email, String phone, String pass, String descriptionWorker) {

        super(fullname, email, phone, pass, descriptionWorker);
        this.descriptionWorker = descriptionWorker;
        this.id = indexOfWorker++;
    }

    public Worker(String fullname, String email, String phone, String pass, String descriptionWorker, String role) {

        super(fullname, email, phone, pass, descriptionWorker);
        this.descriptionWorker = descriptionWorker;
        this.id = indexOfWorker++;
    }

    // methods --------------------------------------------------------------------------------
    public Order addOrder(long idOrder){

        Order order = iModeratorController.findOrder(idOrder);
        order.setId(indexOfOrder);
        ordersOfWorker.add(order);
        indexOfOrder++;
        return order;
    }

    // geters & seters -----------------------------------------------------------------------------

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDescriptionWorker() {
        return descriptionWorker;
    }

    public void setDescriptionWorker(String descriptionWorker) {
        this.descriptionWorker = descriptionWorker;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Rate getRateWorker() {
        return rateWorker;
    }

    public void setRateWorker(Rate rateWorker) {
        this.rateWorker = rateWorker;
    }

    public List<Service> getServices() {
        return servicesOfWorker;
    }

    public void setService( List<Service> servicesOfWorker) {
        this.servicesOfWorker = servicesOfWorker;
    }

    public List<Order> getOrders() {
        return ordersOfWorker;
    }

    public void setOrders(List<Order> ordersOfWorker) {
        this.ordersOfWorker = ordersOfWorker;
    }
}
