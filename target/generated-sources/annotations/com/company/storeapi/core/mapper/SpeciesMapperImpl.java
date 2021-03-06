package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Species;
import com.company.storeapi.model.payload.response.species.ResponseSpeciesDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-18T23:22:59-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class SpeciesMapperImpl implements SpeciesMapper {

    @Override
    public ResponseSpeciesDTO toVeterinaryDto(Species species) {
        if ( species == null ) {
            return null;
        }

        ResponseSpeciesDTO responseSpeciesDTO = new ResponseSpeciesDTO();

        responseSpeciesDTO.setId( species.getId() );
        responseSpeciesDTO.setDescription( species.getDescription() );
        if ( species.getCreateAt() != null ) {
            responseSpeciesDTO.setCreateAt( new SimpleDateFormat().format( species.getCreateAt() ) );
        }

        return responseSpeciesDTO;
    }
}
