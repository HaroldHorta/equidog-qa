package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.ClinicExam;
import com.company.storeapi.model.payload.response.clinicexam.ResponseClinicExam;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-15T17:16:16-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ClinicExamMapperImpl implements ClinicExamMapper {

    @Override
    public ResponseClinicExam toClinicExamDto(ClinicExam clinicExam) {
        if ( clinicExam == null ) {
            return null;
        }

        ResponseClinicExam responseClinicExam = new ResponseClinicExam();

        responseClinicExam.setId( clinicExam.getId() );
        responseClinicExam.setExam( clinicExam.getExam() );

        return responseClinicExam;
    }
}
