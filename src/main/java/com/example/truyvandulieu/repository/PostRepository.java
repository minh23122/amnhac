package com.example.truyvandulieu.repository;

import com.example.truyvandulieu.model.Genre;
import com.example.truyvandulieu.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {
    @Query("select p from Post p join p.genre g where g.name=:genreName")
    List<Object[]> getPostByGenreName(String genreName);
    @Query("select p from Post p join p.author a where a.name=:authorName")
    List<Object[]> getPostByAuthorName(String authorName);
}
