package com.example.microserviceUsers.adapter.in.web.dto;

import lombok.*;

import java.util.Date;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserDtoRequest {
    private String name;
    private String last;
    private int identityDocument;
    private String numberCellphone;
    private Date dateBirthday;
    private String email;
    private String password;

}
