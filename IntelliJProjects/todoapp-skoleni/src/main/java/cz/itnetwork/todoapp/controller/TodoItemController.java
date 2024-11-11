package cz.itnetwork.todoapp.controller;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoItemController {

    @Autowired
    private TodoItemService todoItemService;

    //vracime list z DTO
    @GetMapping("/todo")
    public @ResponseBody List<TodoItemDTO> getAll() {
        return todoItemService.getAll();
    }
}
