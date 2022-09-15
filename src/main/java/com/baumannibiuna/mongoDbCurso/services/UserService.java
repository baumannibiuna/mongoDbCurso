package com.baumannibiuna.mongoDbCurso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baumannibiuna.mongoDbCurso.domain.User;
import com.baumannibiuna.mongoDbCurso.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();		
	}

}
