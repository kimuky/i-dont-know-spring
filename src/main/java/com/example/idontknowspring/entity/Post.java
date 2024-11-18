package com.example.idontknowspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Post extends  BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String comments;

    @ManyToOne
    @Setter
    @JoinColumn(name = "user_id")
    private User user;

}
