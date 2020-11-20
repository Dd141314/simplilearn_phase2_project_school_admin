package com.dd.schoolAdminPanel.classesSubjectsMappingDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;

public interface ClassesSubjectsMappingDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public void addClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping);
	
	public List<ClassesSubjectsMapping> listClassesSubjectsMapping();
	
	public void deleteClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping);

}
