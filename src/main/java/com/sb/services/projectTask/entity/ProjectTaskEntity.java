package com.sb.services.projectTask.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECTTASK")
public class ProjectTaskEntity {
	
	@Column(name = "PTID")
	@Id
	
	private Integer ptId;

	@Column(name = "PID")
	private Integer pId;

	@Column(name = "TID")
	private Integer tId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "CREATEDON")
	private LocalDateTime createdOn;

	@Column(name = "UPDATEDON")
	private LocalDateTime updatedOn;

	public Integer getPtId() {
		return ptId;
	}

	public void setPtId(Integer ptId) {
		this.ptId = ptId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
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
