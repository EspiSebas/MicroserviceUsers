package com.example.microserviceUsers.domain.model;

import java.time.LocalDate;

public class Users {
    private String name;
    private String last;
    private int identityDocument;
    private String phoneNumber;
    private LocalDate birthDate;
    private String email;
    private String password;
    private final Roles role;

    public Roles getRole() {
        return role;
    }

    public Users(String name, String last, int identityDocument, String phoneNumber, LocalDate birthDate, String email, String password, Roles role) {


        this.name = name;
        this.last = last;
        this.identityDocument = identityDocument;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(int identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getbirthDate() {
        return birthDate;
    }

    public void setbirthDate(LocalDate dateBirthday) {
        this.birthDate = dateBirthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
