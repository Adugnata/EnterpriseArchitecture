package edu.miu.lab4parta.a.service;

import edu.miu.lab4parta.a.Repo.DepartmentRepo;
import edu.miu.lab4parta.a.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public void save(Department department) {
        departmentRepo.save(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }
}
