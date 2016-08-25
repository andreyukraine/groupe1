package ua.artcode.model;

import java.util.Date;

/**
 * Created by IT on 21.08.2016.
 */
public class Order {

    private long id;
    private String numberOrder;
    private Date createdTime;
    private Date leadTime;
    private Service service;
    private User user;
    private Worker worker;
    private String descriptionOrder;
    private Status status;

    // constructors --------------------------------------------------------------------------------


    public Order(String numberOrder, Date createdTime, Date leadTime, Service service, User user, Worker worker, String descriptionOrder, Status status) {
        this.numberOrder = numberOrder;
        this.createdTime = createdTime;
        this.leadTime = leadTime;
        this.service = service;
        this.user = user;
        this.worker = worker;
        this.descriptionOrder = descriptionOrder;
        this.status = status;
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

    public Date getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Date leadTime) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
