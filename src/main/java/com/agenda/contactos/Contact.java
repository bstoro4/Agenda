package com.agenda.contactos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "identification", "name", "address", "cellPhone", "email", "gender" })
public class Contact {
    private int id;
    private String identification;
    private String name;
    private String address;
    private String cellPhone;
    private String email;
    private String gender;

    // Constructor vacío
    public Contact() {}

    // Constructor con todos los campos
    public Contact(int id, String identification, String name, String address, String cellPhone, String email, String gender ) {
        this.id = id;
        this.identification = identification;
        this.name = name;        
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.gender = gender;
    }

    // Getters y Setters

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("cellPhone")
    public String getcellPhone() {
        return cellPhone;
    }

    public void setcellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





    // Método toString para facilitar la impresión del objeto Contact
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +                
                ", cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +              
                
                '}';
    }
}

