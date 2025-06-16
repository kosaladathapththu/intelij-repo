package com.AMKDA.Employee.Repository;

import com.AMKDA.Employee.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<employee,Long> {
}
