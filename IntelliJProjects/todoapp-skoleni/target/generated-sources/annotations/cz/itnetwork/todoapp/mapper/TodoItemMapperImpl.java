package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T14:56:50+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class TodoItemMapperImpl implements TodoItemMapper {

    @Override
    public TodoItemDTO toDTO(TodoItemEntity source) {
        if ( source == null ) {
            return null;
        }

        TodoItemDTO todoItemDTO = new TodoItemDTO();

        todoItemDTO.setCategoryId( source.getCategoryId() );
        todoItemDTO.setId( source.getId() );
        todoItemDTO.setName( source.getName() );

        return todoItemDTO;
    }

    @Override
    public TodoItemEntity toEntity(TodoItemDTO source) {
        if ( source == null ) {
            return null;
        }

        TodoItemEntity todoItemEntity = new TodoItemEntity();

        todoItemEntity.setId( source.getId() );
        todoItemEntity.setName( source.getName() );

        return todoItemEntity;
    }
}
