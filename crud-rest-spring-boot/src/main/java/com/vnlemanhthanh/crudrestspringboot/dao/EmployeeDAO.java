package com.vnlemanhthanh.crudrestspringboot.dao;

import com.vnlemanhthanh.crudrestspringboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
