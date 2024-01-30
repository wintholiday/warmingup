package com.test1.springboot1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("")
    public List<Todo> getTodoList() {
        return todoService.getAllTodos();
    }

    @PostMapping("")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable("id") int id) {
        todoService.deleteTodoById(id);
    }
}
