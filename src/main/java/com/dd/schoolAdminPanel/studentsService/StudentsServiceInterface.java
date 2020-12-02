package com.dd.schoolAdminPanel.studentsService;

import java.util.List;

import com.dd.schoolAdminPanel.studentsBean.Students;

public interface StudentsServiceInterface {
	
	 void addStudents(Students students) throws Exception;
	 
	 List<Students> listStudents() throws Exception;
	 
	 void deleteStudents(Students students) throws Exception;
	 
	 Students getStudents(Students students) throws Exception;
	 
	 void editStudents(Students students) throws Exception;



	
}
