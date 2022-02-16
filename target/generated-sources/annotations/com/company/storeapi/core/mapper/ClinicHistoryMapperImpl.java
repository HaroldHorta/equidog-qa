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
    date = "2022-02-15T17:16:15-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
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
