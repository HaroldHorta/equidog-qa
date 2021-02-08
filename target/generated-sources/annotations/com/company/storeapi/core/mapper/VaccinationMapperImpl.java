package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Vaccination;
import com.company.storeapi.model.payload.response.vaccination.ResponseVaccinationDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-07T22:49:44-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class VaccinationMapperImpl implements VaccinationMapper {

    @Override
    public ResponseVaccinationDTO toVaccinationDto(Vaccination vaccination) {
        if ( vaccination == null ) {
            return null;
        }

        ResponseVaccinationDTO responseVaccinationDTO = new ResponseVaccinationDTO();

        responseVaccinationDTO.setId( vaccination.getId() );
        responseVaccinationDTO.setDescription( vaccination.getDescription() );
        responseVaccinationDTO.setStatus( vaccination.getStatus() );
        if ( vaccination.getCreateAt() != null ) {
            responseVaccinationDTO.setCreateAt( new SimpleDateFormat().format( vaccination.getCreateAt() ) );
        }

        return responseVaccinationDTO;
    }
}
