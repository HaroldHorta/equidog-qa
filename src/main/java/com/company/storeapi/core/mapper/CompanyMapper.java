package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Company;
import com.company.storeapi.model.payload.response.company.ResponseCompanyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CompanyMapper {

    Company toCompany(ResponseCompanyDTO responseCompanyDTO);

    ResponseCompanyDTO toCompanyDto(Company company);

}
