package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TodoItemMapper {

    //bere z Entitiy a ulozi do DTO
    TodoItemDTO toDTO(TodoItemEntity source);

    //bere z DTO a ulozi do Entity
    TodoItemEntity toEntity(TodoItemDTO source);
}
