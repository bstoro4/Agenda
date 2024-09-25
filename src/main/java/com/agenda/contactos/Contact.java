package com.agenda.contactos;

public class Contact {
    private int id;
    private String address;
    private String cell_phone;
    private String email;
    private String gender;
    private String identification;
    private String name;

    // Constructor vacío
    public Contact() {}

    // Constructor con todos los campos
    public Contact(int id, String address, String cell_phone, String email, String gender, String identification, String name) {
        this.id = id;
        this.address = address;
        this.cell_phone = cell_phone;
        this.email = email;
        this.gender = gender;
        this.identification = identification;
        this.name = name;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método toString para facilitar la impresión del objeto Contact
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", cell_phone='" + cell_phone + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

