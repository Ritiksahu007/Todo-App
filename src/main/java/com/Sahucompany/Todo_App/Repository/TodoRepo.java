package com.Sahucompany.Todo_App.Repository;

import com.Sahucompany.Todo_App.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Task,Long> {
}
