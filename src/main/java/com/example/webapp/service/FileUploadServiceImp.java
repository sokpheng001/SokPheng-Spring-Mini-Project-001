package com.example.webapp.service;
import com.example.webapp.model.FileUpload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Configuration
public class FileUploadServiceImp implements FileUploadService {
    @Value("${server.file}")
    private String serverFile;
    @Override
    public FileUpload uploadSingle(MultipartFile multipartFile) throws IOException {
        int indexAtLat = multipartFile.getOriginalFilename().lastIndexOf(".");
        String ext = multipartFile.getOriginalFilename().substring(indexAtLat+1);
        String uuid = UUID.randomUUID().toString();
        String newFileName = String.format("%s%s%s",uuid,".",ext);
        //System.out.println(ext);
        Path path = Paths.get(serverFile + newFileName);
//        System.out.println(path);
        Files.copy(multipartFile.getInputStream(),path);
        return new FileUpload(newFileName, true);
    }
}
