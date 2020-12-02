package com.dd.schoolAdminPanel.classDetailsReportService;

import java.util.List;

import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

public interface ClassDetailsReportServiceInterface {
	
	 List<TeachersClassesSubjectsMapping> getTeachersHandlingSubjectsListAction(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) throws Exception;
	 
	 List<Students> getStudentsInTheClassListAction(Students students) throws Exception;

}
