package com.adn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adn.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
