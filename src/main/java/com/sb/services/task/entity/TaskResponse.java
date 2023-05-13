package com.sb.services.task.entity;

import com.sb.services.model.BussinesError;

public class TaskResponse {
	private String status;
	private BussinesError error;
	private Object task;

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

	public Object getTask() {
		return task;
	}

	public void setTask(Object task) {
		this.task = task;
	}


		
	

}
