package edu.miu.lab4parta.a.service;

import edu.miu.lab4parta.a.domain.Department;

import java.util.List;

public interface IDepartmentService {
    void save(Department department);
    List<Department> findAll();
}
