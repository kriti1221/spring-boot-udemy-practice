package com.spring.basics.learning_udemy.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
