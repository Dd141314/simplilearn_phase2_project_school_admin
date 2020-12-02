package com.dd.schoolAdminPanel.studentsService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.studentsDAO.StudentsDAO;
import com.dd.schoolAdminPanel.studentsDAO.StudentsDAOInterface;

public class StudentsService implements StudentsServiceInterface {
	
	private Log log = LogFactory.getLog(StudentsService.class);
	StudentsDAOInterface studentsDAOInterface = new StudentsDAO();


	@Override
	public void addStudents(Students students) throws Exception {
		log.info("Entering Method addStudents");
		try {
			this.studentsDAOInterface.addStudents(students);
		}catch(Exception e){
			log.info("Error While executing the addStudents "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addStudents");
		}

	}

	@Override
	public List<Students> listStudents() throws Exception {
		log.info("Entering Method listStudents");
		try {
			return this.studentsDAOInterface.listStudents();
		}catch(Exception e){
			log.info("Error While executing the listStudents "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listStudents");
		}
	}
	
	@Override
	public void deleteStudents(Students students) throws Exception {
		log.info("Entering Method deleteStudents");
		try {
			this.studentsDAOInterface.deleteStudents(students);
		}catch(Exception e){
			log.info("Error While executing the deleteStudents "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteStudents");
		}

	}
	
	@Override
	public Students getStudents(Students students) throws Exception {
		log.info("Entering Method getStudents");
		try {
			return this.studentsDAOInterface.getStudents(students);
		}catch(Exception e){
			log.info("Error While executing the getStudents "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getStudents");
		}
	}
	
	@Override
	public void editStudents(Students students) throws Exception {
		log.info("Entering Method editStudents");
		try {
			this.studentsDAOInterface.editStudents(students);
		}catch(Exception e){
			log.info("Error While executing the editStudents "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method editStudents");
		}

	}




}
