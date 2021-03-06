package com.example.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class School {

    @Id
    private String id;
    private String name;
    private int establishmentYear;
    private String[] availableCourses;
    private int strength;
    // Generates Getters and Setters...

    public School() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String[] getAvailableCourses() {
        return availableCourses;
    }

    public void setAvailableCourses(String[] availableCourses) {
        this.availableCourses = availableCourses;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}