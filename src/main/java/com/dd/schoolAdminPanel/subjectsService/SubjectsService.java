package com.dd.schoolAdminPanel.subjectsService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.subjectsBean.Subjects;
import com.dd.schoolAdminPanel.subjectsDAO.SubjectsDAO;
import com.dd.schoolAdminPanel.subjectsDAO.SubjectsDAOInterface;

public class SubjectsService implements SubjectsServiceInterface {
	
	private Log log = LogFactory.getLog(SubjectsService.class);
	SubjectsDAOInterface subjectsDAOInterface = new SubjectsDAO();


	@Override
	public void addSubjects(Subjects subjects) throws Exception {
		log.info("Entering Method addSubjects");
		try {
			this.subjectsDAOInterface.addSubjects(subjects);
		}catch(Exception e){
			log.info("Error While executing the addSubjects "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addSubjects");
		}

	}

	@Override
	public List<Subjects> listSubjects() throws Exception {
		log.info("Entering Method listSubjects");
		try {
			return this.subjectsDAOInterface.listSubjects();
		}catch(Exception e){
			log.info("Error While executing the listSubjects "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listSubjects");
		}
	}
	
	@Override
	public void deleteSubjects(Subjects subjects) throws Exception {
		log.info("Entering Method deleteSubjects");
		try {
			this.subjectsDAOInterface.deleteSubjects(subjects);
		}catch(Exception e){
			log.info("Error While executing the deleteSubjects "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteSubjects");
		}

	}
	
	@Override
	public Subjects getSubjects(Subjects subjects) throws Exception {
		log.info("Entering Method getSubjects");
		try {
			return this.subjectsDAOInterface.getSubjects(subjects);
		}catch(Exception e){
			log.info("Error While executing the getSubjects "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getSubjects");
		}
	}
	
	@Override
	public void editSubjects(Subjects subjects) throws Exception {
		log.info("Entering Method editSubjects");
		try {
			this.subjectsDAOInterface.editSubjects(subjects);
		}catch(Exception e){
			log.info("Error While executing the editSubjects "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method editSubjects");
		}

	}




}
