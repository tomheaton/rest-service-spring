package com.tomheaton.restservice.repositories;

import com.tomheaton.restservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
