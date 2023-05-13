package com.sb.services.project.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.services.task.entity.TaskRequest;
import com.sb.services.task.entity.TaskResponse;
import com.sb.services.user.entity.UserEntity;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	ProjectServices projectServices;

	@PostMapping("/save")
	public ResponseEntity<ProjectResponse> saveProject(@RequestBody ProjectRequest projectRequest) {
		return projectServices.saveProject(projectRequest);
	}

	@GetMapping("/id")
	public ProjectEntity getProject(@RequestParam int pid) {
		return projectServices.getProjectById(pid);
	}

}
