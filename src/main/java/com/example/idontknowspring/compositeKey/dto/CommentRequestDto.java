package com.example.idontknowspring.compositeKey.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {

    private final String user_id;

    private final Long post_id;

    private final String contents;

    public CommentRequestDto(String user_id, Long post_id, String contents) {
        this.user_id = user_id;
        this.post_id = post_id;
        this.contents = contents;
    }
}
