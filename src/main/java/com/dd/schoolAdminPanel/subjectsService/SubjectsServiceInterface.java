package com.dd.schoolAdminPanel.subjectsService;

import java.util.List;

import com.dd.schoolAdminPanel.subjectsBean.Subjects;

public interface SubjectsServiceInterface {
	
	 void addSubjects(Subjects subjects) throws Exception;
	 
	 List<Subjects> listSubjects() throws Exception;
	 
	 void deleteSubjects(Subjects subjects) throws Exception;
	 
	 Subjects getSubjects(Subjects subjects) throws Exception;
	 
	 void editSubjects(Subjects subjects) throws Exception;



	
}
