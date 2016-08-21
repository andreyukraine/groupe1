package ua.artcode.model;

import java.time.LocalDateTime;

/**
 * Created by IT on 21.08.2016.
 */
public class Worker {

    long id;
    String nameWorker;
    String email;
    String pass;
    Company company;
    String descriptionWorker;
    Status status;
    String role;
    Rate rateWorker;
    Service[] service;
    Order[] orders;


    // constructors --------------------------------------------------------------------------------

    public Worker(String nameWorker, Company company, String descriptionWorker, Status status, String email, String pass, String role) {
        this.nameWorker = nameWorker;
        this.company = company;
        this.descriptionWorker = descriptionWorker;
        this.status = status;
        this.email = email;
        this.pass = pass;
        this.role = role;
    }


    // geters & seters -----------------------------------------------------------------------------

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

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

    public Service[] getService() {
        return service;
    }

    public void setService(Service[] service) {
        this.service = service;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}
