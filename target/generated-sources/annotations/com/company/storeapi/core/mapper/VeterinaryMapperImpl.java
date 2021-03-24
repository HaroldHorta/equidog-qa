package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Veterinary;
import com.company.storeapi.model.payload.response.veterinary.ResponseVeterinaryDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T23:56:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class VeterinaryMapperImpl implements VeterinaryMapper {

    @Override
    public ResponseVeterinaryDTO toVeterinaryDto(Veterinary veterinary) {
        if ( veterinary == null ) {
            return null;
        }

        ResponseVeterinaryDTO responseVeterinaryDTO = new ResponseVeterinaryDTO();

        responseVeterinaryDTO.setId( veterinary.getId() );
        responseVeterinaryDTO.setName( veterinary.getName() );
        responseVeterinaryDTO.setSurname( veterinary.getSurname() );
        if ( veterinary.getCreateAt() != null ) {
            responseVeterinaryDTO.setCreateAt( new SimpleDateFormat().format( veterinary.getCreateAt() ) );
        }
        responseVeterinaryDTO.setProfessionalCard( veterinary.getProfessionalCard() );

        return responseVeterinaryDTO;
    }
}
