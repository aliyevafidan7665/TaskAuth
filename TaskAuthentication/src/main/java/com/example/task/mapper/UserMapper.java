package com.example.task.mapper;

import java.util.List;
import com.example.task.dto.UserDto;
import com.example.task.security.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toUserDto(User user);

    List<UserDto> toUserDto(List<User> user);

    User toUser(UserDto userDto);
}
