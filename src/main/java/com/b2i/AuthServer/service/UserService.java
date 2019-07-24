package com.b2i.AuthServer.service;

import java.util.List;
import java.util.Optional;

import com.b2i.AuthServer.model.User;

public interface UserService {

	public List<User> findAll();

	public void save(User user);

	public void deleteById(Long id);

	public Optional<User> findById(Long id);

	User getOne(Long id);
}
