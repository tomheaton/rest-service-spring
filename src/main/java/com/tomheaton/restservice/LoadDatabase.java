package com.tomheaton.restservice;

import com.tomheaton.restservice.entities.Employee;
import com.tomheaton.restservice.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            logger.info("Preloading {}", repository.save(new Employee("Jack O'Neill", "Leader")));
            logger.info("Preloading {}", repository.save(new Employee("Daniel Jackson", "Archeologist")));
        };
    }
}
