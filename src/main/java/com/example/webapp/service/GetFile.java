package com.example.webapp.service;

import com.example.webapp.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GetFile {
    List<Blog> getFile();
}
