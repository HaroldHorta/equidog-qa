package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Pet;
import com.company.storeapi.model.payload.request.clinichistory.RequestPhysiologicalConstants;
import com.company.storeapi.model.payload.request.pet.RequestDeworming;
import com.company.storeapi.model.payload.response.pet.ResponsePetDTO;
import com.company.storeapi.model.payload.response.vaccination.ResponseVaccination;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-07T22:49:44-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class PetMapperImpl implements PetMapper {

    @Override
    public ResponsePetDTO toPetDto(Pet pet) {
        if ( pet == null ) {
            return null;
        }

        ResponsePetDTO responsePetDTO = new ResponsePetDTO();

        responsePetDTO.setId( pet.getId() );
        responsePetDTO.setName( pet.getName() );
        responsePetDTO.setSpecies( pet.getSpecies() );
        responsePetDTO.setBreed( pet.getBreed() );
        responsePetDTO.setColor( pet.getColor() );
        responsePetDTO.setSex( pet.getSex() );
        responsePetDTO.setDateBirth( pet.getDateBirth() );
        responsePetDTO.setAge( pet.getAge() );
        responsePetDTO.setParticularSigns( pet.getParticularSigns() );
        responsePetDTO.setOrigin( pet.getOrigin() );
        responsePetDTO.setCustomer( pet.getCustomer() );
        responsePetDTO.setCreateAt( pet.getCreateAt() );
        Set<ResponseVaccination> set = pet.getVaccinations();
        if ( set != null ) {
            responsePetDTO.setVaccinations( new HashSet<ResponseVaccination>( set ) );
        }
        Set<RequestPhysiologicalConstants> set1 = pet.getPhysiologicalConstants();
        if ( set1 != null ) {
            responsePetDTO.setPhysiologicalConstants( new HashSet<RequestPhysiologicalConstants>( set1 ) );
        }
        Set<RequestDeworming> set2 = pet.getDewormingInternal();
        if ( set2 != null ) {
            responsePetDTO.setDewormingInternal( new HashSet<RequestDeworming>( set2 ) );
        }
        Set<RequestDeworming> set3 = pet.getDewormingExternal();
        if ( set3 != null ) {
            responsePetDTO.setDewormingExternal( new HashSet<RequestDeworming>( set3 ) );
        }
        responsePetDTO.setFeeding( pet.getFeeding() );
        responsePetDTO.setPreviousIllnesses( pet.getPreviousIllnesses() );
        responsePetDTO.setSurgeries( pet.getSurgeries() );
        responsePetDTO.setFamilyBackground( pet.getFamilyBackground() );
        responsePetDTO.setHabitat( pet.getHabitat() );
        responsePetDTO.setReproductiveStatus( pet.getReproductiveStatus() );
        responsePetDTO.setAllergy( pet.getAllergy() );

        return responsePetDTO;
    }
}
