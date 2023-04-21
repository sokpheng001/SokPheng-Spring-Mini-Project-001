package com.example.webapp.service;

import com.example.webapp.model.Blog;
import com.example.webapp.model.FileUpload;
import com.example.webapp.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogServiceImp implements BlogService{
    private final DataRepository dataRepository;
    private final FileUploadService fileUploadService;
    @Override
    public List<Blog> findAll() {
        return dataRepository.getBlogs();
    }
    @Override
    public boolean save(Blog blog, MultipartFile multipartFile) throws IOException {
        FileUpload fileUpload = fileUploadService.uploadSingle(multipartFile);
        if(fileUpload.isSucceed()){
            System.out.println("Successfully added file!!!");
            blog.setThumbnail(fileUpload.fileName());
            System.out.println(blog.getThumbnail());
            dataRepository.getBlogs().add(0,blog);
            return false;
        }
        return true;
    }
}
