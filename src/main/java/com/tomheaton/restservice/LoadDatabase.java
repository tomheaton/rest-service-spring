package com.tomheaton.restservice;

import com.tomheaton.restservice.entity.Employee;
import com.tomheaton.restservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {

        return args -> {
            employeeRepository.save(new Employee("Jack O'Neill", "Leader"));
            employeeRepository.save(new Employee("Daniel Jackson", "Archeologist"));

            employeeRepository.findAll().forEach(employee -> {
                logger.info("Preloading {}", employee);
            });
        };
    }
}
