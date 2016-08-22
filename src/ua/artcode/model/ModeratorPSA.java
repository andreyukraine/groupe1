package ua.artcode.model;


/**
 * Created by IT on 21.08.2016.
 */
public class ModeratorPSA extends User{



    Company[] companies;
    Moderator[] moderators;
    Worker[] workers;
    Service[] services;
    Comment[] comments;

    // constructors --------------------------------------------------------------------------------

    public ModeratorPSA(String email, String fullname, String phone, String pass, String role, Company[] companies) {
        super(email, fullname, phone, pass, role);
    }


    // geters & seters -----------------------------------------------------------------------------


    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public Moderator[] getModerators() {
        return moderators;
    }

    public void setModerators(Moderator[] moderators) {
        this.moderators = moderators;
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

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
