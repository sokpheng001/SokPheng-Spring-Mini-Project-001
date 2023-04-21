package com.example.webapp.service;

import com.example.webapp.model.Category;
import com.example.webapp.repository.CategoryData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {
    private final CategoryData categoryData = new CategoryData();
    @Override
    public List<Category> categoryData() {
        return categoryData.category();
    }
}
