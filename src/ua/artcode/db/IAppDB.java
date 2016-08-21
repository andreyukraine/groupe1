package ua.artcode.db;

import ua.artcode.model.Company;

/**
 * crud operation
 */
public interface IAppDB {

    Company createCompany(Company company);
    Company deleteCompany(Company company);
    Company updateCompany(Company company);
    Company findCompany(Company company);
    Company[] getAllCompanies();
    Company[] findByKeyWord(String key, int start, int length);


}
