package com.malonbc.facebookcloneservice.controller;

import com.malonbc.facebookcloneservice.model.Post;
import com.malonbc.facebookcloneservice.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http:localhost:3000")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post addPost(@RequestBody Post postBody) throws Exception {
        String strPost = postBody.getPost();
        System.out.println(postBody);
        String email = postBody.getEmail();
        String name = postBody.getName();
        String file = postBody.getFile();
        String profilePic = postBody.getProfilePic();

        Post post = Post.builder()
                .file(file).name(name).email(email).profilePic(profilePic).post(strPost).timeStamp(new Date().toString()).build();
        post = postService.addPost(post);
        return post;
    }

    @GetMapping
    public List<Post> getPost() {
        return postService.getPost();
    }
}
