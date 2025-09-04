package com.hsingh.sessionvsjwt.service;

import com.hsingh.sessionvsjwt.dto.UserCreateRequestDto;

public interface UserService {
    void create(UserCreateRequestDto user);
}
