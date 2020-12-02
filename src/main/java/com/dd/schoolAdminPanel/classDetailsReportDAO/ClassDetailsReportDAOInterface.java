package com.dd.schoolAdminPanel.classDetailsReportDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

public interface ClassDetailsReportDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public List<TeachersClassesSubjectsMapping> getTeachersHandlingSubjectsListAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping);
	
	public List<Students> getStudentsInTheClassListAction(Students students);


	

}
