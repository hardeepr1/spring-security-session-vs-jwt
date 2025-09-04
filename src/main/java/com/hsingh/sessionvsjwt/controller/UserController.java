package com.hsingh.sessionvsjwt.controller;

import com.hsingh.sessionvsjwt.dto.UserCreateRequestDto;
import com.hsingh.sessionvsjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> createUser(UserCreateRequestDto userCreateRequestDto){
        userService.create(userCreateRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
