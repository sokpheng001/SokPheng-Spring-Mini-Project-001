package com.example.webapp.service;

import com.example.webapp.model.Blog;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();
    boolean save(Blog blog, MultipartFile multipartFile) throws IOException;
}
