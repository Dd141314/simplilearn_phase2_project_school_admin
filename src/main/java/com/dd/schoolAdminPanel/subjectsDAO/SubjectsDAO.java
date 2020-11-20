package com.dd.schoolAdminPanel.subjectsDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dd.schoolAdminPanel.subjectsBean.Subjects;

@SuppressWarnings({"unchecked","rawtypes"})
public class SubjectsDAO implements SubjectsDAOInterface {

    private Log log = LogFactory.getLog(SubjectsDAO.class);

    @Override
    public synchronized void addSubjects(Subjects subjects) {
        log.info("Entering Method addSubjects ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(subjects.getSubjectId() <= 0) {
    			session.save(subjects);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addSubjects");

        }
    }

    
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Subjects.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }



	@Override
	public synchronized List<Subjects> listSubjects() {
        log.info("Entering Method listSubjects ");
        Session session = this.userDetailsSessionFactory();
        List<Subjects> subjectsList = new ArrayList<Subjects>();
        try {
			 subjectsList =  session.createQuery(" from Subjects").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listSubjects");

        }
		return subjectsList;
	}
	
	
	@Override
    public synchronized void deleteSubjects(Subjects subjects) {
        log.info("Entering Method deleteSubjects ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(subjects.getSubjectId() > 0) {
        		Subjects subjectsObj = session.get(Subjects.class, subjects.getSubjectId());
    			session.delete(subjectsObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteSubjects");

        }
    }
	
	@Override
	public synchronized Subjects getSubjects(Subjects subjects) {
        log.info("Entering Method getSubjects ");
        Session session = this.userDetailsSessionFactory();
        Subjects subjectsResponse = new Subjects();
        try {
        	
			Query query =  session.createQuery(" from Subjects S where S.subjectId= :subjectId ");
			query.setParameter("subjectId", subjects.getSubjectId());
			List<Subjects> results = query.list();
			if (results.size() > 0) {
				subjectsResponse = (Subjects) results.get(0);
			} else {
				subjectsResponse = null;
			}
			
        } catch (Exception re) {
            log.error(" Error while executing the method getSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getSubjects");

        }
		return subjectsResponse;
	}
	
	
    @Override
    public synchronized void editSubjects(Subjects subjects) {
        log.info("Entering Method editSubjects ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(subjects.getSubjectId() > 0) {
        		Subjects subjectsObj = session.get(Subjects.class, subjects.getSubjectId());
        		subjectsObj.setSubjectName(subjects.getSubjectName());
        		subjectsObj.setSubjectDescription(subjects.getSubjectDescription());
        		subjectsObj.setUpdatedBy(subjects.getUpdatedBy());
        		subjectsObj.setUpdatedDt(subjects.getUpdatedDt());

        		session.update(subjectsObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method editSubjects " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method editSubjects");

        }
    }



    
 
}