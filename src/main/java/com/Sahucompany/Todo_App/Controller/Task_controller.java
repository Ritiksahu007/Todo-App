package com.Sahucompany.Todo_App.Controller;


import com.Sahucompany.Todo_App.model.Task;
import com.Sahucompany.Todo_App.todoServicec.Allservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/todo")
public class Task_controller {


    @Autowired
    private final Allservice services;

    public Task_controller(Allservice services) {
        this.services = services;
    }

    @GetMapping("/alltask")
    public String getall(Model model){

        List<Task> tasks =services.getall();

        // We use this  for thymeleaf
        model.addAttribute("tasks",tasks);
        return  "tasks";
    }

}
