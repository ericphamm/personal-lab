package cz.itnetwork.todoapp.service;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.repository.TodoItemRepository;
import cz.itnetwork.todoapp.mapper.TodoItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    @Autowired
    private TodoItemMapper todoItemMapper;

    //ziskani vsech polozek v databazi
    //vracet DTO klientovi, repo umoznuje pracovat s databazemmi
    //findAll zavola entity hibernate, stream ukazuje, map premeni Mapper na toDTO, tolist ulozit do listu
    public List<TodoItemDTO> getAll() {
        return todoItemRepository.findAll()
                .stream()
                .map(item -> todoItemMapper.toDTO(item))
                .toList();
    }

}
