package com.sb.services.userTask.entity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sb.services.project.entity.ProjectRepository;
import com.sb.services.task.entity.TaskRepository;
import com.sb.services.user.entity.UserRepository;

@Service
public class UserTaskServices {
	@Autowired
	UserRepository userRepository;
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	UserTaskRepository userTaskRepository;

	public ResponseEntity<UserTaskResponse> saveUserTask(UserTaskRequest userTaskRequest) {

		UserTask userTask = userTaskRequest.getUserTask();
		UserTaskEntity userTaskDao = new UserTaskEntity();
		userTaskDao.setStatus("active");
		userTaskDao.setUtId(userTask.getUtId());
		userTaskDao.setUserId(userTask.getUserId());
		userTaskDao.settId(userTask.gettId());
		userTaskDao.setCreatedOn(LocalDateTime.now());
		userTaskDao.setStartedOn(LocalDateTime.now());
		userTaskDao.setCompOn(LocalDateTime.now());
		userTaskDao.setExpectedCompTime(LocalDateTime.now());
		userTaskDao.setUpdatedOn(LocalDateTime.now());
		userTaskRepository.save(userTaskDao);
		UserTaskResponse userTaskResponse = new UserTaskResponse();
		userTaskResponse.setStatus("success");
		userTaskResponse.setUserTask(userTask);
		return ResponseEntity.status(HttpStatus.OK).body(userTaskResponse);
	}

	public UserTaskEntity getUserTaskEntityByUtId(int utId) {
		Optional<UserTaskEntity> optinalUserTask = userTaskRepository.findById(utId);

		if (optinalUserTask.isPresent()) {
			return optinalUserTask.get();
		}
		return null;
	}
}
