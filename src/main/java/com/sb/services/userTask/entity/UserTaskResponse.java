package com.sb.services.userTask.entity;

import java.util.List;

import com.sb.services.user.entity.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sb.services.model.BussinesError;
import com.sb.services.task.entity.Task;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTaskResponse {
	
	private String status;
	private BussinesError error;
	private List<User> user;
	private List<Task> task;
	private List<Object> userTask;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BussinesError getError() {
		return error;
	}

	public void setError(BussinesError error) {
		this.error = error;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public List<Object> getUserTask() {
		return userTask;
	}

	public void setUserTask(UserTask userTask2) {
		this.userTask = (List<Object>) userTask2;
	}

}
