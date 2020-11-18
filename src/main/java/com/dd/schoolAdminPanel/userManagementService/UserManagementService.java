package com.dd.schoolAdminPanel.userManagementService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.userManagementBean.UserDetails;
import com.dd.schoolAdminPanel.userManagementDAO.UserManagementDAO;
import com.dd.schoolAdminPanel.userManagementDAO.UserManagementDAOInterface;

public class UserManagementService implements UserManagementServiceInterface {
	
	private Log log = LogFactory.getLog(UserManagementService.class);

	@Override
	public UserDetails userLoginAuthentication(UserDetails userDetails) throws Exception{
		log.info("Entering into the method userLoginAuthentication ");
		UserManagementDAOInterface userManagementDAOInterface = new UserManagementDAO();
		try {
			return userManagementDAOInterface.userLoginAuthentication(userDetails);
		}catch(Exception e) {
			log.error("Error Occured while executing the method userLoginAuthentication " + e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method userLoginAuthentication ");
		}
	}

}
