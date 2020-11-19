package com.dd.schoolAdminPanel.subjectsDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.subjectsBean.Subjects;

public interface SubjectsDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public void addSubjects(Subjects subjects);
	
	public List<Subjects> listSubjects();
	
	public void deleteSubjects(Subjects subjects);
	
	public Subjects getSubjects(Subjects subjects);
	
	public void editSubjects(Subjects subjects);

	

}
