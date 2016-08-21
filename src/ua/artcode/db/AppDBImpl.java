package ua.artcode.db;

import ua.artcode.model.Company;
import ua.artcode.model.User;

/**
 * Created by serhii on 21.08.16.
 */
public class AppDBImpl implements IAppDB {

    private Company[] companies;
    private User[] users;

    public Company createCompany(Company company) {
        return null;
    }

    public Company deleteCompany(Company company) {
        return null;
    }

    public Company updateCompany(Company company) {
        return null;
    }

    public Company findCompany(Company company) {
        return null;
    }

    public Company[] getAllCompanies() {
        return new Company[0];
    }

    public Company[] findByKeyWord(String key, int start, int length) {
        return new Company[0];
    }
}
