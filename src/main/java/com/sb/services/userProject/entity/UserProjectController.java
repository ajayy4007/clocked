package com.sb.services.userProject.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userproject")
public class UserProjectController {
	@Autowired
	UserProjectServices userProjectServices;
	@Autowired
	UserProjectRepository userProjectRepository;
	
	@GetMapping("/id")
	public UserProjectEntity getUserProject(@RequestParam int id) {
		return userProjectServices.getUserProjectEntityByUpId(id);
	}

	@PostMapping("/save")
	public ResponseEntity<UserProjectResponse> saveUserProject(@RequestBody UserProjectRequest userProjectRequest) {
		return userProjectServices.saveUserProject(userProjectRequest);

	}
}
