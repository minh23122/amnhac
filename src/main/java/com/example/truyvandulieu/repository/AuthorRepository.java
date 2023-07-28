package com.example.truyvandulieu.repository;

import com.example.truyvandulieu.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
