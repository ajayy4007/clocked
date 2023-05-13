package com.sb.services.userTask.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usertask")
public class UserTaskController {
	@Autowired
	UserTaskServices userTaskServices;
	@Autowired
	UserTaskRepository userTaskRepository;

	@GetMapping("/id")
	public UserTaskEntity getUserTask(@RequestParam int utid) {
		return userTaskServices.getUserTaskEntityByUtId(utid);
	}

	@PostMapping("/save")
	public ResponseEntity<UserTaskResponse> saveUserTask(@RequestBody UserTaskRequest userTaskRequest) {
		return userTaskServices.saveUserTask(userTaskRequest);

	}
}
