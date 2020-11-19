package com.dd.schoolAdminPanel.classesService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.classesBean.Classes;
import com.dd.schoolAdminPanel.classesDAO.ClassesDAO;
import com.dd.schoolAdminPanel.classesDAO.ClassesDAOInterface;

public class ClassesService implements ClassesServiceInterface {
	
	private Log log = LogFactory.getLog(ClassesService.class);
	ClassesDAOInterface classesDAOInterface = new ClassesDAO();


	@Override
	public void addClasses(Classes classes) throws Exception {
		log.info("Entering Method addClasses");
		try {
			this.classesDAOInterface.addClasses(classes);
		}catch(Exception e){
			log.info("Error While executing the addClasses "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method addClasses");
		}

	}

	@Override
	public List<Classes> listClasses() throws Exception {
		log.info("Entering Method listClasses");
		try {
			return this.classesDAOInterface.listClasses();
		}catch(Exception e){
			log.info("Error While executing the listClasses "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method listClasses");
		}
	}
	
	@Override
	public void deleteClasses(Classes classes) throws Exception {
		log.info("Entering Method deleteClasses");
		try {
			this.classesDAOInterface.deleteClasses(classes);
		}catch(Exception e){
			log.info("Error While executing the deleteClasses "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method deleteClasses");
		}

	}
	
	@Override
	public Classes getClasses(Classes classes) throws Exception {
		log.info("Entering Method getClasses");
		try {
			return this.classesDAOInterface.getClasses(classes);
		}catch(Exception e){
			log.info("Error While executing the getClasses "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method getClasses");
		}
	}
	
	@Override
	public void editClasses(Classes classes) throws Exception {
		log.info("Entering Method editClasses");
		try {
			this.classesDAOInterface.editClasses(classes);
		}catch(Exception e){
			log.info("Error While executing the editClasses "+ e.getMessage());
			throw e;
		}finally {
			log.info("Exiting the method editClasses");
		}

	}




}
