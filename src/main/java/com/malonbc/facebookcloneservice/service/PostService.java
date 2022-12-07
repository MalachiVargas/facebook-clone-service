package com.malonbc.facebookcloneservice.service;

import com.malonbc.facebookcloneservice.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
