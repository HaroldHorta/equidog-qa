package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Species;
import com.company.storeapi.model.payload.response.species.ResponseSpeciesDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-24T00:19:23-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
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
