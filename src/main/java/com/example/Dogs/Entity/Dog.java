package com.example.Dogs.Entity;

import jakarta.persistence.*;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String breed;

    private String subBreed;

    public Dog() {
    }

    public Dog(String breed, String subBreed) {
        this.breed = breed;
        this.subBreed = subBreed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSubBreed() {
        return subBreed;
    }

    public void setSubBreed(String subBreed) {
        this.subBreed = subBreed;
    }
}