package com.example.webapp.service;

import com.example.webapp.model.FileUpload;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface FileUploadService {
    FileUpload uploadSingle(MultipartFile multipartFile) throws IOException;
}
