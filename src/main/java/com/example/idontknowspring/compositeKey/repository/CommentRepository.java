package com.example.idontknowspring.compositeKey.repository;

import com.example.idontknowspring.compositeKey.entity.Comment;
import com.example.idontknowspring.compositeKey.entity.CommentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment, CommentId> {
}
