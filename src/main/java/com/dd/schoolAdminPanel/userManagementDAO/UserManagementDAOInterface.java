package com.dd.schoolAdminPanel.userManagementDAO;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

public interface UserManagementDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public UserDetails userLoginAuthentication(UserDetails userDetails);
	

}
