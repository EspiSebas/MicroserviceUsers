package com.example.microserviceUsers.adapter.out.security;

import com.example.microserviceUsers.domain.model.Roles;
import com.example.microserviceUsers.domain.port.out.TokenProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider implements TokenProvider {


    private final String secretKey="50501209-498b-45da-993a-7f4a9b502a02";

    private final long expiration = 3600000;

    @Override
    public String generateToken(String email,Roles role) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() +  expiration);

        return Jwts.builder()
                .setSubject(email)
                .claim("role", role.name())
                .setIssuedAt(now)
                .setExpiration(expiry)
                .signWith(
                        Keys.hmacShaKeyFor(secretKey.getBytes()),
                        SignatureAlgorithm.HS256
                )
                .compact();
    }

    @Override
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(secretKey.getBytes())
                    .build()
                    .parseClaimsJws(token);

            return true;
        } catch (JwtException e){
            return false;
        }
    }

    @Override
    public String getEmail(String token) {
        return getClaims(token).getSubject();
    }

    @Override
    public Roles getRole(String token) {
        String role = getClaims(token).get("role", String.class);
        return Roles.valueOf(role);
    }

    private Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

}
