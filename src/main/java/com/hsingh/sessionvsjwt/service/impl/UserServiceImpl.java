package com.hsingh.sessionvsjwt.service.impl;

import com.hsingh.sessionvsjwt.dto.UserCreateRequestDto;
import com.hsingh.sessionvsjwt.entity.User;
import com.hsingh.sessionvsjwt.repository.UserRepository;
import com.hsingh.sessionvsjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void create(UserCreateRequestDto userCreateRequestDto) {
        User user = new User();

        user.setFirstName(userCreateRequestDto.getFirstName());
        user.setLastName(userCreateRequestDto.getLastName());
        user.setEmailId(userCreateRequestDto.getEmailAddress());
        //TODO: Password should be encrypted and hashed before storing it to database
        user.setPassword(userCreateRequestDto.getPassword());

        userRepository.save(user);
    }
}
