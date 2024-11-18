package com.example.idontknowspring.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Comment extends BaseEntity {

    @EmbeddedId
    private CommentId commentId;

    private String comments;

}
