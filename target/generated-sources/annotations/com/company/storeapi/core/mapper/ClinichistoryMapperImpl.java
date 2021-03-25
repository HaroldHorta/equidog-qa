package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.ClinicHistory;
import com.company.storeapi.model.payload.request.clinichistory.RequestListProblems;
import com.company.storeapi.model.payload.response.clinichistory.ResponseClinicHistoryDTO;
import com.company.storeapi.model.payload.response.diagnosticplan.ResponseDiagnosticPlan;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-24T19:26:59-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class ClinicHistoryMapperImpl implements ClinicHistoryMapper {

    @Override
    public ResponseClinicHistoryDTO toClinicHistoryDto(ClinicHistory clinicHistory) {
        if ( clinicHistory == null ) {
            return null;
        }

        ResponseClinicHistoryDTO responseClinicHistoryDTO = new ResponseClinicHistoryDTO();

        responseClinicHistoryDTO.setId( clinicHistory.getId() );
        responseClinicHistoryDTO.setCreateAt( clinicHistory.getCreateAt() );
        responseClinicHistoryDTO.setVeterinary( clinicHistory.getVeterinary() );
        responseClinicHistoryDTO.setPet( clinicHistory.getPet() );
        responseClinicHistoryDTO.setReasonOfConsultation( clinicHistory.getReasonOfConsultation() );
        responseClinicHistoryDTO.setAnamnesis( clinicHistory.getAnamnesis() );
        responseClinicHistoryDTO.setRecipeBook( clinicHistory.getRecipeBook() );
        responseClinicHistoryDTO.setPhysiologicalConstants( clinicHistory.getPhysiologicalConstants() );
        responseClinicHistoryDTO.setClinicExam( clinicHistory.getClinicExam() );
        Set<RequestListProblems> set = clinicHistory.getListProblems();
        if ( set != null ) {
            responseClinicHistoryDTO.setListProblems( new HashSet<RequestListProblems>( set ) );
        }
        Set<ResponseDiagnosticPlan> set1 = clinicHistory.getDiagnosticPlans();
        if ( set1 != null ) {
            responseClinicHistoryDTO.setDiagnosticPlans( new HashSet<ResponseDiagnosticPlan>( set1 ) );
        }

        return responseClinicHistoryDTO;
    }
}
