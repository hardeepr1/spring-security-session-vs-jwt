package com.hsingh.sessionvsjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequestDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
}
