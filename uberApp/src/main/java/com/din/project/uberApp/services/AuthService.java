package com.din.project.uberApp.services;

import com.din.project.uberApp.dto.DriverDTO;
import com.din.project.uberApp.dto.SignUpDTO;
import com.din.project.uberApp.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);
    UserDTO signup(SignUpDTO signUpDTO);
    DriverDTO onboardingNewDriver(Long userId);


}
