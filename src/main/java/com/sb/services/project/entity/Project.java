
package com.sb.services.project.entity;

import java.time.LocalDateTime;

public class Project {
	private Integer pId;
	
	private String pName;
	
	private String description;
	
	private String assigned_to;
	
	private LocalDateTime startDate;
	
	private LocalDateTime dueDate;
	
	private LocalDateTime compDate;
	
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

	public Project(Integer pId, String pName, String description, String assigned_to, LocalDateTime startDate,
			LocalDateTime dueDate, LocalDateTime compDate, String remark) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.description = description;
		this.assigned_to = assigned_to;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.compDate = compDate;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", description=" + description + ", assigned_to="
				+ assigned_to + ", startDate=" + startDate + ", dueDate=" + dueDate + ", compDate=" + compDate
				+ ", remark=" + remark + "]";
	}

}
