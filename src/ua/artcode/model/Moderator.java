package ua.artcode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT on 21.08.2016.
 */
public class Moderator extends User{


    private long id;
    private Company company;
    private List<Service> myServices = new ArrayList<>();
    private List<Company> myCompanies = new ArrayList<>();
    private List<Worker> myWorkers = new ArrayList<>();
    private List<Client> myClients = new ArrayList<>();
    private List<Order> myOrders = new ArrayList<>();
    private List<Comment> myComments = new ArrayList<>();
    private long indexOfModerator;


    // constructors --------------------------------------------------------------------------------

   /* public Moderator(String fullname, String email, String phone, String pass, String role, Company company) {
        super(fullname, email, phone, pass, role);
        this.company = company;
    }*/

    public Moderator(String fullname ,String email, String phone, String pass, String role) {
        super(fullname, email, phone, pass, role);
        this.id = indexOfModerator++;
    }

    // geters & seters -----------------------------------------------------------------------------


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Worker> getWorkers() {
        return myWorkers;
    }

    public void setWorkers(List<Worker>  myWorkers) {
        this. myWorkers =  myWorkers;
    }

    public List<Service> getServices() {
        return myServices;
    }

    public void setServices(List<Service> myServices) {
        this.myServices = myServices;
    }

    public List<Order> getOrders() {
        return myOrders;
    }

    public void setOrders(List<Order> orders) {
        this.myOrders = orders;
    }

    public List<Comment> getComments() {
        return myComments;
    }

    public void setComments(List<Comment> comments) {
        this.myComments = comments;
    }
}
