package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Species;
import com.company.storeapi.model.payload.response.species.ResponseSpeciesDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-15T17:16:16-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
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
