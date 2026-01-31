package com.example.microserviceUsers.config;

import com.example.microserviceUsers.domain.port.in.UserUseCase;
import com.example.microserviceUsers.domain.port.out.TokenProvider;
import com.example.microserviceUsers.domain.port.out.UsersRepository;
import com.example.microserviceUsers.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class BeanConfig {

    @Bean
    public UserUseCase userUseCase(UsersRepository usersRepository, TokenProvider tokenProvider, PasswordEncoder passwordEncoder){
        return new UserService(usersRepository, tokenProvider,passwordEncoder);
    }
}
