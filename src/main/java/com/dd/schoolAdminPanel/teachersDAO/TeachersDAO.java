package com.dd.schoolAdminPanel.teachersDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dd.schoolAdminPanel.teachersBean.Teachers;

@SuppressWarnings({"unchecked","rawtypes"})
public class TeachersDAO implements TeachersDAOInterface {

    private Log log = LogFactory.getLog(TeachersDAO.class);

    @Override
    public synchronized void addTeachers(Teachers teachers) {
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
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Teachers.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public synchronized List<Teachers> listTeachers() {
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
	
	
	@Override
    public synchronized void deleteTeachers(Teachers teachers) {
        log.info("Entering Method deleteTeachers ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachers.getTeacherId() > 0) {
        		Teachers teachersObj = session.get(Teachers.class, teachers.getTeacherId());
    			session.delete(teachersObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteTeachers");

        }
    }
	
	@Override
	public synchronized Teachers getTeachers(Teachers teachers) {
        log.info("Entering Method getTeachers ");
        Session session = this.userDetailsSessionFactory();
        Teachers teachersResponse = new Teachers();
        try {
        	
			Query query =  session.createQuery(" from Teachers T where T.teacherId= :teacherId ");
			query.setParameter("teacherId", teachers.getTeacherId());
			List<Teachers> results = query.list();
			if (results.size() > 0) {
				teachersResponse = (Teachers) results.get(0);
			} else {
				teachersResponse = null;
			}
			
        } catch (Exception re) {
            log.error(" Error while executing the method getTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getTeachers");

        }
		return teachersResponse;
	}
	
	
    @Override
    public synchronized void editTeachers(Teachers teachers) {
        log.info("Entering Method editTeachers ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachers.getTeacherId() > 0) {
        		Teachers teachersObj = session.get(Teachers.class, teachers.getTeacherId());
        		teachersObj.setFirstName(teachers.getFirstName());
        		teachersObj.setLastName(teachers.getLastName());
        		teachersObj.setContactNumber(teachers.getContactNumber());
        		teachersObj.setEmailId(teachers.getEmailId());
        		teachersObj.setMartialStatus(teachers.getMartialStatus());
        		teachersObj.setGender(teachers.getGender());
        		teachersObj.setQualification(teachers.getQualification());
        		teachersObj.setAge(teachers.getAge());
        		teachersObj.setAddress(teachers.getAddress());
        		teachersObj.setUpdatedBy(teachers.getUpdatedBy());
        		teachersObj.setUpdatedDt(teachers.getUpdatedDt());

        		session.update(teachersObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method editTeachers " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method editTeachers");

        }
    }
 
}