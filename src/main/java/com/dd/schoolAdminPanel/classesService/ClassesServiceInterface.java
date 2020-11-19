package com.dd.schoolAdminPanel.classesService;

import java.util.List;

import com.dd.schoolAdminPanel.classesBean.Classes;

public interface ClassesServiceInterface {
	
	 void addClasses(Classes classes) throws Exception;
	 
	 List<Classes> listClasses() throws Exception;
	 
	 void deleteClasses(Classes classes) throws Exception;
	 
	 Classes getClasses(Classes classes) throws Exception;
	 
	 void editClasses(Classes classes) throws Exception;



	
}
