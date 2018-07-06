package com.example.h2jpademo.dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<DogEntity, Long>{

}
