package com.sb.services.projectTask.entity;

import java.time.LocalDateTime;

public class ProjectTask {

	private Integer ptId;
	private Integer pId;
	private Integer tId;
	private String status;
	private LocalDateTime createdOn;
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
	public ProjectTask(Integer ptId, Integer pId, Integer tId, String status, LocalDateTime createdOn,
			LocalDateTime updatedOn) {
		super();
		this.ptId = ptId;
		this.pId = pId;
		this.tId = tId;
		this.status = status;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "ProjectTask [ptId=" + ptId + ", pId=" + pId + ", tId=" + tId + ", status=" + status + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}

}

