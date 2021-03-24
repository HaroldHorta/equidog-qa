package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Breed;
import com.company.storeapi.model.payload.request.breed.RequestUpdateBreedDTO;
import com.company.storeapi.model.payload.response.breed.ResponseBreedDTO;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T23:56:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class BreedMapperImpl implements BreedMapper {

    @Override
    public ResponseBreedDTO toBreedDto(Breed breed) {
        if ( breed == null ) {
            return null;
        }

        ResponseBreedDTO responseBreedDTO = new ResponseBreedDTO();

        responseBreedDTO.setId( breed.getId() );
        responseBreedDTO.setDescription( breed.getDescription() );
        if ( breed.getCreateAt() != null ) {
            responseBreedDTO.setCreateAt( new SimpleDateFormat().format( breed.getCreateAt() ) );
        }

        return responseBreedDTO;
    }

    @Override
    public void updateBreedFromDto(RequestUpdateBreedDTO requestUpdateBreedDTO, Breed breed) {
        if ( requestUpdateBreedDTO == null ) {
            return;
        }

        if ( requestUpdateBreedDTO.getId() != null ) {
            breed.setId( requestUpdateBreedDTO.getId() );
        }
        if ( requestUpdateBreedDTO.getDescription() != null ) {
            breed.setDescription( requestUpdateBreedDTO.getDescription() );
        }
    }
}
