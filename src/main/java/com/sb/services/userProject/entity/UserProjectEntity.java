package com.sb.services.userProject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERPROJECT")
public class UserProjectEntity {
	
	@Column(name = "UPID")
	@Id
	private Integer upId;
	
	@Column(name = "USERID")
	private Integer userId;
	
	@Column(name = "PID")
	private Integer pId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "STARTEDON")
	private LocalDateTime startedOn;
	
	@Column(name = "CREATEDON")
	private LocalDateTime createdOn;
	
	@Column(name = "UPDATEDON")
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

	
	
}
