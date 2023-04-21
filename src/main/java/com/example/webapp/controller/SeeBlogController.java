package com.example.webapp.controller;
import com.example.webapp.service.BlogService;
import com.example.webapp.service.GetFile;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
@RequiredArgsConstructor
public class SeeBlogController {
    private final BlogService blogService;
    private final GetFile getFile;
    @GetMapping("/any/blog/{id}")
    public String anyBlog(@PathVariable int id, Model model){
        Random random = new Random();
        int size = random.nextInt(blogService.findAll().size());
        System.out.println(blogService.findAll().size());
//        model.addAttribute("id",id);
        model.addAttribute("size",size);
        model.addAttribute("data",blogService.findAll().get(size));
        System.out.println(blogService.findAll().get(size).getTitle());
        System.out.println(blogService.findAll().get(0).getThumbnail());
        //getting file from repository;
        return "pages/seeblog";
    }

}
