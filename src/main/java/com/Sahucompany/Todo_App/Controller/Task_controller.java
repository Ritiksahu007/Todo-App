package com.Sahucompany.Todo_App.Controller;


import com.Sahucompany.Todo_App.model.Task;
import com.Sahucompany.Todo_App.todoServicec.Allservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@Controller


public class Task_controller {



    private final Allservice services;
    @Autowired
    public Task_controller(Allservice services) {

        this.services = services;
    }

    @PostMapping
    public String createtask(@RequestParam String title){
        services.createtask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deletetask(@PathVariable Long id){
        services.deletetask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggletask(@PathVariable Long id){
        services.toggletask(id);

        return "redirect:/";
    }



    @GetMapping
    public String getall(Model model){

        List<Task> tasks =services.getall();
        tasks.sort(Comparator.comparing(Task::getCreatedAt, Comparator.nullsLast(Comparator.naturalOrder())).reversed());

        // We use this  for thymeleaf
        model.addAttribute("tasks",tasks);
        return  "tasks";
    }




}
