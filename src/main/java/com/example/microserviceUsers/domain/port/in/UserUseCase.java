package com.example.microserviceUsers.domain.port.in;


import com.example.microserviceUsers.domain.model.Users;



public interface UserUseCase {
    Users saveUser(Users users);
    String logInUser(String email, String password);

}
