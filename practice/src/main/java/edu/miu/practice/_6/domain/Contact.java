package edu.miu.practice._6.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class Contact {
    private String email;
    private String cellphone;
    private String homephone;

    public Contact(String email, String cellphone, String homephone) {
        this.email = email;
        this.cellphone = cellphone;
        this.homephone = homephone;
    }
}
