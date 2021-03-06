package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Vaccination;
import com.company.storeapi.model.payload.response.vaccination.ResponseVaccinationDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-18T23:22:58-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
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
