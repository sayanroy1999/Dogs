package com.example.Dogs.Repository;

import com.example.Dogs.Entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}