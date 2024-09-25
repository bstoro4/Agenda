package com.agenda.contactos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/agenda")
public class ContactController extends SpringBootServletInitializer {
    @Autowired
    private ContactService contactService;

    @GetMapping("/getContacts")
    public List<Contact> getContacts() throws IOException {
        return contactService.getAllContacts();
    }

    @GetMapping("/getContactsByGender/{gender}")
    public List<Contact> getContactsByGender(@PathVariable String gender) throws IOException {
        return contactService.getContactsByGender(gender);
    }

    @GetMapping("/getContactsByInitLetter/{letter}")
    public List<Contact> getContactsByInitLetter(@PathVariable char letter) throws IOException {
        return contactService.getContactsByInitLetter(letter);
    }
}
