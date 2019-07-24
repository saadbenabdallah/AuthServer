package com.b2i.AuthServer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2i.AuthServer.model.User;
import com.b2i.AuthServer.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User getOne(Long id) {
		
		return userRepository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		userRepository.delete(id);
		
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	

	
}
