package com.dd.schoolAdminPanel.classesDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dd.schoolAdminPanel.classesBean.Classes;

@SuppressWarnings({"unchecked","rawtypes"})
public class ClassesDAO implements ClassesDAOInterface {

    private Log log = LogFactory.getLog(ClassesDAO.class);

    @Override
    public synchronized void addClasses(Classes classes) {
        log.info("Entering Method addClasses ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(classes.getClassId() <= 0) {
    			session.save(classes);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addClasses " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addClasses");

        }
    }

    
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Classes.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public synchronized List<Classes> listClasses() {
        log.info("Entering Method listClasses ");
        Session session = this.userDetailsSessionFactory();
        List<Classes> classesList = new ArrayList<Classes>();
        try {
			 classesList =  session.createQuery(" from Classes").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listClasses " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listClasses");

        }
		return classesList;
	}
	
	
	@Override
    public synchronized void deleteClasses(Classes classes) {
        log.info("Entering Method deleteClasses ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(classes.getClassId() > 0) {
        		Classes classesObj = session.get(Classes.class, classes.getClassId());
    			session.delete(classesObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteClasses " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteClasses");

        }
    }
	
	@Override
	public synchronized Classes getClasses(Classes classes) {
        log.info("Entering Method getClasses ");
        Session session = this.userDetailsSessionFactory();
        Classes classesResponse = new Classes();
        try {
        	
			Query query =  session.createQuery(" from Classes C where C.classId= :classId ");
			query.setParameter("classId", classes.getClassId());
			List<Classes> results = query.list();
			if (results.size() > 0) {
				classesResponse = (Classes) results.get(0);
			} else {
				classesResponse = null;
			}
			
        } catch (Exception re) {
            log.error(" Error while executing the method getClasses " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getClasses");

        }
		return classesResponse;
	}
	
	
    @Override
    public synchronized void editClasses(Classes classes) {
        log.info("Entering Method editClasses ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(classes.getClassId() > 0) {
        		Classes classesObj = session.get(Classes.class, classes.getClassId());
        		classesObj.setClassName(classes.getClassName());
        		classesObj.setSectionName(classes.getSectionName());
        		classesObj.setTotalNumberOfStudents(classes.getTotalNumberOfStudents());
        		classesObj.setRoomNo(classes.getRoomNo());
        		classesObj.setClassTeacherName(classes.getClassTeacherName());
        		classesObj.setUpdatedBy(classes.getUpdatedBy());
        		classesObj.setUpdatedDt(classes.getUpdatedDt());

        		session.update(classesObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method editClasses " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method editClasses");

        }
    }



    
 
}