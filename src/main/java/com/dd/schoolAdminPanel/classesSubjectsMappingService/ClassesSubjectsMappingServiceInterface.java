package com.dd.schoolAdminPanel.classesSubjectsMappingService;

import java.util.List;

import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;

public interface ClassesSubjectsMappingServiceInterface {
	
	 void addClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) throws Exception;
	 
	 List<ClassesSubjectsMapping> listClassesSubjectsMapping() throws Exception;
	 
	 void deleteClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) throws Exception;

	
}
