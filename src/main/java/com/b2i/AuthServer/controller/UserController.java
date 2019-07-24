/*package com.b2i.AuthServer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b2i.AuthServer.model.User;
import com.b2i.AuthServer.service.UserService;


@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	UserService userService;

	@GetMapping(value="users")
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> list(){
		
		return userService.findAll();
	}
	
	@GetMapping(value="/users/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public User get(@PathVariable("id") Long id) {
		return userService.getOne(id);
	}
	
	@PostMapping(value="users")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody User user) {
		userService.save(user);
	}
	
	@DeleteMapping(value="/users/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void delete(@PathVariable("id") Long id) {
		userService.deleteById(id);
	}
	
	@PutMapping(value="/users/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Object> update(@RequestBody User user, @PathVariable("id") Long id) {

		Optional<User> userOptional = userService.findById(id);

		if (!userOptional.isPresent())
			return ResponseEntity.notFound().build();

		user.setId(id);
		user.setPassword(encoder.encode(user.getPassword()));
		userService.save(user);

		return ResponseEntity.noContent().build();
	}	
}
	*/