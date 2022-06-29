package edu.miu.practice._5.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
