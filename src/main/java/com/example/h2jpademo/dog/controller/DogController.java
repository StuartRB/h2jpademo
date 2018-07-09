package com.example.h2jpademo.dog.controller;

import com.example.h2jpademo.dog.repository.DogEntity;
import com.example.h2jpademo.dog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    DogRepository repository;

    @RequestMapping("dogs")
    public List<DogEntity> getAllDogs(){
        return repository.findAll();
    }
}
