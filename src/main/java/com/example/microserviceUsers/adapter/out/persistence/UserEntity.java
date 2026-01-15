package com.example.microserviceUsers.adapter.out.persistence;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String last;
    private String identityDocument;
    private String numberCellphone;
    private Date dateBirthday;
    private String email;
    private String password;
    private String role;

    public UserEntity(Long id, String name, String last, String identityDocument, String numberCellphone, Date dateBirthday, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.last = last;
        this.identityDocument = identityDocument;
        this.numberCellphone = numberCellphone;
        this.dateBirthday = dateBirthday;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserEntity() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
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

