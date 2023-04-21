package com.example.webapp.service;

import com.example.webapp.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> categoryData();
}
