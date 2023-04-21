package com.example.webapp.service;

import com.example.webapp.model.Blog;
import com.example.webapp.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetFileIpm implements GetFile{
    private final DataRepository dataRepository;
    @Override
    public List<Blog> getFile(){
        return dataRepository.getBlogs();
    }
}
