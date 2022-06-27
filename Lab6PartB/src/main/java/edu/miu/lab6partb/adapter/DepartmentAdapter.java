package edu.miu.lab6partb.adapter;

import edu.miu.lab6partb.DTO.DepartmentDTO;
import edu.miu.lab6partb.domain.Department;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentAdapter {
    public static Department getDepartment(DepartmentDTO departmentDTO){
        return new Department(departmentDTO.getName());
    }
    public static DepartmentDTO getDepartmentDTO(Department department){
        return new DepartmentDTO(department.getName());
    }
    public List<DepartmentDTO> DepartmentDTOList(List<Department> departments){
        return departments.stream().map(DepartmentAdapter::getDepartmentDTO).collect(Collectors.toList());
    }
}
