package com.contact.service;

import com.contact.domain.Contact;

import java.util.Collection;

public interface IContactService {
    void add(Contact contact);
    void update(Contact contact);
    Contact findByFirstName(String firstName);
    void delete(String firstName);
    Collection<Contact> findAll();
}
