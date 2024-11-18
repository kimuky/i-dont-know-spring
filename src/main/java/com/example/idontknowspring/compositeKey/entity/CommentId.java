package com.example.idontknowspring.compositeKey.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "post_id")
    private Long post_id;

    public CommentId(String userId, Long postId) {
        this.user_id = userId;
        this.post_id = postId;
    }

    public CommentId() {

    }
}
