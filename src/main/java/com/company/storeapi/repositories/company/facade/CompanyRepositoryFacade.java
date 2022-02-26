package com.company.storeapi.repositories.company.facade;

import com.company.storeapi.model.entity.Company;

import java.util.List;

public interface CompanyRepositoryFacade {

    List<Company> getAllCompany();

    Company saveCompany(Company company);

    Company validateCompany(String id);

    boolean existsCompanyByName(String name);

    boolean existsCompanyByNit(String nit);
}
