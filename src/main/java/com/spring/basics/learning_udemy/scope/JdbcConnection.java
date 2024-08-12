package com.spring.basics.learning_udemy.scope;
import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JdbcConnection");
    }
}
