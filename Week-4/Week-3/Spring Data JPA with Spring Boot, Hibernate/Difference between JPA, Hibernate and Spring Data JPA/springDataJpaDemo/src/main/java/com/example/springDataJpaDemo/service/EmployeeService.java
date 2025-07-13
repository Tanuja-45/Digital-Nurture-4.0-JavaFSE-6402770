package com.example.springDataJpaDemo.service;
import com.example.springDataJpaDemo.model.Employee;
import com.example.springDataJpaDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional
    public void addEmployee(Employee emp) {
        employeeRepository.save(emp);
    }
}
