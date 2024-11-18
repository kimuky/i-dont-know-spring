package com.example.idontknowspring.service;

import com.example.idontknowspring.dto.UserRequestDto;
import com.example.idontknowspring.entity.User;
import com.example.idontknowspring.repository.UserRepository;
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
