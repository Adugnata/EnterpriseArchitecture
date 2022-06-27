package edu.miu.lab4parta.a.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue()
    private long id;
    private String name;
    @JoinTable(name="dept_emp",
    joinColumns = {@JoinColumn(name="d_id")},inverseJoinColumns = {@JoinColumn(name="e_id")})
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
    }
    public void addEmployee(Employee employee){
        if(Objects.equals(employees,null)) employees = new ArrayList<>();
        employees.add(employee);
    }
}
