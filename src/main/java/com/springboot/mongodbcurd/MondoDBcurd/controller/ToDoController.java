package com.springboot.mongodbcurd.MondoDBcurd.controller;

import com.springboot.mongodbcurd.MondoDBcurd.model.ToDoModel;
import com.springboot.mongodbcurd.MondoDBcurd.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoService service;
    private ToDoModel model;

    @PostMapping(value = "/addToDo")
    public ToDoModel addToDos(@RequestBody ToDoModel model) {
        return service.addTodo(model);
    }
    @GetMapping(value = "/getToDos")
    public List<ToDoModel> getToDos()
    {
        return service.getTodos();
    }
    //to get particular todo
    @GetMapping(value = "/{todoId}")
    public List<ToDoModel> getToDos(@PathVariable("todoId") int todoId)
    {
        return service.getTodos();
    }
    //to delete the particular todo

    @DeleteMapping(value = "/{todoId}")
    public String deleteToDo(@PathVariable("todoId") @RequestBody int todoId) {
        return service.deleteTodo(todoId);
    }

    //to update the todo
    @PutMapping(value =  "/{todoId}")
    public ToDoModel updateToDo(@PathVariable("todoId") @RequestBody int todoId, ToDoModel model)
    {
        return service.updateTodo(todoId, model);
    }



}
