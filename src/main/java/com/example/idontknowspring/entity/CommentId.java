package com.example.idontknowspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {


    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "post_io")
    private Long post_id;
}
