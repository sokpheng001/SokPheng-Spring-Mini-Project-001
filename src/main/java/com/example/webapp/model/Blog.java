package com.example.webapp.model;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @NotBlank(message = "Title is required.")
    private String title;
    @NotBlank(message = "Author is required.")
    private String author;
    @NotBlank(message = "Description is required")
    private String description;
    //
    List<Category> categoryList;
    //
//    @NotBlank(message = "Filed is required.")
    private String thumbnail;
}
