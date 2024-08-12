package com.spring.basics.learning_udemy;
import com.spring.basics.learning_udemy.property_understanding.implProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class LearningUdemyApplicationProperty {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(implProperty.class, args);
        implProperty obj =  applicationContext.getBean(implProperty.class);
        System.out.println(obj);
        String result = obj.returnUrl();
        System.out.println(result);
    }
}