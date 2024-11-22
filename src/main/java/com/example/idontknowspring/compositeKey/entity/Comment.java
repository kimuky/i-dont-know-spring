package com.example.idontknowspring.compositeKey.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Comment extends BaseEntity {

    @EmbeddedId
    private CommentId commentId;

    @MapsId("postId")
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post postId;

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    private String comments;

    public Comment(User user, Post post, String comments) {
        this.commentId = new CommentId(user.getId(), post.getId());
        this.postId = post;
        this.userId = user;
        this.comments = comments;
    }

    public Comment() {
    }
}
