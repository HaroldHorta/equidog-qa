package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Company;
import com.company.storeapi.model.payload.response.company.ResponseCompanyDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-25T16:46:16-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public Company toCompany(ResponseCompanyDTO responseCompanyDTO) {
        if ( responseCompanyDTO == null ) {
            return null;
        }

        Company company = new Company();

        company.setId( responseCompanyDTO.getId() );
        company.setNit( responseCompanyDTO.getNit() );
        company.setName( responseCompanyDTO.getName() );
        company.setPhone( responseCompanyDTO.getPhone() );
        company.setAddress( responseCompanyDTO.getAddress() );
        company.setLogo( responseCompanyDTO.getLogo() );

        return company;
    }

    @Override
    public ResponseCompanyDTO toCompanyDto(Company company) {
        if ( company == null ) {
            return null;
        }

        ResponseCompanyDTO responseCompanyDTO = new ResponseCompanyDTO();

        responseCompanyDTO.setId( company.getId() );
        responseCompanyDTO.setNit( company.getNit() );
        responseCompanyDTO.setName( company.getName() );
        responseCompanyDTO.setPhone( company.getPhone() );
        responseCompanyDTO.setAddress( company.getAddress() );
        responseCompanyDTO.setLogo( company.getLogo() );

        return responseCompanyDTO;
    }
}
