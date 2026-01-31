package com.example.microserviceUsers.domain.port.out;

import com.example.microserviceUsers.domain.model.Roles;

public interface TokenProvider {
    String generateToken(String email,Roles role);
    boolean validateToken(String token);
    String getEmail(String token);
    Roles getRole(String token);
}
