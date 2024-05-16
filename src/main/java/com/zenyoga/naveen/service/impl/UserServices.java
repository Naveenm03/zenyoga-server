package com.zenyoga.naveen.service.impl;

import java.security.Principal;

import com.zenyoga.naveen.dto.request.PasswordRequest;

public interface UserServices {
     void forgotPassword(PasswordRequest request, Principal principal);
    
}
