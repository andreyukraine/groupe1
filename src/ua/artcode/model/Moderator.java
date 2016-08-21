package ua.artcode.model;

/**
 * Created by IT on 21.08.2016.
 */
public class Moderator {

    long id;
    String nameModerator;
    String email;
    String pass;
    String role;
    Company company;
    Worker[] workers;
    Service[] services;
    Order[] orders;
    Comment[] comments;


    // constructors --------------------------------------------------------------------------------

    public Moderator(String nameModerator, String email, String pass, String role, Company company) {
        this.nameModerator = nameModerator;
        this.email = email;
        this.pass = pass;
        this.role = role;
        this.company = company;
    }

    // geters & seters -----------------------------------------------------------------------------

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameModerator() {
        return nameModerator;
    }

    public void setNameModerator(String nameModerator) {
        this.nameModerator = nameModerator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
