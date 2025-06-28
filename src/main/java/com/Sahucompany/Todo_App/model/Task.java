package com.Sahucompany.Todo_App.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity

@Table(name ="Todo_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id ;
    @Column(name ="title")
    private String title ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return Completed;
    }

    public void setCompleted(boolean completed) {
        Completed = completed;
    }

    @Column(name ="Completed")
    private boolean  Completed;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="r_create_time")
    private LocalDateTime createdAt;

    @Column(name="completed_time")
    private LocalDateTime completedAt;

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public void markCompleted() {
        this.Completed = true;
        this.completedAt = LocalDateTime.now();
    }

    public void markIncomplete() {
        this.Completed = false;
        this.completedAt = null;
    }
}
