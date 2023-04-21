package com.example.webapp.repository;


import com.example.webapp.model.Blog;
import com.example.webapp.model.Category;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
@RequiredArgsConstructor
public class DataRepository {
    private final Faker faker;
    private final CategoryData categoryData;
    Blog blog;
    private final List<Blog> blogs = new ArrayList<>();

    @PostConstruct
    public List<Blog> init() {
        blogs.add(new Blog(faker.book().genre(), faker.book().author(), faker.book().title(), categoryData.category(),"a1.jpg"));
//        for (int i = 0; i < 4; i++) {
//            if (i % 2 == 0) {
//                blogs.add(new Blog(faker.book().genre(), faker.book().author(), faker.book().title(), "a1.jpg"));
//            }else {
//                blogs.add(new Blog(faker.book().genre(), faker.book().author(), faker.book().title(), "a2.jpg"));
//            }
//        }
        return blogs;
    }
}
