package ua.artcode.model;


/**
 * Created by IT on 21.08.2016.
 */
public class ModeratorPSA {

    long id;
    String nameModerator;
    String email;
    String pass;

    Company[] companies;
    Moderator[] moderators;
    Worker[] workers;
    Service[] services;
    Comment[] comments;

    // constructors --------------------------------------------------------------------------------

    public ModeratorPSA(String nameModerator, String email, String pass) {
        this.nameModerator = nameModerator;
        this.email = email;
        this.pass = pass;
    }


    // geters & seters -----------------------------------------------------------------------------

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
