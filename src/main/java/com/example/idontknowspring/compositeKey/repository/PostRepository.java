package com.example.idontknowspring.compositeKey.repository;

import com.example.idontknowspring.compositeKey.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
