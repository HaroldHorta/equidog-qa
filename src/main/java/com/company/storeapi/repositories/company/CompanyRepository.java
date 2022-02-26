package com.company.storeapi.repositories.company;

import com.company.storeapi.model.entity.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company,String> {

    Boolean existsCompanyByName(String name);
    Boolean existsCompanyByNit(String name);

}
