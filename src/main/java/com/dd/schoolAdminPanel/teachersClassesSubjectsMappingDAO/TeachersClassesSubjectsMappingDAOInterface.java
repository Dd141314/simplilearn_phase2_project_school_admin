package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

public interface TeachersClassesSubjectsMappingDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public Session userDetailsSessionFactoryForJoinTable();

	public void addTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping);
	
	public List<TeachersClassesSubjectsMapping> listTeachersClassesSubjectsMapping();
	
	public void deleteTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping);
	
	public List<TeachersClassesSubjectsMapping> listUniqueClassesFromSubjectsMapping();
	
	public List<TeachersClassesSubjectsMapping> getSubjectsFromClassesSubjectsMappingAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping);



}
