package com.example.springDataJpaDemo;
import com.example.springDataJpaDemo.model.Employee;
import com.example.springDataJpaDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDemoApplication.class, args);
    }
    @Override
    public void run(String... args) {
        Employee emp = new Employee();
        emp.setName("Hardik");
        emp.setDepartment("ECE");
        employeeService.addEmployee(emp);
    }
}
