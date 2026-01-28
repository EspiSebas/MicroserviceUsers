package com.example.microserviceUsers.adapter.in.web.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LoginDtoRequest {
    private String email;
    @Email(message = "Email format is invalid")
    private String password;

}
