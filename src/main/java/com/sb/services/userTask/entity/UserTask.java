package com.sb.services.userTask.entity;

import java.time.LocalDateTime;

public class UserTask {
	private Integer utId;
	private Integer userId;
	private Integer tId;
	private String status;
	private LocalDateTime startedOn;
	private LocalDateTime compOn;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	private LocalDateTime expectedCompTime;
	public Integer getUtId() {
		return utId;
	}
	public void setUtId(Integer utId) {
		this.utId = utId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
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
	public LocalDateTime getCompOn() {
		return compOn;
	}
	public void setCompOn(LocalDateTime compOn) {
		this.compOn = compOn;
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
	public LocalDateTime getExpectedCompTime() {
		return expectedCompTime;
	}
	public void setExpectedCompTime(LocalDateTime expectedCompTime) {
		this.expectedCompTime = expectedCompTime;
	}
	public UserTask(Integer utId, Integer userId, Integer tId, String status, LocalDateTime startedOn,
			LocalDateTime compOn, LocalDateTime createdOn, LocalDateTime updatedOn, LocalDateTime expectedCompTime) {
		super();
		this.utId = utId;
		this.userId = userId;
		this.tId = tId;
		this.status = status;
		this.startedOn = startedOn;
		this.compOn = compOn;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.expectedCompTime = expectedCompTime;
	}
	@Override
	public String toString() {
		return "UserTask [utId=" + utId + ", userId=" + userId + ", tId=" + tId + ", status=" + status + ", startedOn="
				+ startedOn + ", compOn=" + compOn + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ ", expectedCompTime=" + expectedCompTime + "]";
	}



}
