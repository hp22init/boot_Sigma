package com.example.service;

import com.example.dto.Img;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public interface ImgService {

    String addImg(String title,String desc,String price, MultipartFile file) throws IOException;

    Img getImg(String imgId);

 //   Map<String, String> delete(String id);

}
