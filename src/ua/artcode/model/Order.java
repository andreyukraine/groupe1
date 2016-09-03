package ua.artcode.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IT on 21.08.2016.
 */
public class Order {

    private long id;
    private String numberOrder;
    private Date createdTime;

    // не правильно, лид тайм int
    private int leadTime;
    private Service service;
    private Client client;  //изменила юзер на клиент
    private Worker worker;
    private String descriptionOrder;
    private Status status;
    private List<Comment> comments = new ArrayList<>();
    private long indexOfOrder;

    // constructors --------------------------------------------------------------------------------


    public Order(int leadTime, Service service, Client client, String descriptionOrder) {
        this.leadTime = leadTime;
        this.service = service;
        this.client = client;
        this.descriptionOrder = descriptionOrder;
        this.id = indexOfOrder++;

    }

    public Order() {
    }

    // geters & seters -----------------------------------------------------------------------------

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(int leadTime) {
        this.leadTime = leadTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getDescriptionOrder() {
        return descriptionOrder;
    }

    public void setDescriptionOrder(String descriptionOrder) {
        this.descriptionOrder = descriptionOrder;
    }
}
