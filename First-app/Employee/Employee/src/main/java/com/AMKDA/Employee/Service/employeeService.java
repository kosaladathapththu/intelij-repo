package com.AMKDA.Employee.Service;

import com.AMKDA.Employee.Repository.employeeRepository;
import com.AMKDA.Employee.entity.employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class employeeService {

    private final employeeRepository employeeRepository;

    public employee postEmployee(employee employee){
        return employeeRepository.save(employee);
    }
}
