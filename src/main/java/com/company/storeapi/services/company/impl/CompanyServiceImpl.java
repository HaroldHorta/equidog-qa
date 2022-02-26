package com.company.storeapi.services.company.impl;

import com.company.storeapi.core.exceptions.enums.LogRefServices;
import com.company.storeapi.core.exceptions.persistence.DataNotFoundPersistenceException;
import com.company.storeapi.core.mapper.CategoryMapper;
import com.company.storeapi.core.mapper.CompanyMapper;
import com.company.storeapi.core.mapper.ProductMapper;
import com.company.storeapi.core.util.Util;
import com.company.storeapi.model.entity.Category;
import com.company.storeapi.model.entity.Company;
import com.company.storeapi.model.entity.Order;
import com.company.storeapi.model.entity.Product;
import com.company.storeapi.model.enums.Status;
import com.company.storeapi.model.payload.request.category.RequestAddCategoryDTO;
import com.company.storeapi.model.payload.request.category.RequestUpdateCategoryDTO;
import com.company.storeapi.model.payload.request.company.RequestAddCompanyDTO;
import com.company.storeapi.model.payload.response.category.ResponseCategoryDTO;
import com.company.storeapi.model.payload.response.category.ResponseListCategoryPaginationDto;
import com.company.storeapi.model.payload.response.company.ResponseCompanyDTO;
import com.company.storeapi.repositories.category.facade.CategoryRepositoryFacade;
import com.company.storeapi.repositories.company.facade.CompanyRepositoryFacade;
import com.company.storeapi.repositories.order.facade.OrderRepositoryFacade;
import com.company.storeapi.repositories.product.facade.ProductRepositoryFacade;
import com.company.storeapi.services.company.CompanyService;
import com.company.storeapi.services.product.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepositoryFacade repositoryFacade;

    private final CompanyMapper categoryMapper;
    private final ProductMapper productMapper;


    @Override
    public List<ResponseCompanyDTO> getAllCompany() {
        List<Company> categoryList = repositoryFacade.getAllCompany();
        return categoryList.stream().map(categoryMapper::toCompanyDto).collect(Collectors.toList());
    }

    @Override
    public ResponseCompanyDTO validateAndGetCompanyById(String id) {
        return categoryMapper.toCompanyDto(repositoryFacade.validateCompany(id));
    }

    @Override
    public ResponseCompanyDTO save(RequestAddCompanyDTO requestAddCompanyDTO) {
        String name = Util.toCapitalLetters(requestAddCompanyDTO.getName().trim());
        String nit = Util.toCapitalLetters(requestAddCompanyDTO.getNit().trim());
        boolean isName = repositoryFacade.existsCompanyByName(name);
        boolean isNit = repositoryFacade.existsCompanyByNit(nit);
        if (isName) {
            throw new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_CORRUPT, "El nombre " + name + " ya existe");
        }
        if (requestAddCompanyDTO.getName().isEmpty()) {
            throw new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_CORRUPT, "El nombre no puede estar vacio");
        }

        if (isNit) {
            throw new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_CORRUPT, "El nit " + nit + " ya existe");
        }
        if (requestAddCompanyDTO.getNit().isEmpty()) {
            throw new DataNotFoundPersistenceException(LogRefServices.ERROR_DATA_CORRUPT, "El nit no puede estar vacio");
        }
        Company company = new Company();
        company.setNit(Util.toCapitalLetters(requestAddCompanyDTO.getNit().trim()));
        company.setName(Util.toCapitalLetters(requestAddCompanyDTO.getName().trim()));
        company.setPhone(Util.toCapitalLetters(requestAddCompanyDTO.getPhone().trim()));
        company.setAddress(Util.toCapitalLetters(requestAddCompanyDTO.getAddress().trim()));
        company.setLogo(Util.toCapitalLetters(requestAddCompanyDTO.getLogo().trim()));
        company.setStatus(Status.ACTIVO);
        company.setCreateAt(new Date());


        return categoryMapper.toCompanyDto(repositoryFacade.saveCompany(company));
    }


}
