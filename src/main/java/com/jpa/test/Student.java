package com.jpa.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student1")
public class Student {
	@Column(name = "SID")
	@Id
	private Integer id;

	@Column(name = "SNAME", nullable = true, length = 255)
	private String name;

	@Column(name = "MARKS", nullable = true, length = 255)
	private int marks;

	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
