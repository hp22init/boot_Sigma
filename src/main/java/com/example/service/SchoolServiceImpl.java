package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.School;
import com.example.repo.SchoolRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School create(School school) {
        return schoolRepository.insert(school);
    }

    @Override
    public List<School> read() {
        return schoolRepository.findAll();
    }

    @Override
    public School update(School school) {

        return schoolRepository.save(school);
    }

    @Override
    public Map<String, String> delete(String id) {

        // Total count of data before delete
        long beforeDelete = schoolRepository.count();

        schoolRepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = schoolRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }
}