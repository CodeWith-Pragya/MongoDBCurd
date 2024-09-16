package com.springboot.mongodbcurd.MondoDBcurd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//to bind the data within the class encapsulation
@Document(collation = "todocollection")
public class ToDoModel {
    //what data you want to store in todo
    //todoId, todoTask, todoDate - Database - normalization}
    @Id
    private int todoId;

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }
    private String todoTask;
    private String todoDate;



}
