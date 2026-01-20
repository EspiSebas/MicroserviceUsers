package com.example.microserviceUsers.config;

import com.example.microserviceUsers.domain.port.in.UserUseCase;
import com.example.microserviceUsers.domain.port.out.UsersRepository;
import com.example.microserviceUsers.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserUseCase userUseCase(UsersRepository usersRepository){
        return new UserService(usersRepository);
    }
}
