package com.cognizant.orm_learn.service;
import java.util.List;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.orm_learn.model.Person;
import com.cognizant.orm_learn.repository.PersonRepository;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Transactional
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
