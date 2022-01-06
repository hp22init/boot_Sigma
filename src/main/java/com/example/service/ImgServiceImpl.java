package com.example.service;

import com.example.dto.Img;
import com.example.repo.ImgRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ImgServiceImpl implements ImgService{

    @Autowired
    private ImgRepository imgRepository;

    @Override
    public String addImg(String title,String desc,String price, MultipartFile file) throws IOException {
        Img img = new Img(title,desc,price);
        img.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        img = imgRepository.insert(img);
        return img.getImgId();

    }

    @Override
    public Img getImg(String imgId) {
        return imgRepository.findById(imgId).get();
    }

   /* @Override
    public Map<String, String> delete(String id) {
        // Total count of data before delete
        long beforeDelete = imgRepository.count();

        imgRepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = imgRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }*/
}
