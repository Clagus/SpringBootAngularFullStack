package com.practice.employeemanager.repo;

import com.practice.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
