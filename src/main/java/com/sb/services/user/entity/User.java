package com.sb.services.user.entity;

import java.time.LocalDateTime;

public class User {

	private Integer id;

	private String name;

	private String mobNo;

	private String emailId;

	private String dob;

	private String address;

	private String userName;

	private String password;

	private char verify;

	private char active;

	private LocalDateTime createdon;

	private LocalDateTime updatedon;

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

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getVerify() {
		return verify;
	}

	public void setVerify(char verify) {
		this.verify = verify;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {

		this.createdon = createdon;
	}

	public LocalDateTime getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(LocalDateTime updatedon) {
		this.updatedon = updatedon;
	}

	public User(Integer id, String name, String mobNo, String emailId, String dob, String address, String userName,
			String password, char verify, char active, LocalDateTime createdon, LocalDateTime updatedon) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.dob = dob;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.verify = verify;
		this.active = active;
		this.createdon = createdon;
		this.updatedon = updatedon;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", emailId=" + emailId + ", dob=" + dob
				+ ", address=" + address + ", userName=" + userName + ", password=" + password + ", verify=" + verify
				+ ", active=" + active + ", createdon=" + createdon + ", updatedon=" + updatedon + "]";
	}

}
