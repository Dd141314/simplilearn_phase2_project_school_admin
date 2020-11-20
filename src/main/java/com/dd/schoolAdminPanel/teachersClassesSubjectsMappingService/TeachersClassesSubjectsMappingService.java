package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingDAO.TeachersClassesSubjectsMappingDAO;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingDAO.TeachersClassesSubjectsMappingDAOInterface;

public class TeachersClassesSubjectsMappingService implements TeachersClassesSubjectsMappingServiceInterface {
	
	private Log log = LogFactory.getLog(TeachersClassesSubjectsMappingService.class);
	TeachersClassesSubjectsMappingDAOInterface teachersClassesSubjectsMappingDAOInterface = new TeachersClassesSubjectsMappingDAO();


	@Override
	public void addTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) throws Exception {
		log.info("Entering Method addTeachersClassesSubjectsMapping");
		try {
			this.teachersClassesSubjectsMappingDAOInterface.addTeachersClassesSubjectsMapping(teachersClassesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the addTeachersClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addTeachersClassesSubjectsMapping");
		}

	}

	@Override
	public List<TeachersClassesSubjectsMapping> listTeachersClassesSubjectsMapping() throws Exception {
		log.info("Entering Method listTeachersClassesSubjectsMapping");
		try {
			return this.teachersClassesSubjectsMappingDAOInterface.listTeachersClassesSubjectsMapping();
		}catch(Exception e){
			log.info("Error While executing the listTeachersClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listTeachersClassesSubjectsMapping");
		}
	}
	
	@Override
	public void deleteTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) throws Exception {
		log.info("Entering Method deleteTeachersClassesSubjectsMapping");
		try {
			this.teachersClassesSubjectsMappingDAOInterface.deleteTeachersClassesSubjectsMapping(teachersClassesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the deleteTeachersClassesSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteTeachersClassesSubjectsMapping");
		}

	}
	
	@Override
	public List<TeachersClassesSubjectsMapping> listUniqueClassesFromSubjectsMapping() throws Exception {
		log.info("Entering Method listUniqueClassesFromSubjectsMapping");
		try {
			return this.teachersClassesSubjectsMappingDAOInterface.listUniqueClassesFromSubjectsMapping();
		}catch(Exception e){
			log.info("Error While executing the listUniqueClassesFromSubjectsMapping "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listUniqueClassesFromSubjectsMapping");
		}
	}
	
	@Override
	public List<TeachersClassesSubjectsMapping> getSubjectsFromClassesSubjectsMappingAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) throws Exception {
		log.info("Entering Method getSubjectsFromClassesSubjectsMappingAction");
		try {
			return this.teachersClassesSubjectsMappingDAOInterface.getSubjectsFromClassesSubjectsMappingAction(teachersClassesSubjectsMapping);
		}catch(Exception e){
			log.info("Error While executing the getSubjectsFromClassesSubjectsMappingAction "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getSubjectsFromClassesSubjectsMappingAction");
		}
	}

	
	


}
