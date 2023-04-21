package com.example.webapp.resourcehandler;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceHandler implements WebMvcConfigurer {
    @Value("${server.file}")
    private String server;
    @Value("${client.path}")
    private String client;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler(client).addResourceLocations("file:" + server);
    }
}
