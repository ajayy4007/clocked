package com.sb.services.userProject.entity;

import java.time.LocalDateTime;

public class UserProject {
	private Integer upId;
	private Integer userId;
	private Integer pId;
	private String status;
	private LocalDateTime startedOn;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	public Integer getUpId() {
		return upId;
	}
	public void setUpId(Integer upId) {
		this.upId = upId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getStartedOn() {
		return startedOn;
	}
	public void setStartedOn(LocalDateTime startedOn) {
		this.startedOn = startedOn;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public UserProject(Integer upId, Integer userId, Integer pId, String status, LocalDateTime startedOn,
			LocalDateTime createdOn, LocalDateTime updatedOn) {
		super();
		this.upId = upId;
		this.userId = userId;
		this.pId = pId;
		this.status = status;
		this.startedOn = startedOn;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "UserProject [upId=" + upId + ", userId=" + userId + ", pId=" + pId + ", status=" + status
				+ ", startedOn=" + startedOn + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
}
