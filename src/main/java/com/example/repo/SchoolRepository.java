package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.dto.School;

@Repository
public interface SchoolRepository extends MongoRepository<School, String> {
}