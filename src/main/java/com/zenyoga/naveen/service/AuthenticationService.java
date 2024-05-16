package com.zenyoga.naveen.service;

import com.zenyoga.naveen.dto.request.ForgotPasswordRequest;
import com.zenyoga.naveen.dto.request.LoginRequest;
import com.zenyoga.naveen.dto.request.RegisterRequest;
import com.zenyoga.naveen.dto.response.ForgotPasswordResponse;
import com.zenyoga.naveen.dto.response.LoginResponse;
import com.zenyoga.naveen.dto.response.RegisterResponse;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

     void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
   
    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);
    LoginResponse login(LoginRequest request);
}
