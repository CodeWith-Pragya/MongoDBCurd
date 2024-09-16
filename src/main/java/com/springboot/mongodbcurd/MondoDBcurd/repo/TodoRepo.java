package com.springboot.mongodbcurd.MondoDBcurd.repo;

import com.springboot.mongodbcurd.MondoDBcurd.model.ToDoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//to extends the crud property/methods
public interface  TodoRepo extends CrudRepository<ToDoModel, Integer> {

    //to find the all todos
    @Override
    List<ToDoModel> findAll();

    void deleteById();
}
