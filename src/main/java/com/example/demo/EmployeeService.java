package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepo  employeeRepo;
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {

        return employeeRepo.save(employeeEntity);
    }

    public List<EmployeeEntity> getAllEmployee() {

        return employeeRepo.findAll();
    }
}
