package com.example.truyvandulieu.service;

import com.example.truyvandulieu.model.Post;
import com.example.truyvandulieu.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPost(){
        return postRepository.findAll();
    }
    public List<Object[]> getPostByGenreName(String genreName){
        return postRepository.getPostByGenreName(genreName);
    }
    public List<Object[]> getPostByAuthorName(String author){
        return postRepository.getPostByAuthorName(author);
    }
}
