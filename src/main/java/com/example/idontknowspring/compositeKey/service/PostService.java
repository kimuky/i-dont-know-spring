package com.example.idontknowspring.compositeKey.service;

import com.example.idontknowspring.compositeKey.dto.PostRequestDto;
import com.example.idontknowspring.compositeKey.entity.Post;
import com.example.idontknowspring.compositeKey.entity.User;
import com.example.idontknowspring.compositeKey.repository.PostRepository;
import com.example.idontknowspring.compositeKey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Transactional
    public void createPost(PostRequestDto  requestDto) {

        User findUser = userRepository.findById(requestDto.getUser_id()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Post post = new Post(requestDto);
        post.setUser(findUser);

        postRepository.save(post);
    }
}
