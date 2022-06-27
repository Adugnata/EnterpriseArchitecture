package edu.miu.practice._3.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String websiteURL;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private ContactData contactData;

    public Company(Long id, String name, String websiteURL) {
        this.id = id;
        this.name = name;
        this.websiteURL = websiteURL;
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
