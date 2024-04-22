package com.example.task.controller;


import java.util.List;
import com.example.task.dto.UserDto;
import com.example.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    public UserDto getAllUsers(@PathVariable String email) {
        return userService.findByEmail(email);
    }


    @PostMapping("/{email}")
    public void editUser(@RequestBody UserDto userDto, @PathVariable String email) {
        userService.editUser(userDto, email);
    }


}
