package com.tekarch.TAF_UserService.Service.Interface;

import com.tekarch.TAF_UserService.Model.User;

public interface UserService
{
    User registerUser(User user);
    User loginUser(Long userId);
    void updateUser(Long userId,User user);
}


