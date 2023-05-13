package com.sb.services.project.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class ProjectEntity {

	@Column(name = "PID")
	@Id
	private Integer pId;

	@Column(name = "PNAME")
	private String pName;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ASSIGNED_TO")
	private String assigned_to;

	@Column(name = "STARTDATE")
	private LocalDateTime startDate;

	@Column(name = "DUEDATE")
	private LocalDateTime dueDate;

	@Column(name = "COMPDATE")
	private LocalDateTime compDate;

	@Column(name = "REMARK")
	private String remark;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
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

	public LocalDateTime getCompDate() {
		return compDate;
	}

	public void setCompDate(LocalDateTime compDate) {
		this.compDate = compDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
