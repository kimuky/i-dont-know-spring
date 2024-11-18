package com.example.idontknowspring.compositeKey.service;

import com.example.idontknowspring.compositeKey.dto.CommentRequestDto;
import com.example.idontknowspring.compositeKey.entity.Comment;
import com.example.idontknowspring.compositeKey.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public void createComment(CommentRequestDto requestDto) {

        Comment comment = new Comment(requestDto.getUser_id(), requestDto.getPost_id(), requestDto.getContents());

        commentRepository.save(comment);
    }
}
