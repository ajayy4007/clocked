package com.sb.services.task.entity;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.services.utils.EncryptionUtil;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskRepository taskRepository;
	@Autowired
	TaskServices taskServices;

	@PostMapping("/save")
	public ResponseEntity<TaskResponse> saveTask(@RequestBody TaskRequest taskRequest) {
		return taskServices.saveTask(taskRequest);
	}
	@GetMapping("/all")
	public ResponseEntity<TaskResponse> getAllTask() {

		List<TaskEntity> taskList = taskRepository.findAll();
		TaskResponse res1 = new TaskResponse();

		res1.setError(null);
		res1.setStatus("success");
		res1.setTask(taskList);

		return ResponseEntity.status(HttpStatus.OK).body(res1);
	}
}
