package com.example.truyvandulieu.repository;

import com.example.truyvandulieu.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Genre,Integer> {
}
