package com.dd.schoolAdminPanel.studentsDAO;

import java.util.List;

import org.hibernate.Session;

import com.dd.schoolAdminPanel.studentsBean.Students;

public interface StudentsDAOInterface {
	
	public Session userDetailsSessionFactory();
	
	public void addStudents(Students students);
	
	public List<Students> listStudents();
	
	public void deleteStudents(Students students);
	
	public Students getStudents(Students students);
	
	public void editStudents(Students students);

	

}
