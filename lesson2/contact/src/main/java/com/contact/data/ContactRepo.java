package com.contact.data;

import com.contact.domain.Contact;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ContactRepo implements IContactRepo {
    private Map<String, Contact> contacts = new HashMap<>();

    @Override
    public void save(Contact contact) {
        contacts.put(contact.getFirstName(), contact);
    }

    @Override
    public Contact findByFirstName(String firstName) {
        return contacts.get(firstName);
    }

    @Override
    public void delete(String firstName) {
        contacts.remove(firstName);
    }

    @Override
    public Collection<Contact> findAll() {
        return contacts.values();
    }
}
