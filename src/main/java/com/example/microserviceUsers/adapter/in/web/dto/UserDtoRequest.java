package com.example.microserviceUsers.adapter.in.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.time.LocalDate;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserDtoRequest {
    private String name;
    private String last;
    private int identityDocument;
    private String numberCellphone;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    @NotBlank(message = "Email is required")
    @Email(message = "Email format is invalid")
    private String email;
    private String password;

}
