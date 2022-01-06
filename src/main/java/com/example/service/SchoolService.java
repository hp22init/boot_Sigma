package com.example.service;

import org.springframework.stereotype.Service;
import com.example.dto.School;

import java.util.List;
import java.util.Map;

@Service
public interface SchoolService {

    School create(School school);

    List<School> read();

    School update(School school);

    Map<String, String> delete(String id);

}