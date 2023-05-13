package com.sb.services.project.entity;

import com.sb.services.model.BussinesError;

public class ProjectResponse {
	private String status;
	private BussinesError error;
	private Object project;
	
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
	public Object getProject() {
		return project;
	}
	public void setProject(Object project) {
		this.project = project;
	}
	
}
