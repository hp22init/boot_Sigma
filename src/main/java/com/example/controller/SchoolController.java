package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.dto.School;
import com.example.service.SchoolService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public School saveSchool(@RequestBody School school) {

        return schoolService.create(school);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<School> getAllSchools() {

        return schoolService.read();
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public School updateSchool(@RequestBody School school) {

        return schoolService.update(school);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteSchool(@PathVariable String id) {

        return schoolService.delete(id);
    }
}