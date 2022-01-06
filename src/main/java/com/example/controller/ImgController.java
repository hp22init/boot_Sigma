package com.example.controller;

import com.example.dto.Img;
import com.example.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Controller
public class ImgController {

    @Autowired
    private ImgService imgService;

    @GetMapping("/photos/{id}")
    public String getPhoto(@PathVariable String id, Model model) {
        Img img = imgService.getImg(id);
        model.addAttribute("title", img.getTitle());
        model.addAttribute("desc", img.getDesc());
        model.addAttribute("price", img.getPrice());
        model.addAttribute("image", Base64.getEncoder().encodeToString(img.getImage().getData()));
        return "images";
    }

    @GetMapping("/photos/upload")
    public String uploadPhoto(Model model) {
        model.addAttribute("message", "hello");
        return "uploadImage";
    }

    @PostMapping("/photos/add")
    public String addPhoto(@RequestParam("title") String title,@RequestParam("desc") String desc, @RequestParam("price") String price, @RequestParam("image") MultipartFile image, Model model) throws IOException {
        String id = imgService.addImg(title,desc, price, image);
        return "redirect:/photos/" + id;
    }

}
