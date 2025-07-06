package com.example.springDataJpaDemo.repository;
import com.example.springDataJpaDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
