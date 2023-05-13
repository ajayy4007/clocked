package com.sb.services.task.entity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sb.services.model.*;
import com.sb.services.user.entity.User;
import com.sb.services.user.entity.UserEntity;
import com.sb.services.user.entity.UserResponse;

@Service
public class TaskServices {
	@Autowired
	TaskRepository taskRepository;

	public TaskEntity getTaskById(@RequestParam int id) {
		Optional<TaskEntity> optinalTask = taskRepository.findById(id);

		if (optinalTask.isPresent()) {
			return optinalTask.get();
		}
		return null;
	}

	public ResponseEntity<TaskResponse> saveTask(@RequestBody TaskRequest taskRequest) {
		BussinesError error = new BussinesError();
		com.sb.services.task.entity.Task task = taskRequest.getTask();
		TaskEntity taskDao = new TaskEntity();
		taskDao.settId(task.gettId());
		taskDao.setTaskName(task.getTaskName());
		taskDao.setDescription(task.getDescription());
		taskDao.setStatus(task.getStatus());
		taskDao.setStartDate(LocalDateTime.now());
		taskDao.setDueDate(task.getDueDate());
		taskDao.setComDate(task.getComDate());
		taskRepository.save(taskDao);
		TaskResponse taskResponse = new TaskResponse();
		taskResponse.setStatus("success");
		taskResponse.setTask(task);
		return ResponseEntity.status(HttpStatus.OK).body(taskResponse);

	}
	

}

