package com.contact.service;

import com.contact.data.IContactRepo;
import com.contact.domain.Contact;
import com.contact.integration.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ContactService implements IContactService {
    @Autowired
    IContactRepo contactRepo;
    @Autowired
    EmailSender emailSender;

    @Override
    public void add(Contact contact) {
        contactRepo.save(contact);
        emailSender.sendEmail(contact.getEmail(), "Welcome");
    }

    @Override
    public void update(Contact contact) {
        contactRepo.save(contact);
    }

    @Override
    public Contact findByFirstName(String firstName) {
        return contactRepo.findByFirstName(firstName);
    }

    @Override
    public void delete(String firstName) {
        Contact contact = contactRepo.findByFirstName(firstName);
        emailSender.sendEmail(contact.getEmail(), "Good bye");
        contactRepo.delete(firstName);
    }

    @Override
    public Collection<Contact> findAll() {
        return contactRepo.findAll();
    }
}
