package com.sb.services.projectTask.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.services.model.BussinesError;
import com.sb.services.user.entity.User;
import com.sb.services.user.entity.UserEntity;
import com.sb.services.user.entity.UserResponse;

@RestController
@RequestMapping("/projecttask")
public class ProjectTaskController {
	@Autowired
	ProjectTaskServices projectTaskServices;
	@Autowired
	ProjectTaskRepository projectTaskRepository;

	@GetMapping("/id")
	public ProjectTaskEntity getProjectTask(@RequestParam int id) {
		return projectTaskServices.getProjectTaskEntityByPtId(id);
	}

	@PostMapping("/save")
	public ResponseEntity<ProjectTaskResponse> saveProjectTask(@RequestBody ProjectTaskRequest projectTaskRequest) {
		return projectTaskServices.saveProjectTask(projectTaskRequest);

	}
	@GetMapping("/tid")
	public List<ProjectTaskEntity> findProjectTaskEntityBytId(@RequestParam int tId) {
		return projectTaskServices.findProjectTaskEntityBytId(tId);
	}
	@GetMapping("/pid")
	public List<ProjectTaskEntity> findProjectTaskEntityBypId(@RequestParam int pId) {
		return projectTaskServices.findProjectTaskEntityBypId(pId);
	}
}