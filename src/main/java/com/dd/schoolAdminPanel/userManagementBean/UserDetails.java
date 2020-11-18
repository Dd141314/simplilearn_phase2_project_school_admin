package com.dd.schoolAdminPanel.userManagementBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {

	@Id
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "userType")
	private String userType;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDt")
	private Date createdDt;

	@Column(name = "updatedDt")
	private Date updatedDt;
	
	public UserDetails() {
		
	}


	public UserDetails(String userName, String password, String userType, String createdBy, Date createdDt,Date updatedDt) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.updatedDt = updatedDt;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	@Override
	public String toString() {
		return userName;
	}
	
	
}
