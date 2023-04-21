package com.example.webapp.controller;

import com.example.webapp.model.Blog;
import com.example.webapp.model.Category;
import com.example.webapp.service.BlogService;

import com.example.webapp.service.CategoryService;
import com.example.webapp.service.CategoryServiceImp;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import java.util.Random;

@Controller
@RequiredArgsConstructor
public class BlogPageController {
    private final CategoryService categoryService;
    private final BlogService blogs;
    @GetMapping("/blog")
    public String blog(Model model){
        Random random = new Random();
        List<Blog> blogs1 = blogs.findAll();
        int size = random.nextInt(blogs1.size());
        model.addAttribute("data",blogs1);
        model.addAttribute("categories", categoryService.categoryData());
        model.addAttribute("size",size);
        return "pages/blog";
    }
}
