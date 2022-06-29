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
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String cellphone;
    private String homephone;

    public Contact(String email, String cellphone, String homephone) {
        this.email = email;
        this.cellphone = cellphone;
        this.homephone = homephone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", cellphone='").append(cellphone).append('\'');
        sb.append(", homephone='").append(homephone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
