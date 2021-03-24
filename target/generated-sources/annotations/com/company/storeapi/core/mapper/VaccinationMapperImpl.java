package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Vaccination;
import com.company.storeapi.model.payload.response.vaccination.ResponseVaccinationDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T23:56:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
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
        responseVaccinationDTO.setCreateAt( vaccination.getCreateAt() );
        responseVaccinationDTO.setLot( vaccination.getLot() );
        responseVaccinationDTO.setObservation( vaccination.getObservation() );

        return responseVaccinationDTO;
    }
}
