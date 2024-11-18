package com.example.idontknowspring.compositeKey.service;

import com.example.idontknowspring.compositeKey.dto.UserRequestDto;
import com.example.idontknowspring.compositeKey.entity.User;
import com.example.idontknowspring.compositeKey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserRequestDto requestDto) {

        User user = new User(requestDto);

        userRepository.save(user);
    }
}
