package com.example.idontknowspring.compositeKey.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Comment extends BaseEntity {

    @EmbeddedId
    private CommentId commentId;

    private String comments;

    public Comment(String userId, Long postId, String comments) {
        this.commentId = new CommentId(userId, postId);
        this.comments = comments;
    }

    public Comment() {
    }
}
