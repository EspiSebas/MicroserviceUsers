package com.example.microserviceUsers.domain.service;

import com.example.microserviceUsers.domain.model.Roles;
import com.example.microserviceUsers.domain.model.Users;
import com.example.microserviceUsers.domain.port.in.UserUseCase;
import com.example.microserviceUsers.domain.port.out.UsersRepository;


public class UserService implements UserUseCase {

    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Override
    public Users saveUser(Users users) {
        if(users.getRole() != Roles.AUX_STOCK){
            throw new IllegalArgumentException("Role invalid");
        }
        return usersRepository.saveUser(users);
    }

    @Override
    public Users logInUser(String email, String password) {
        return null;
    }
}
