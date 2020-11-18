package com.dd.schoolAdminPanel.userManagementService;

import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

public interface UserManagementServiceInterface {
	
	UserDetails userLoginAuthentication(UserDetails userDetails) throws Exception;

}
