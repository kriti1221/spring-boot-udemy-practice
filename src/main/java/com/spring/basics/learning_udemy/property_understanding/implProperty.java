package com.spring.basics.learning_udemy.property_understanding;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class implProperty {

    @Value("${external.service.url}")
    private String url;

    public String returnUrl() {
        return url;
    }
}
