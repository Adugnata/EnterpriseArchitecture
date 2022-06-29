package edu.miu.practice._4.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String websiteURL;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Employee> employees;
    @ManyToOne(cascade = CascadeType.ALL)
    private ContactData contactData;

    public Company(String name, String websiteURL) {
        this.name = name;
        this.websiteURL = websiteURL;
        employees = new ArrayList<>();
    }
    public void addEmployee(String name, String email,Address address){
        Employee employee = new Employee( name, email);
        employee.setAddress(address);
        employees.add(employee);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", websiteURL='").append(websiteURL).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
