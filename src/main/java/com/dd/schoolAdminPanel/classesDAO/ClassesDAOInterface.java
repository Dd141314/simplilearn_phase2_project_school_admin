package com.dd.schoolAdminPanel.classesDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.classesBean.Classes;

public interface ClassesDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public void addClasses(Classes classes);
	
	public List<Classes> listClasses();
	
	public void deleteClasses(Classes classes);
	
	public Classes getClasses(Classes classes);
	
	public void editClasses(Classes classes);

	

}
