package com.example.sbfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "post-service", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {

    @GetMapping("/posts")
    List<PostDto> getAllPosts();

    @GetMapping("/posts/{id}")
    PostDto getPostById(@PathVariable int id);

    @PostMapping("/posts")
    PostDto createPost(PostDto postDto);

    @DeleteMapping("/{id}")
    void deletePostById(@PathVariable int id);
}
