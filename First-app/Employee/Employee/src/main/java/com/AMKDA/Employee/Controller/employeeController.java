package com.AMKDA.Employee.Controller;


import com.AMKDA.Employee.Service.employeeService;
import com.AMKDA.Employee.entity.employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class employeeController {

    private final employeeService employeeService;

    @PostMapping("/employee")
    public employee postEmployee (@RequestBody employee employee){
        return employeeService.postEmployee(employee);
    }
}
