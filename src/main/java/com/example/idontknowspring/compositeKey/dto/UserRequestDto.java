package com.example.idontknowspring.compositeKey.dto;

import lombok.Getter;

@Getter
public class UserRequestDto {

    private final String id;

    private final String username;

    private final String password;

    public UserRequestDto(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
