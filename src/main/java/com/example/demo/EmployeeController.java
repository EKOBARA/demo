package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeEntity> RegiterEmployee(@RequestBody EmployeeEntity employeeEntity){

        return ResponseEntity.ok(employeeService.saveEmployee(employeeEntity));
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployee(){

        return employeeService.getAllEmployee();
    }


}
