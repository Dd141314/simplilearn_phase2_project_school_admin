package com.dd.schoolAdminPanel.teachersService;

import java.util.List;

import com.dd.schoolAdminPanel.teachersBean.Teachers;

public interface TeachersServiceInterface {
	
	 void addTeachers(Teachers teachers) throws Exception;
	 
	 List<Teachers> listTeachers() throws Exception;
	 
	 void deleteTeachers(Teachers teachers) throws Exception;
	 
	 Teachers getTeachers(Teachers teachers) throws Exception;
	 
	 void editTeachers(Teachers teachers) throws Exception;



	
}
