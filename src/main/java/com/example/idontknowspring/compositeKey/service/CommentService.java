package com.example.idontknowspring.compositeKey.service;

import com.example.idontknowspring.compositeKey.dto.CommentRequestDto;
import com.example.idontknowspring.compositeKey.entity.Comment;
import com.example.idontknowspring.compositeKey.entity.Post;
import com.example.idontknowspring.compositeKey.entity.User;
import com.example.idontknowspring.compositeKey.repository.CommentRepository;
import com.example.idontknowspring.compositeKey.repository.PostRepository;
import com.example.idontknowspring.compositeKey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Transactional
    public void createComment(CommentRequestDto requestDto) {

        User user = userRepository.findById(requestDto.getUser_id()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Post post = postRepository.findById(requestDto.getPost_id()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Comment comment = new Comment(user, post, requestDto.getContents());

        commentRepository.save(comment);
    }
}
