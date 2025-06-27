package com.Sahucompany.Todo_App.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Todo_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id ;
    @Column(name ="Title")
    private String Title ;

    @Column(name ="Completed")
    private boolean  Completed;
}
