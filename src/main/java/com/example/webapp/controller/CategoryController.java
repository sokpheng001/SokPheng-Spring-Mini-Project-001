package com.example.webapp.controller;

import com.example.webapp.model.Blog;
import com.example.webapp.service.BlogServiceImp;
import com.example.webapp.service.CategoryService;
import jakarta.servlet.http.PushBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final BlogServiceImp blogServiceImp;
    private final CategoryService categoryService;

    @GetMapping("/category")
    public String category(Model model){
        model.addAttribute("data",blogServiceImp.findAll());
        model.addAttribute("categories", blogServiceImp.findAll());
        Random random = new Random();
        int size = random.nextInt(blogServiceImp.findAll().size());
        System.out.println(size);
        model.addAttribute("size",size);
        return "pages/category";
    }
}
