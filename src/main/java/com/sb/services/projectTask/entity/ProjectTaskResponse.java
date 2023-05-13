package com.sb.services.projectTask.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sb.services.model.BussinesError;
import com.sb.services.project.entity.Project;
import com.sb.services.task.entity.Task;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTaskResponse {
	
	private String status;
	private BussinesError error;
	private List<Project> project;
	private List<Task> task;
	private List<Object> projectTask;

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

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public List<Object> getProjectTask() {
		return projectTask;
	}

	public void setProjectTask(ProjectTask projectTask2) {
		this.projectTask = (List<Object>) projectTask2;
	}

}
