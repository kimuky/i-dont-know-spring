package com.example.idontknowspring.entity;

import com.example.idontknowspring.dto.UserRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class User extends BaseEntity{

    @Id
    private String id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;


    public User(UserRequestDto requestDto) {
        this.id = requestDto.getId();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }

    public User() {

    }
}
