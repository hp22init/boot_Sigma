package com.example.repo;

import com.example.dto.Img;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgRepository extends MongoRepository<Img, String> {
}
