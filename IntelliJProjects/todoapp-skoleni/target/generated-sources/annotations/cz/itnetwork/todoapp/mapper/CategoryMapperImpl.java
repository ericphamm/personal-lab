package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.CategoryDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T14:56:50+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toDTO(CategoryEntity source) {
        if ( source == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( source.getId() );
        categoryDTO.setName( source.getName() );

        return categoryDTO;
    }

    @Override
    public CategoryEntity toEntity(CategoryDTO source) {
        if ( source == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( source.getId() );
        categoryEntity.setName( source.getName() );

        return categoryEntity;
    }
}
