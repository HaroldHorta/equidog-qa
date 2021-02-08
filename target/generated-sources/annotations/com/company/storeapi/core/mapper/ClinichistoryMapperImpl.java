package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.ClinicHistory;
import com.company.storeapi.model.payload.response.clinichistory.ResponseClinicHistoryDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-07T22:49:44-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class ClinichistoryMapperImpl implements ClinichistoryMapper {

    @Override
    public ResponseClinicHistoryDTO toClinichistoryDto(ClinicHistory clinicHistory) {
        if ( clinicHistory == null ) {
            return null;
        }

        ResponseClinicHistoryDTO responseClinicHistoryDTO = new ResponseClinicHistoryDTO();

        responseClinicHistoryDTO.setId( clinicHistory.getId() );
        responseClinicHistoryDTO.setCreateAt( clinicHistory.getCreateAt() );
        responseClinicHistoryDTO.setVeterinary( clinicHistory.getVeterinary() );
        responseClinicHistoryDTO.setCustomer( clinicHistory.getCustomer() );
        responseClinicHistoryDTO.setPet( clinicHistory.getPet() );
        responseClinicHistoryDTO.setReasonOfConsultation( clinicHistory.getReasonOfConsultation() );
        responseClinicHistoryDTO.setAnamnesis( clinicHistory.getAnamnesis() );
        responseClinicHistoryDTO.setRecipeBook( clinicHistory.getRecipeBook() );

        return responseClinicHistoryDTO;
    }
}
