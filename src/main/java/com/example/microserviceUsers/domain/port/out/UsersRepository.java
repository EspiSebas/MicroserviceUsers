package com.example.microserviceUsers.domain.port.out;

import com.example.microserviceUsers.domain.model.Users;
import org.apache.catalina.User;

public interface UsersRepository {
    Users saveUser(Users users);
    Users logInUser(Users users);
}
