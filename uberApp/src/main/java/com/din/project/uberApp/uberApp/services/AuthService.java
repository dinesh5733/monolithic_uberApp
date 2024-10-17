package com.din.project.uberApp.uberApp.services;

import com.din.project.uberApp.uberApp.dto.DriverDTO;
import com.din.project.uberApp.uberApp.dto.SignUpDTO;
import com.din.project.uberApp.uberApp.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);
    UserDTO signup(SignUpDTO signUpDTO);
    DriverDTO onboardingNewDriver(Long userId);


}
