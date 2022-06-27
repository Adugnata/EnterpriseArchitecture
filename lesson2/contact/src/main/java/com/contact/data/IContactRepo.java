package com.contact.data;

import com.contact.domain.Contact;

import java.util.Collection;

public interface IContactRepo {
    void save(Contact contact);
    Contact findByFirstName(String firstName);
    void delete(String firstName);
    Collection<Contact> findAll();
}
