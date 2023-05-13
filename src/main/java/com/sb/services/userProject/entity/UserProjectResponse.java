package com.sb.services.userProject.entity;

import java.util.List;

import com.sb.services.model.BussinesError;
import com.sb.services.task.entity.Task;
import com.sb.services.user.entity.User;

public class UserProjectResponse {
	private String status;
	private BussinesError error;
	private List<User> user;
	private List<Task> task;
	private List<Object> userProject;
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
	public List<Object> getUserProject() {
		return userProject;
	}
	public void setUserProject(UserProject userProject2) {
		this.userProject = (List<Object>) userProject2;
	}
	
}
