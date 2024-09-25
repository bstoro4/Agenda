package com.agenda.contactos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {
    private final String jsonFilePath = "src/main/resources/users.json";
    
    // Método para obtener todos los contactos
    public List<Contact> getAllContacts() throws IOException {
        // Lee el contenido del archivo JSON como String
        String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

        // Crea una instancia de ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Usa TypeReference para deserializar a una lista de Contact
        List<Contact> contacts = objectMapper.readValue(jsonContent, new TypeReference<List<Contact>>() {});

        return contacts;
    }
    
    public List<Contact> getContactsByGender(String gender) throws IOException {
        return getAllContacts().stream()
            .filter(contact -> contact.getGender().equalsIgnoreCase(gender))
            .collect(Collectors.toList());
    }

    public List<Contact> getContactsByInitLetter(char letter) throws IOException {
        return getAllContacts().stream()
            .filter(contact -> contact.getName().toUpperCase().startsWith(String.valueOf(letter).toUpperCase()))
            .collect(Collectors.toList());
    }
}
