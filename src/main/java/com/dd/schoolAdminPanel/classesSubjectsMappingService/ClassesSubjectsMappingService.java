package com.dd.schoolAdminPanel.classesSubjectsMappingService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;
import com.dd.schoolAdminPanel.classesSubjectsMappingDAO.ClassesSubjectsMappingDAO;
import com.dd.schoolAdminPanel.classesSubjectsMappingDAO.ClassesSubjectsMappingDAOInterface;

public class ClassesSubjectsMappingService implements ClassesSubjectsMappingServiceInterface {
	
	private Log log = LogFactory.getLog(ClassesSubjectsMappingService.class);
	ClassesSubjectsMappingDAOInterface classesSubjectsMappingDAOInterface = new ClassesSubjectsMappingDAO();


	@Override
	public void addClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) throws Exception {
		log.info("Entering Method addClassesSubjectsMapping");
		try {
			this.classesSubjectsMappingDAOInterface.addClassesSubjectsMapping(classesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the addClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addClassesSubjectsMapping");
		}

	}

	@Override
	public List<ClassesSubjectsMapping> listClassesSubjectsMapping() throws Exception {
		log.info("Entering Method listClassesSubjectsMapping");
		try {
			return this.classesSubjectsMappingDAOInterface.listClassesSubjectsMapping();
		}catch(Exception e){
			log.info("Error While executing the listClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listClassesSubjectsMapping");
		}
	}
	
	@Override
	public void deleteClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) throws Exception {
		log.info("Entering Method deleteClassesSubjectsMapping");
		try {
			this.classesSubjectsMappingDAOInterface.deleteClassesSubjectsMapping(classesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the deleteClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteClassesSubjectsMapping");
		}

	}
	
	


}
