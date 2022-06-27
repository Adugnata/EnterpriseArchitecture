package edu.miu.practice._3.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address address;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
