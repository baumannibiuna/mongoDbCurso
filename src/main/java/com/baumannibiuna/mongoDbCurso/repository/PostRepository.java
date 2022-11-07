package com.baumannibiuna.mongoDbCurso.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.baumannibiuna.mongoDbCurso.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
}
