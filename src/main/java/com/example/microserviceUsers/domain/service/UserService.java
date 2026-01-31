package com.example.microserviceUsers.domain.service;

import com.example.microserviceUsers.domain.model.Roles;
import com.example.microserviceUsers.domain.model.Users;
import com.example.microserviceUsers.domain.port.in.UserUseCase;
import com.example.microserviceUsers.domain.port.out.TokenProvider;
import com.example.microserviceUsers.domain.port.out.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;


public class UserService implements UserUseCase {

    private final UsersRepository usersRepository;
    private final TokenProvider tokenProvider;
    private final PasswordEncoder passwordEncoder;

    public UserService(UsersRepository usersRepository, TokenProvider tokenProvider, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.tokenProvider = tokenProvider;
        this.passwordEncoder = passwordEncoder;
    }



    @Override
    public Users saveUser(Users users) {
        if(users.getRole() != Roles.AUX_STOCK){
            throw new IllegalArgumentException("Role invalid");
        }
        return usersRepository.saveUser(users);
    }

    @Override
    public String logInUser(String email, String password) {
        Users user = usersRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        return tokenProvider.generateToken(
                user.getEmail(),
                user.getRole()
        );
    }
}
