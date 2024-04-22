package com.example.task.service;

import java.util.List;
import com.example.task.dto.UserDto;
import com.example.task.security.user.User;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto findByEmail(String email);

    void editUser(UserDto userDto, String email);
}
