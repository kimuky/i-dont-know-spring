package com.example.idontknowspring.compositeKey.controller;


import com.example.idontknowspring.compositeKey.dto.CommentRequestDto;
import com.example.idontknowspring.compositeKey.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<Void> createComment (@RequestBody CommentRequestDto requestDto) {

        commentService.createComment(requestDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
