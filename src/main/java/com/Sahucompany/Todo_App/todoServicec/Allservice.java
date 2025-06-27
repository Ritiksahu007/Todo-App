package com.Sahucompany.Todo_App.todoServicec;


import com.Sahucompany.Todo_App.Repository.TodoRepo;
import com.Sahucompany.Todo_App.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Allservice {


    @Autowired
    TodoRepo repo;
    public List<Task> getall() {

        return repo.findAll();
    }
}
