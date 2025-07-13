package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    private final String secretKey = "MySuperSecretKeyForJWTThatShouldBeLongEnough!123456"; // At least 256-bit

    @RequestMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            final String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];
            if ("user".equals(username) && "pwd".equals(password)) {
                Key key = Keys.hmacShaKeyFor(secretKey.getBytes());
                String token = Jwts.builder()
                        .setSubject(username)
                        .setIssuedAt(new Date(System.currentTimeMillis()))
                        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                        .signWith(key, SignatureAlgorithm.HS256)
                        .compact();
                return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
            } else {
                return ResponseEntity.status(401).body("Invalid Credentials");
            }
        }
        return ResponseEntity.badRequest().body("Missing or invalid Authorization header");
    }
}
