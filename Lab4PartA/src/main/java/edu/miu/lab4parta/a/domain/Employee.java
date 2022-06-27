package edu.miu.lab4parta.a.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue()
    private long EmployeeNumber;
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(String name) {
        this.name = name;
    }
}
