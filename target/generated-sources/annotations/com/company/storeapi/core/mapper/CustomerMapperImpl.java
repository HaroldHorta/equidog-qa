package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Customer;
import com.company.storeapi.model.payload.request.customer.RequestUpdateCustomerDTO;
import com.company.storeapi.model.payload.response.customer.ResponseCustomerDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T19:16:12-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toCustomer(ResponseCustomerDTO requestAddCustomerDTO) {
        if ( requestAddCustomerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( requestAddCustomerDTO.getId() );
        customer.setName( requestAddCustomerDTO.getName() );
        customer.setTypeDocument( requestAddCustomerDTO.getTypeDocument() );
        customer.setNroDocument( requestAddCustomerDTO.getNroDocument() );
        customer.setEmail( requestAddCustomerDTO.getEmail() );
        customer.setAddress( requestAddCustomerDTO.getAddress() );
        customer.setPhone( requestAddCustomerDTO.getPhone() );
        customer.setStatus( requestAddCustomerDTO.getStatus() );

        return customer;
    }

    @Override
    public ResponseCustomerDTO toCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        ResponseCustomerDTO responseCustomerDTO = new ResponseCustomerDTO();

        responseCustomerDTO.setId( customer.getId() );
        responseCustomerDTO.setName( customer.getName() );
        responseCustomerDTO.setTypeDocument( customer.getTypeDocument() );
        responseCustomerDTO.setNroDocument( customer.getNroDocument() );
        responseCustomerDTO.setEmail( customer.getEmail() );
        responseCustomerDTO.setAddress( customer.getAddress() );
        responseCustomerDTO.setPhone( customer.getPhone() );
        responseCustomerDTO.setStatus( customer.getStatus() );

        return responseCustomerDTO;
    }

    @Override
    public void updateCustomerFromDto(RequestUpdateCustomerDTO updateCustomerDto, Customer customer) {
        if ( updateCustomerDto == null ) {
            return;
        }

        if ( updateCustomerDto.getName() != null ) {
            customer.setName( updateCustomerDto.getName() );
        }
        if ( updateCustomerDto.getEmail() != null ) {
            customer.setEmail( updateCustomerDto.getEmail() );
        }
        if ( updateCustomerDto.getAddress() != null ) {
            customer.setAddress( updateCustomerDto.getAddress() );
        }
        if ( updateCustomerDto.getPhone() != null ) {
            customer.setPhone( updateCustomerDto.getPhone() );
        }
    }
}
