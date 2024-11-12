package cz.itnetwork.todoapp.service;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import cz.itnetwork.todoapp.entity.repository.CategoryRepository;
import cz.itnetwork.todoapp.entity.repository.TodoItemRepository;
import cz.itnetwork.todoapp.mapper.TodoItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.DTD;
import java.util.List;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    @Autowired
    private TodoItemMapper todoItemMapper;
    @Autowired
    private CategoryRepository categoryRepository;

    //ziskani vsech polozek v databazi
    //vracet DTO klientovi, repo umoznuje pracovat s databazemmi
    //findAll zavola entity hibernate, stream ukazuje, map premeni Mapper na toDTO, tolist ulozit do listu
    public List<TodoItemDTO> getAll() {
        return todoItemRepository.findAll()
                .stream()
                .map(item -> todoItemMapper.toDTO(item))
                .toList();
    }
    //metoda ktera vraci klientovi DTO (surovy data)
    public TodoItemDTO create(TodoItemDTO todoItemDTO) {
        //pomoci mapperu premapuje DTO na entitu
        TodoItemEntity todoItemEntity = todoItemMapper.toEntity(todoItemDTO);
        //vytahnout categorii ID
        CategoryEntity categoryEntity = categoryRepository.getReferenceById(todoItemDTO.getCategoryId());
        todoItemEntity.setCategoryEntity(categoryEntity);
        //todoenttiy ulozime do databaze
        todoItemEntity = todoItemRepository.save(todoItemEntity);
        //vracime zase do DTO
        return todoItemMapper.toDTO(todoItemEntity);
    }

}







