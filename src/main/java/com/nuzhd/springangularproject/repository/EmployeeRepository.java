package com.nuzhd.springangularproject.repository;

import com.nuzhd.springangularproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
