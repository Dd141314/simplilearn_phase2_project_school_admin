package com.dd.schoolAdminPanel.teachersService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.teachersBean.Teachers;
import com.dd.schoolAdminPanel.teachersDAO.TeachersDAO;
import com.dd.schoolAdminPanel.teachersDAO.TeachersDAOInterface;

public class TeachersService implements TeachersServiceInterface {
	
	private Log log = LogFactory.getLog(TeachersService.class);
	TeachersDAOInterface teachersDAOInterface = new TeachersDAO();


	@Override
	public void addTeachers(Teachers teachers) throws Exception {
		log.info("Entering Method addTeachers");
		try {
			this.teachersDAOInterface.addTeachers(teachers);
		}catch(Exception e){
			log.info("Error While executing the addTeachers "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addTeachers");
		}

	}

	@Override
	public List<Teachers> listTeachers() throws Exception {
		log.info("Entering Method listTeachers");
		try {
			return this.teachersDAOInterface.listTeachers();
		}catch(Exception e){
			log.info("Error While executing the listTeachers "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listTeachers");
		}
	}
	
	@Override
	public void deleteTeachers(Teachers teachers) throws Exception {
		log.info("Entering Method deleteTeachers");
		try {
			this.teachersDAOInterface.deleteTeachers(teachers);
		}catch(Exception e){
			log.info("Error While executing the deleteTeachers "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteTeachers");
		}

	}
	
	@Override
	public Teachers getTeachers(Teachers teachers) throws Exception {
		log.info("Entering Method getTeachers");
		try {
			return this.teachersDAOInterface.getTeachers(teachers);
		}catch(Exception e){
			log.info("Error While executing the getTeachers "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getTeachers");
		}
	}
	
	@Override
	public void editTeachers(Teachers teachers) throws Exception {
		log.info("Entering Method editTeachers");
		try {
			this.teachersDAOInterface.editTeachers(teachers);
		}catch(Exception e){
			log.info("Error While executing the editTeachers "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method editTeachers");
		}

	}




}
