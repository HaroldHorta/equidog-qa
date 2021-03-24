package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.ClinicExam;
import com.company.storeapi.model.payload.response.clinicexam.ResponseClinicExam;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T23:56:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
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
