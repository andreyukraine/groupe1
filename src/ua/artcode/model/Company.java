package ua.artcode.model;

import ua.artcode.controler.IModeratorController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 21.08.16.
 */
public class Company {

    private long id;
    private String nameCompany;
    private Location location;
    private String city;
    private String descriptionCompany;
    private String changeStatusCompany;
    private Moderator moderator;

    // TODO reduct добавлен индекс количества воркеров в компании
    private int indexOfWorker;

    // TODO reduct добавлены List commentsOfCompany, servicesOfCompany, workersOfCompany, IModeratorController и indexOfService, indexOfCompany количества воркеров в компании
    private List<Comment> commentsOfCompany = new ArrayList<>();
    private List<Service> servicesOfCompany = new ArrayList<>();
    private List<Worker> workersOfCompany = new ArrayList<>();
    private IModeratorController iModeratorController;
    private long indexOfService;
    private long indexOfCompany;

    // constructors --------------------------------------------------------------------------------
    public Company() {
    }

    public Company(String nameCompany, Location location, String descriptionCompany, Moderator moderator) {
        this.nameCompany = nameCompany;
        this.location = location;
        this.descriptionCompany = descriptionCompany;
        this.moderator = moderator;
        this.changeStatusCompany = "new";
        this.id = indexOfCompany++;
    }

    // TODO reduct 3.09.16 Добавлен перегруженный конструктор
    public Company(String nameCompany, String city, String descriptionCompany) {
        this.nameCompany = nameCompany;
        this.city = city;
        this.descriptionCompany = descriptionCompany;
        this.changeStatusCompany = "new";
        this.id = indexOfCompany++;
    }


    // geters & seters -----------------------------------------------------------------------------

    public Company(IModeratorController iModeratorController) {
        this.iModeratorController = iModeratorController;
    }

    //Добавить сервис в список сервисов компаний

    public Service addService(Service service){
        if (service == null){
            return null;
        }

        servicesOfCompany.add(service);
        indexOfService++;

        return service;
    }

    public Worker addWorker(String workerName){
        if (workerName.length() == 0){
            return null;
        }

        Worker worker = iModeratorController.findWorker(workerName);
        worker.setId(indexOfWorker);
        workersOfCompany.add(worker);
        indexOfWorker++;
        return worker;
    }


    public List<Worker> getAllWorkersInCompany(){

        List<Worker> workersCopy = new ArrayList<>();
        for (int i = 0; i < indexOfWorker; i++) {
            workersCopy.set(i, workersOfCompany.get(i));
        }

        return workersCopy;
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

    public void setWorkers(List<Worker> workersOfCompany) {
        this.workersOfCompany = workersOfCompany;
    }

    public List<Comment> getComments() {
        return commentsOfCompany;
    }


    public void setComments(List<Comment> commentsOfCompany) {
        this.commentsOfCompany = commentsOfCompany;
    }

    public void setService(Service service) {
        this.commentsOfCompany = commentsOfCompany;
    }

    public Moderator getModerator() {
        return moderator;
    }

    public void setModerator(Moderator moderator) {
        this.moderator = moderator;
    }

    public void setIndexOfWorker(int indexOfWorker) {
        this.indexOfWorker = indexOfWorker;
    }

    public long getIndexOfWorker() {
        return indexOfWorker;
    }


    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", location=" + location +
                ", descriptionCompany='" + descriptionCompany + '\'' +
                '}';
    }

    // TODO reduct 3.09.16 старый вариант закомментирован
   /* public long getId() {
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

    public Moderator getModerator() {
        return moderator;
    }

    public void setModerator(Moderator moderators) {
        this.moderator = moderators;
    }

    public void setIndexOfWorker(int indexOfWorker) {
        this.indexOfWorker = indexOfWorker;
    }

    public int getIndexOfWorker() {
        return indexOfWorker;
    }*/
}
