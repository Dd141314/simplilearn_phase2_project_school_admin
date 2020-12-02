package com.dd.schoolAdminPanel.studentsDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dd.schoolAdminPanel.studentsBean.Students;

@SuppressWarnings({"unchecked","rawtypes"})
public class StudentsDAO implements StudentsDAOInterface {

    private Log log = LogFactory.getLog(StudentsDAO.class);

    @Override
    public synchronized void addStudents(Students students) {
        log.info("Entering Method addStudents ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(students.getStudentId() <= 0) {
    			session.save(students);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addStudents");

        }
    }

    
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Students.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public synchronized List<Students> listStudents() {
        log.info("Entering Method listStudents ");
        Session session = this.userDetailsSessionFactory();
        List<Students> studentsList = new ArrayList<Students>();
        try {
			 studentsList =  session.createQuery(" from Students").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listStudents");

        }
		return studentsList;
	}
	
	
	@Override
    public synchronized void deleteStudents(Students students) {
        log.info("Entering Method deleteStudents ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(students.getStudentId() > 0) {
        		Students studentsObj = session.get(Students.class, students.getStudentId());
    			session.delete(studentsObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteStudents");

        }
    }
	
	@Override
	public synchronized Students getStudents(Students students) {
        log.info("Entering Method getStudents ");
        Session session = this.userDetailsSessionFactory();
        Students studentsResponse = new Students();
        try {
        	
			Query query =  session.createQuery(" from Students S where S.studentId= :studentId ");
			query.setParameter("studentId", students.getStudentId());
			List<Students> results = query.list();
			if (results.size() > 0) {
				studentsResponse = (Students) results.get(0);
			} else {
				studentsResponse = null;
			}
			
        } catch (Exception re) {
            log.error(" Error while executing the method getStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getStudents");

        }
		return studentsResponse;
	}
	
	
    @Override
    public synchronized void editStudents(Students students) {
        log.info("Entering Method editStudents ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(students.getStudentId() > 0) {
        		Students studentsObj = session.get(Students.class, students.getStudentId());
        		studentsObj.setStudentName(students.getStudentName());
        		studentsObj.setFathersName(students.getFathersName());
        		studentsObj.setMothersName(students.getMothersName());
        		studentsObj.setEmergencyContactNumber(students.getEmergencyContactNumber());
        		studentsObj.setBloodGroup(students.getBloodGroup());
        		studentsObj.setGender(students.getGender());
        		studentsObj.setClassId(students.getClassId());
        		studentsObj.setClassName(students.getClassName());
        		studentsObj.setAge(students.getAge());
        		studentsObj.setAddress(students.getAddress());
        		studentsObj.setUpdatedBy(students.getUpdatedBy());
        		studentsObj.setUpdatedDt(students.getUpdatedDt());

        		session.update(studentsObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method editStudents " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method editStudents");

        }
    }
 
}