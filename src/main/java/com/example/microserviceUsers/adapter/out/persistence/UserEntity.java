package com.example.microserviceUsers.adapter.out.persistence;

import com.example.microserviceUsers.domain.model.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String last;
    private int identityDocument;
    private String phoneNumber;
    private LocalDate birthDate;
    private String email;
    private String password;
    private Roles role;

    public UserEntity(Long id, String name, String last, int identityDocument, String phoneNumber, LocalDate birthDate, String email, String password, Roles role) {
        this.id = id;
        this.name = name;
        this.last = last;
        this.identityDocument = identityDocument;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserEntity() {

    }

}

