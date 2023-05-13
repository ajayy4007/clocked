package com.sb.services.userTask.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERTASK")
public class UserTaskEntity {

	@Column(name = "UTID")
	@Id
	private Integer utId;

	@Column(name = "USERID")
	private Integer userId;

	@Column(name = "TID")
	private Integer tId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "STARTEDON")
	private LocalDateTime startedOn;

	@Column(name = "COMPON")
	private LocalDateTime compOn;

	@Column(name = "CREATEDON")
	private LocalDateTime createdOn;

	@Column(name = "UPDATEDON")
	private LocalDateTime updatedOn;

	@Column(name = "EXPECTEDCOMPTIME")
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

	@Override
	public String toString() {
		return "UserTaskEntity [utId=" + utId + ", userId=" + userId + ", tId=" + tId + ", status=" + status
				+ ", startedOn=" + startedOn + ", compOn=" + compOn + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", expectedCompTime=" + expectedCompTime + "]";
	}

}
