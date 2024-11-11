package cz.itnetwork.todoapp.controller;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    //RequestBody - ocekavame nejaky data
    @PostMapping("/todo")
    public @ResponseBody TodoItemDTO create(@RequestBody TodoItemDTO todoItemDTO) {
        return todoItemService.create(todoItemDTO);
    }

    @GetMapping("/todo/create")
    public String renderForm (Model model, @ModelAttribute TodoItemDTO todoItemDTO) {
        model.addAttribute("title", "Ukolovnik");
        return "todoapp";
    }

    @PostMapping("/todo/create")
    public @ResponseBody TodoItemDTO createByForm(@ModelAttribute TodoItemDTO todoItemDTO) {
        return todoItemService.create(todoItemDTO);
    }

}














