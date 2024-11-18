package com.example.idontknowspring.repository;

import com.example.idontknowspring.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
