package ua.artcode.model;

/**
 * Created by serhii on 21.08.16.
 */
public class Company {

    private long id;
    private String nameCompany;
    private Location location;
    private String descriptionCompany;

    private Worker[] workers;
    private Comment[] comments;
    private Moderator[] moderators;

    // constructors --------------------------------------------------------------------------------
    public Company(String nameCompany, Location location, String descriptionCompany, Worker[] workers, Moderator[] moderators) {
        this.nameCompany = nameCompany;
        this.location = location;
        this.descriptionCompany = descriptionCompany;
        this.workers = workers;
        this.moderators = moderators;
    }

    // geters & seters -----------------------------------------------------------------------------
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescriptionCompany() {
        return descriptionCompany;
    }

    public void setDescriptionCompany(String descriptionCompany) {
        this.descriptionCompany = descriptionCompany;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Moderator[] getModerators() {
        return moderators;
    }

    public void setModerators(Moderator[] moderators) {
        this.moderators = moderators;
    }
}
