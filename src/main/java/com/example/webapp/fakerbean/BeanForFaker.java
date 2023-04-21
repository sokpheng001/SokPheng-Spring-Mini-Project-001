package com.example.webapp.fakerbean;


import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanForFaker {
    @Bean
    public Faker faker(){
        return new Faker();
    }
}
