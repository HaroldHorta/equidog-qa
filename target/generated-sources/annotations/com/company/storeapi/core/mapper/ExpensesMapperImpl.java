package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.finance.Expenses;
import com.company.storeapi.model.payload.response.finance.ResponseExpensesDTO;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-18T23:22:58-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class ExpensesMapperImpl implements ExpensesMapper {

    @Override
    public ResponseExpensesDTO DtoResponseExpenses(Expenses expenses) {
        if ( expenses == null ) {
            return null;
        }

        ResponseExpensesDTO responseExpensesDTO = new ResponseExpensesDTO();

        responseExpensesDTO.setId( expenses.getId() );
        responseExpensesDTO.setDescription( expenses.getDescription() );
        responseExpensesDTO.setPrice( expenses.getPrice() );
        Set<String> set = expenses.getImages();
        if ( set != null ) {
            responseExpensesDTO.setImages( new HashSet<String>( set ) );
        }
        if ( expenses.getCreateAt() != null ) {
            responseExpensesDTO.setCreateAt( new SimpleDateFormat().format( expenses.getCreateAt() ) );
        }

        return responseExpensesDTO;
    }
}
