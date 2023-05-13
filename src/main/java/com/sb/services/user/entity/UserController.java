package com.sb.services.user.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserServices userServices;

	@GetMapping("/all")
	public ResponseEntity<UserResponse> getAllUsers() {
		return userServices.getAllUsers();
	}

	@PostMapping("/save")
	public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userRequest) {
		return userServices.saveUser(userRequest);
	}

	@GetMapping("/id")
	public UserEntity getUser(@RequestParam int id) {
		return userServices.getUserById(id);
	}

	@GetMapping("/login")
	public void loginUser(@RequestBody UserRequest userRequest) {
		userServices.loginUser(userRequest);
	}

	@PutMapping("/update")

	public void updateUser(@RequestBody UserEntity user) {
		userServices.updateUser(user);
	}
	@GetMapping("/name")
	public List<UserEntity> findUserEntityByName(@RequestParam String name) {
		return (List<UserEntity>) userServices.findUserEntityByName(name);
	}
}