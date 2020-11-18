package com.dd.schoolAdminPanel.teachersDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dd.schoolAdminPanel.teachersBean.Teachers;

@SuppressWarnings("unchecked")
public class TeachersDAO implements TeachersDAOInterface {

    private Log log = LogFactory.getLog(TeachersDAO.class);

    @Override
    public void addTeachers(Teachers teachers) {
        log.info("Entering Method addTeachers ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachers.getTeacherId() <= 0) {
    			session.save(teachers);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addTeachers");

        }
    }

    
    
    @Override
    public Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Teachers.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public List<Teachers> listTeachers() {
        log.info("Entering Method listTeachers ");
        Session session = this.userDetailsSessionFactory();
        List<Teachers> teachersList = new ArrayList<Teachers>();
        try {
			 teachersList =  session.createQuery(" from Teachers").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listTeachers");

        }
		return teachersList;
	}
    
 
}