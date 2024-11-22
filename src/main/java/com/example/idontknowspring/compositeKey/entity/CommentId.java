package com.example.idontknowspring.compositeKey.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {

    private String userId;

    private Long postId;

    public CommentId(String userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public CommentId() {

    }
}
