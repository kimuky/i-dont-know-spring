package com.example.idontknowspring.compositeKey.dto;


import lombok.Getter;

@Getter
public class PostRequestDto {

    private final String user_id;

    private final String title;

    private final String contents;

    public PostRequestDto(String user_id, String title, String contents) {
        this.user_id = user_id;
        this.title = title;
        this.contents = contents;
    }
}
