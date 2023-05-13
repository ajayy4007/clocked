package com.sb.services.task.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TASK")
public class TaskEntity {

	@Column(name = "TID")
	@Id
	private Integer tId;

	@Column(name = "TASKNAME")
	private String taskName;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "STARTDATE")
	private LocalDateTime startDate;

	@Column(name = "DUEDATE")
	private LocalDateTime dueDate;

	@Column(name = "COMDATE")
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
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
