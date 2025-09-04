package com.hsingh.sessionvsjwt.mapper;
import com.hsingh.sessionvsjwt.dto.UserCreateRequestDto;
import com.hsingh.sessionvsjwt.entity.User;

//TODO: ADD mapper logic
public class UserMapper {
    public static User toEntity(UserCreateRequestDto userCreateRequestDto) {
        User user = new User();
        return user;
    }

}
