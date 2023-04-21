package com.example.webapp.controller;

import com.example.webapp.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final BlogService blogService;
    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("author",blogService.findAll());
        return "pages/author";
    }
}
