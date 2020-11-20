package com.dd.schoolAdminPanel.classesSubjectsMappingDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;

@SuppressWarnings({"unchecked"})
public class ClassesSubjectsMappingDAO implements ClassesSubjectsMappingDAOInterface {

    private Log log = LogFactory.getLog(ClassesSubjectsMappingDAO.class);

    @Override
    public synchronized void addClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) {
        log.info("Entering Method addClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(classesSubjectsMapping.getClassesSubjectsMappingId() <= 0) {
    			session.save(classesSubjectsMapping);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addClassesSubjectsMapping");

        }
    }

    
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ClassesSubjectsMapping.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public synchronized List<ClassesSubjectsMapping> listClassesSubjectsMapping() {
        log.info("Entering Method listClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        List<ClassesSubjectsMapping> classesSubjectsMappingList = new ArrayList<ClassesSubjectsMapping>();
        try {
			 classesSubjectsMappingList =  session.createQuery(" from ClassesSubjectsMapping").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listClassesSubjectsMapping");

        }
		return classesSubjectsMappingList;
	}
	
	
	@Override
    public synchronized void deleteClassesSubjectsMapping(ClassesSubjectsMapping classesSubjectsMapping) {
        log.info("Entering Method deleteClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(classesSubjectsMapping.getClassesSubjectsMappingId() > 0) {
        		ClassesSubjectsMapping classesSubjectsMappingObj = session.get(ClassesSubjectsMapping.class, classesSubjectsMapping.getClassesSubjectsMappingId());
    			session.delete(classesSubjectsMappingObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteClassesSubjectsMapping");

        }
    }
	
 
}