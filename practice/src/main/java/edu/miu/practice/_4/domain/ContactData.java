package edu.miu.practice._4.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class ContactData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phone;
    private String email;
    private String whatsapp;

    public ContactData(String phone, String email, String whatsapp) {
        this.phone = phone;
        this.email = email;
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactData{");
        sb.append("id=").append(id);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", whatsapp='").append(whatsapp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
