package com.company.storeapi.repositories.company.facade.impl;

import com.company.storeapi.core.constants.MessageError;
import com.company.storeapi.core.exceptions.enums.LogRefServices;
import com.company.storeapi.core.exceptions.persistence.DataNotFoundPersistenceException;
import com.company.storeapi.model.entity.Company;
import com.company.storeapi.repositories.company.CompanyRepository;
import com.company.storeapi.repositories.company.facade.CompanyRepositoryFacade;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CompanyRepositoryFacadeImpl implements CompanyRepositoryFacade {

    private final CompanyRepository companyRepository;

    public CompanyRepositoryFacadeImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompany() {
        try {
            return Optional.of(companyRepository.findAll())
                    .orElseThrow(()-> new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_NOT_FOUND, "No se encontraron registros"));
        }catch (EmptyResultDataAccessException er){
            throw new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_NOT_FOUND, MessageError.NO_SE_HA_ENCONTRADO_LA_ENTIDAD);
        }catch (DataAccessException er){
            throw new DataNotFoundPersistenceException(LogRefServices.LOG_REF_SERVICES, MessageError.ERROR_EN_EL_ACCESO_LA_ENTIDAD,er);
        }
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company validateCompany(String id) {
        return companyRepository.findById(id).orElseThrow(()-> new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_NOT_FOUND, "No se encontraron registros"));

    }

    @Override
    public boolean existsCompanyByName(String name) {
        return companyRepository.existsCompanyByName(name);
    }

    @Override
    public boolean existsCompanyByNit(String nit) {
        return companyRepository.existsCompanyByNit(nit);
    }
}
