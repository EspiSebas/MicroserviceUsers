package com.example.microserviceUsers.domain.model;

import java.util.Date;

public class Users {
    private String name;
    private String last;
    private int identityDocument;
    private String numberCellphone;
    private Date dateBirthday;
    private String email;
    private String password;
    private final Roles role;

    public Roles getRole() {
        return role;
    }

    public Users(String name, String last, int identityDocument, String numberCellphone, Date dateBirthday, String email, String password, Roles role) {
        this.name = name;
        this.last = last;
        this.identityDocument = identityDocument;
        this.numberCellphone = numberCellphone;
        this.dateBirthday = dateBirthday;
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

    public String getNumberCellphone() {
        return numberCellphone;
    }

    public void setNumberCellphone(String numberCellphone) {
        this.numberCellphone = numberCellphone;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
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
