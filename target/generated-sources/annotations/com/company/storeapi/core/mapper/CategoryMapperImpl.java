package com.company.storeapi.core.mapper;

import com.company.storeapi.model.entity.Category;
import com.company.storeapi.model.payload.request.category.RequestUpdateCategoryDTO;
import com.company.storeapi.model.payload.response.category.ResponseCategoryDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-24T19:27:00-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(ResponseCategoryDTO responseCategoryDTO) {
        if ( responseCategoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( responseCategoryDTO.getId() );
        category.setDescription( responseCategoryDTO.getDescription() );
        try {
            if ( responseCategoryDTO.getCreateAt() != null ) {
                category.setCreateAt( new SimpleDateFormat().parse( responseCategoryDTO.getCreateAt() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }

        return category;
    }

    @Override
    public ResponseCategoryDTO toCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        ResponseCategoryDTO responseCategoryDTO = new ResponseCategoryDTO();

        responseCategoryDTO.setId( category.getId() );
        responseCategoryDTO.setDescription( category.getDescription() );
        if ( category.getCreateAt() != null ) {
            responseCategoryDTO.setCreateAt( new SimpleDateFormat().format( category.getCreateAt() ) );
        }

        return responseCategoryDTO;
    }

    @Override
    public void updateCategoryFromDto(RequestUpdateCategoryDTO requestUpdateCategoryDTO, Category category) {
        if ( requestUpdateCategoryDTO == null ) {
            return;
        }

        if ( requestUpdateCategoryDTO.getId() != null ) {
            category.setId( requestUpdateCategoryDTO.getId() );
        }
        if ( requestUpdateCategoryDTO.getDescription() != null ) {
            category.setDescription( requestUpdateCategoryDTO.getDescription() );
        }
    }
}
