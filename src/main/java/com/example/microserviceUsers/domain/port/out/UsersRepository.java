package com.example.microserviceUsers.domain.port.out;

import com.example.microserviceUsers.adapter.out.persistence.UserEntity;
import com.example.microserviceUsers.domain.model.Users;

import java.util.Optional;

public interface UsersRepository {
    Users saveUser(Users users);
    Users logInUser(Users users);
    boolean existsByEmail(String email);

    Optional<Users> findByEmail(String email);
}
