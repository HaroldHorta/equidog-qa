package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.DiagnosticPlan;
import com.company.storeapi.model.payload.response.diagnosticplan.ResponseDiagnosticPlan;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T23:56:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class DiagnosticPlanMapperImpl implements DiagnosticPlanMapper {

    @Override
    public ResponseDiagnosticPlan toDiagnosticPlanDto(DiagnosticPlan diagnosticPlan) {
        if ( diagnosticPlan == null ) {
            return null;
        }

        ResponseDiagnosticPlan responseDiagnosticPlan = new ResponseDiagnosticPlan();

        responseDiagnosticPlan.setId( diagnosticPlan.getId() );
        responseDiagnosticPlan.setDescription( diagnosticPlan.getDescription() );
        responseDiagnosticPlan.setCreateAt( diagnosticPlan.getCreateAt() );

        return responseDiagnosticPlan;
    }
}
