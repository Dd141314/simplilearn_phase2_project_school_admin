package com.dd.schoolAdminPanel.classDetailsReportService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.classDetailsReportDAO.ClassDetailsReportDAO;
import com.dd.schoolAdminPanel.classDetailsReportDAO.ClassDetailsReportDAOInterface;
import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

public class ClassDetailsReportService implements ClassDetailsReportServiceInterface {
	
	private Log log = LogFactory.getLog(ClassDetailsReportService.class);
	ClassDetailsReportDAOInterface classDetailsReportDAOInterface  = new ClassDetailsReportDAO();


	@Override
	public List<TeachersClassesSubjectsMapping> getTeachersHandlingSubjectsListAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) throws Exception {
		log.info("Entering Method getSubjectsFromClassesSubjectsMappingAction");
		try {
			return this.classDetailsReportDAOInterface.getTeachersHandlingSubjectsListAction(teachersClassesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the getSubjectsFromClassesSubjectsMappingAction "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getSubjectsFromClassesSubjectsMappingAction");
		}
	}
	
	@Override
	public List<Students> getStudentsInTheClassListAction(Students students) throws Exception {
		log.info("Entering Method getStudentsInTheClassListAction");
		try {
			return this.classDetailsReportDAOInterface.getStudentsInTheClassListAction(students);
		}catch(Exception e){
			log.info("Error While executing the getStudentsInTheClassListAction "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getStudentsInTheClassListAction");
		}
	}
	
	



}
