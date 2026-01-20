package com.example.microserviceUsers.adapter.in.web;

import com.example.microserviceUsers.adapter.in.web.dto.UserDtoRequest;
import com.example.microserviceUsers.domain.model.Roles;
import com.example.microserviceUsers.domain.model.Users;
import com.example.microserviceUsers.domain.port.in.UserUseCase;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserController {
    private final UserUseCase userUseCase;
    private PasswordEncoder passwordEncoder;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping("createUser")
    public void createUser(@RequestBody UserDtoRequest userDtoRequest){

        String passwordBcrypt = passwordEncoder.encode(userDtoRequest.getPassword());

        Users user = new Users(
                userDtoRequest.getName(),
                userDtoRequest.getLast(),
                userDtoRequest.getIdentityDocument(),
                userDtoRequest.getNumberCellphone(),
                userDtoRequest.getBirthDate(),
                userDtoRequest.getEmail(),
                passwordBcrypt,
                Roles.AUX_STOCK
        );

        userUseCase.saveUser(user);

    }
}
