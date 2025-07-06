package com.cognizant.orm_learn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.orm_learn.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
