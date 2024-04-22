package com.example.task.service.impl;

import java.util.List;
import com.example.task.dto.UserDto;
import com.example.task.mapper.UserMapper;
import com.example.task.security.user.User;
import com.example.task.security.user.UserRepository;
import com.example.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {

        List<User> users = userRepository.findAll();
        return userMapper.toUserDto(users);
    }

    @Override
    public UserDto findByEmail(String email) {
        return userRepository.findByEmail(email).map(userMapper::toUserDto)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public void editUser(UserDto userDto, String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        userRepository.save(user);
    }
}
