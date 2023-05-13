package com.sb.services.userProject.entity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sb.services.project.entity.ProjectRepository;
import com.sb.services.task.entity.TaskRepository;
import com.sb.services.user.entity.UserRepository;
import com.sb.services.userTask.entity.UserTask;
import com.sb.services.userTask.entity.UserTaskEntity;
import com.sb.services.userTask.entity.UserTaskRepository;
import com.sb.services.userTask.entity.UserTaskRequest;
import com.sb.services.userTask.entity.UserTaskResponse;

@Service
public class UserProjectServices {
	@Autowired
	UserRepository userRepository;
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	UserProjectRepository userProjectRepository;

	public ResponseEntity<UserProjectResponse> saveUserProject(UserProjectRequest userProjectRequest) {

		UserProject userProject = userProjectRequest.getUserProject();
		UserProjectEntity userProjectDao = new UserProjectEntity();
		userProjectDao.setStatus("active");
		userProjectDao.setUpId(userProject.getUpId());
		userProjectDao.setUserId(userProject.getUserId());
		userProjectDao.setpId(userProject.getpId());
		userProjectDao.setCreatedOn(LocalDateTime.now());
		userProjectDao.setStartedOn(LocalDateTime.now());
		userProjectDao.setUpdatedOn(LocalDateTime.now());
		userProjectRepository.save(userProjectDao);
		UserProjectResponse userProjectResponse = new UserProjectResponse();
		userProjectResponse.setStatus("success");
		userProjectResponse.setUserProject(userProject);
		return ResponseEntity.status(HttpStatus.OK).body(userProjectResponse);
	}

	public UserProjectEntity getUserProjectEntityByUpId(int upId) {
		Optional<UserProjectEntity> optinalUserProject = userProjectRepository.findById(upId);

		if (optinalUserProject.isPresent()) {
			return optinalUserProject.get();
		}
		return null;
	}
}
