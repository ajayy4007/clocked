package com.sb.services.projectTask.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sb.services.model.BussinesError;
import com.sb.services.project.entity.ProjectRepository;
import com.sb.services.task.entity.TaskRepository;
import com.sb.services.user.entity.UserEntity;
import com.sb.services.user.entity.UserRepository;

@Service
public class ProjectTaskServices {
	@Autowired
	UserRepository userRepository;
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	ProjectTaskRepository projectTaskRepository;

	public ProjectTaskEntity getProjectTaskEntityByPtId(int ptId) {
		Optional<ProjectTaskEntity> optinalProjectTask = projectTaskRepository.findById(ptId);

		if (optinalProjectTask.isPresent()) {
			return optinalProjectTask.get();
		}
		return null;
	}

	public ResponseEntity<ProjectTaskResponse> saveProjectTask(ProjectTaskRequest projectTaskRequest) {

		ProjectTask projectTask = projectTaskRequest.getProjectTask();
		ProjectTaskEntity projectTaskDao = new ProjectTaskEntity();
		projectTaskDao.setStatus("active");
		projectTaskDao.setPtId(projectTask.getPtId());
		projectTaskDao.setpId(projectTask.getpId());
		projectTaskDao.settId(projectTask.gettId());
		projectTaskDao.setCreatedOn(LocalDateTime.now());
		projectTaskDao.setUpdatedOn(LocalDateTime.now());
		projectTaskRepository.save(projectTaskDao);
		ProjectTaskResponse projectTaskResponse = new ProjectTaskResponse();
		projectTaskResponse.setStatus("success");
		projectTaskResponse.setProjectTask(projectTask);
		return ResponseEntity.status(HttpStatus.OK).body(projectTaskResponse);
	}
	
	public List<ProjectTaskEntity> findProjectTaskEntityBypId(int pId) {
		
		Optional<List<ProjectTaskEntity>> optinalProjectTask = Optional.ofNullable(projectTaskRepository.findProjectTaskEntityBypId(pId));
		return optinalProjectTask.get();
	}
	public List<ProjectTaskEntity> findProjectTaskEntityBytId(int tId) {
		
			Optional<List<ProjectTaskEntity>> optinalProjectTask = Optional.ofNullable(projectTaskRepository.findProjectTaskEntityBytId(tId));
			return optinalProjectTask.get();
	}
}
