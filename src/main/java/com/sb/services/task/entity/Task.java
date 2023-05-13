package com.sb.services.task.entity;

import java.time.LocalDateTime;


public class Task {
	private Integer tId;
	
	private String taskName;
	
	private String description;
	
	private String Status;
	
	private LocalDateTime startDate;
	
	private LocalDateTime dueDate;
	
	private LocalDateTime comDate;
	
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDateTime getComDate() {
		return comDate;
	}
	public void setComDate(LocalDateTime comDate) {
		this.comDate = comDate;
	}
	public Task(Integer tId, String taskName, String description, String status, LocalDateTime startDate,
			LocalDateTime dueDate, LocalDateTime comDate) {
		super();
		this.tId = tId;
		this.taskName = taskName;
		this.description = description;
		Status = status;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.comDate = comDate;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Task [tId=" + tId + ", taskName=" + taskName + ", description=" + description + ", Status=" + Status
				+ ", startDate=" + startDate + ", dueDate=" + dueDate + ", comDate=" + comDate + "]";
	}

	

}
