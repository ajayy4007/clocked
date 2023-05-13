package com.sb.services.user.entity;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserEntity {

	@Column(name = "ID")
	@Id
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MOBNO")
	private String mobNo;
	
	@Column(name = "EMAILID")
	private String emailId;
	
	@Column(name = "DOB")
	private String dob;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "VERIFY")
	private char verify;
	
	@Column(name = "ACTIVE")
	private char active;
	
	@Column(name = "CREATEDON")
	private LocalDateTime createdon;
	
	@Column(name = "UPDATEDON")
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

	public UserEntity(Integer id, String name, String mobNo, String emailId, String dob, String address, String userName,
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

	public UserEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", emailId=" + emailId + ", dob=" + dob
				+ ", address=" + address + ", userName=" + userName + ", password=" + password + ", verify=" + verify
				+ ", active=" + active + ", createdon=" + createdon + ", updatedon=" + updatedon + "]";
	}

}
