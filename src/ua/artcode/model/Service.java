package ua.artcode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 21.08.16.
 */
public class Service {

    private long id;
    private String nameService;
    private String descriptionService;
    private List<Worker> workers = new ArrayList();
    private List<Comment> commentsService = new ArrayList();
    private Rate rateService;
    private long indexOfService;

    // constructors --------------------------------------------------------------------------------

    public Service(String nameService, String descriptionService) {
        this.nameService = nameService;
        this.descriptionService = descriptionService;
        this.id = indexOfService++;
    }

    public Service() {
    }

    // geters & seters -----------------------------------------------------------------------------


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Comment> getCommentsService() {
        return commentsService;
    }

    public void setCommentsService(List<Comment> commentsService) {
        this.commentsService = commentsService;
    }

    public Rate getRateService() {
        return rateService;
    }

    public void setRateService(Rate rateService) {
        this.rateService = rateService;
    }
}
