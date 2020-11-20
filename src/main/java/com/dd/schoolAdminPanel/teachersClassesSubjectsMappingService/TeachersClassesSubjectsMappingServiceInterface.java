package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService;

import java.util.List;

import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

public interface TeachersClassesSubjectsMappingServiceInterface {
	
	 void addTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) throws Exception;
	 
	 List<TeachersClassesSubjectsMapping> listTeachersClassesSubjectsMapping() throws Exception;
	 
	 void deleteTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) throws Exception;
	 
	 List<TeachersClassesSubjectsMapping> listUniqueClassesFromSubjectsMapping() throws Exception;
	 
	 List<TeachersClassesSubjectsMapping> getSubjectsFromClassesSubjectsMappingAction(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) throws Exception;
	 
	 	
}
