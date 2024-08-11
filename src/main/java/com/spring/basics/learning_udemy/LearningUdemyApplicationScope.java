package com.spring.basics.learning_udemy;
import com.spring.basics.learning_udemy.scope.JdbcConnection;
import com.spring.basics.learning_udemy.scope.PersonDao;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class LearningUdemyApplicationScope {

    private static Logger logger =  LoggerFactory.getLogger(LearningUdemyApplicationScope.class);

        public static void main(String[] args) {
            ApplicationContext applicationContext = SpringApplication.run(LearningUdemyApplicationScope.class, args);
            PersonDao personDao =  applicationContext.getBean(PersonDao.class);
            logger.info(personDao.toString());

            PersonDao personDao2 =  applicationContext.getBean(PersonDao.class);
            logger.info("{}",personDao2);
            JdbcConnection result = personDao.getJdbcConnection();
            logger.info(result.toString());
            JdbcConnection result2 = personDao2.getJdbcConnection();
            logger.info("{}",result2);
        }
    }