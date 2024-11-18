package com.example.idontknowspring.compositeKey.controller;


import com.example.idontknowspring.compositeKey.dto.UserRequestDto;
import com.example.idontknowspring.compositeKey.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> createUser (@RequestBody UserRequestDto requestDto) {
        userService.createUser(requestDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
