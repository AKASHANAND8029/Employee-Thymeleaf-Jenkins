package com.example.employeethymeleaf.service;

import com.example.employeethymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);
}
