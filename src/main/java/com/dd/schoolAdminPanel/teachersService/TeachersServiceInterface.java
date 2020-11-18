package com.dd.schoolAdminPanel.teachersService;

import java.util.List;

import com.dd.schoolAdminPanel.teachersBean.Teachers;

public interface TeachersServiceInterface {
	
	 void addTeachers(Teachers teachers) throws Exception;
	 
	 List<Teachers> listTeachers() throws Exception;
	
}
