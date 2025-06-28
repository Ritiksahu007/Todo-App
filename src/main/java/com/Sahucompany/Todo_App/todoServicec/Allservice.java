package com.Sahucompany.Todo_App.todoServicec;


import com.Sahucompany.Todo_App.Repository.TodoRepo;
import com.Sahucompany.Todo_App.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class Allservice {


    @Autowired
    TodoRepo repo;
    public List<Task> getall() {

        return repo.findAll();
    }

    public void createtask(String title) {

        Task t = new Task();
        t.setTitle(title);
        t.setCreatedAt(LocalDateTime.now());
        t.setCompleted(false);
        repo.save(t);
    }

    public void deletetask(Long id) {

        repo.deleteById(id);
    }

    public void toggletask(Long id) {
        Task task = repo.findById(id).orElseThrow();
        boolean isCompleted = !task.isCompleted(); // toggle
        task.setCompleted(isCompleted);

        if (isCompleted) {
            task.setCompletedAt(LocalDateTime.now());
        } else {
            task.setCompletedAt(null);
        }

        repo.save(task);
    }


}
