package com.baumannibiuna.mongoDbCurso.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.baumannibiuna.mongoDbCurso.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
