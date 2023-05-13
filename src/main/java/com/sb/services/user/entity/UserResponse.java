package com.sb.services.user.entity;

import java.util.List;

import com.sb.services.model.BussinesError;

public class UserResponse {
	private String status;
	private BussinesError error;
	private List<Object> user;

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

	public Object getUser() {
		return user;
	}

	public void setUser(Object user) {
		this.user = (List<Object>) user;
	}

}
