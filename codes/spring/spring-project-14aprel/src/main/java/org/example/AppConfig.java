package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.developia.spring_project_14aprel.Computer;
import az.developia.spring_project_14aprel.Employee;

@Configuration
public class AppConfig {

    @Bean
    public Computer computer() {
        return new Computer();
    }

    @Bean
    public Employee employee() {

        Employee employee = new Employee();

        // DI
        employee.setComputer(computer());

        return employee;
    }
}