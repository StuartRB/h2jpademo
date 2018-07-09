package com.example.h2jpademo.dog.repository;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "DOG")

public class DogEntity {

    @Id
    @Column(name = "DOG_ID")
    private Long id;

    @Column(name = "DOG_NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
