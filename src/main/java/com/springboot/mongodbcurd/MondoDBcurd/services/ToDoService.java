package com.springboot.mongodbcurd.MondoDBcurd.services;

import com.springboot.mongodbcurd.MondoDBcurd.model.ToDoModel;
import com.springboot.mongodbcurd.MondoDBcurd.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//declare/create all methods
@Service
public class ToDoService {
    //create add->TodoModel, return TodoModel, delete, fetch, update todo methods

    //to get the crud method from repo
    @Autowired
    private TodoRepo repo;

    //add todo, return TodoModel
    public ToDoModel addTodo(ToDoModel model) {
        return repo.save(model);
    }

    //to fetch the all todos
    public List<ToDoModel> getTodos() {
        return repo.findAll();
    }

    //to delete the todo
    public String deleteTodo(int todoId) {
        repo.deleteById();
        return todoId + " is deleted successfully";
    }

    //to update the todo
    public ToDoModel updateTodo(int todoId, ToDoModel model) {
        model.setTodoId(todoId);
        return repo.save(model);
    }

}






