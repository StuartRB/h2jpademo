package com.example.h2jpademo.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DogRepository extends JpaRepository<DogEntity, Long>{

}
