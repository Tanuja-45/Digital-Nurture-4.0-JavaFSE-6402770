package com.cognizant.orm_learn;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.orm_learn.model.Person;
import com.cognizant.orm_learn.service.PersonService;

@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        PersonService personService = context.getBean(PersonService.class);
        testGetAllPersons(personService);
    }
    private static void testGetAllPersons(PersonService personService) {
        LOGGER.info("Start");
        List<Person> persons = personService.getAllPersons();
        LOGGER.debug("persons={}", persons);
        LOGGER.info("End");
    }
}

