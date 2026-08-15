package com.devsuperior.Desafio5.services;

import com.devsuperior.Desafio5.entities.User;
import com.devsuperior.Desafio5.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSelfOrAdmin(Long userId) {
        User user = userService.authenticate();
        if(!user.hasRole("ROLE_ADMIN") && !user.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }

}
