package com.example.idontknowspring.compositeKey.controller;

import com.example.idontknowspring.compositeKey.dto.PostRequestDto;
import com.example.idontknowspring.compositeKey.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Void> CreatePost (@RequestBody PostRequestDto requestDto) {

        postService.createPost(requestDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
