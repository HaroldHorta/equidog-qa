package com.company.storeapi.services.company;

import com.company.storeapi.model.payload.request.company.RequestAddCompanyDTO;
import com.company.storeapi.model.payload.response.company.ResponseCompanyDTO;

import java.util.List;

public interface CompanyService {

    List<ResponseCompanyDTO> getAllCompany();

    ResponseCompanyDTO validateAndGetCompanyById(String id);

    ResponseCompanyDTO save(RequestAddCompanyDTO requestAddCompanyDTO);

}
