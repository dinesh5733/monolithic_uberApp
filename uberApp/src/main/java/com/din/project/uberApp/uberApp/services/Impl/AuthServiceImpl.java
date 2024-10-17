package com.din.project.uberApp.uberApp.services.Impl;

import com.din.project.uberApp.uberApp.dto.DriverDTO;
import com.din.project.uberApp.uberApp.dto.SignUpDTO;
import com.din.project.uberApp.uberApp.dto.UserDTO;
import com.din.project.uberApp.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardingNewDriver(Long userId) {
        return null;
    }
}
