package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingDAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

@SuppressWarnings({"unchecked","rawtypes","deprecation"})
public class TeachersClassesSubjectsMappingDAO implements TeachersClassesSubjectsMappingDAOInterface {

    private Log log = LogFactory.getLog(TeachersClassesSubjectsMappingDAO.class);

    @Override
    public synchronized void addTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) {
        log.info("Entering Method addTeachersClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachersTeachersClassesSubjectsMapping.getTeachersClassesSubjectsMappingId() <= 0) {
    			session.save(teachersTeachersClassesSubjectsMapping);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method addTeachersClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method addTeachersClassesSubjectsMapping");

        }
    }

    
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(TeachersClassesSubjectsMapping.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
    
    @Override
    public synchronized Session userDetailsSessionFactoryForJoinTable() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ClassesSubjectsMapping.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }


	@Override
	public synchronized List<TeachersClassesSubjectsMapping> listTeachersClassesSubjectsMapping() {
        log.info("Entering Method listTeachersClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        List<TeachersClassesSubjectsMapping> teachersTeachersClassesSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {
			 teachersTeachersClassesSubjectsMappingList =  session.createQuery(" from TeachersClassesSubjectsMapping").getResultList();
        } catch (Exception re) {
            log.error(" Error while executing the method listTeachersClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listTeachersClassesSubjectsMapping");

        }
		return teachersTeachersClassesSubjectsMappingList;
	}
	
	
	@Override
    public synchronized void deleteTeachersClassesSubjectsMapping(TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMapping) {
        log.info("Entering Method deleteTeachersClassesSubjectsMapping ");
        Session session = this.userDetailsSessionFactory();
        try {
        	if(teachersTeachersClassesSubjectsMapping.getTeachersClassesSubjectsMappingId() > 0) {
        		TeachersClassesSubjectsMapping teachersTeachersClassesSubjectsMappingObj = session.get(TeachersClassesSubjectsMapping.class, teachersTeachersClassesSubjectsMapping.getTeachersClassesSubjectsMappingId());
    			session.delete(teachersTeachersClassesSubjectsMappingObj);
        	}
			session.getTransaction().commit();
			
        } catch (Exception re) {
			session.getTransaction().rollback();
            log.error(" Error while executing the method deleteTeachersClassesSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method deleteTeachersClassesSubjectsMapping");

        }
    }
	
	@Override
	public synchronized List<TeachersClassesSubjectsMapping> listUniqueClassesFromSubjectsMapping() {
        log.info("Entering Method listUniqueClassesFromSubjectsMapping ");
        Session session = this.userDetailsSessionFactoryForJoinTable();
        List<TeachersClassesSubjectsMapping> uniqueClassesFromSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {
			Criteria uniqueClassesFromSubjectsMappingCriteria  = session.createCriteria(ClassesSubjectsMapping.class);
			uniqueClassesFromSubjectsMappingCriteria.setProjection(Projections.distinct(Projections.projectionList()
					 .add(Projections.property("classId"))         //0
					 .add(Projections.property("className"))       //1
			));
			List results = uniqueClassesFromSubjectsMappingCriteria.list();
			if(results != null && results.size() > 0) {
				Iterator<Object> it = results.iterator();
				while(it.hasNext()) {
					Object[] row = (Object[]) it.next();
					TeachersClassesSubjectsMapping teachersClassesSubjectsMappingObj = new TeachersClassesSubjectsMapping();
					teachersClassesSubjectsMappingObj.setClassId((Integer) row[0]);
					teachersClassesSubjectsMappingObj.setClassName((String) row[1]);
					uniqueClassesFromSubjectsMappingList.add(teachersClassesSubjectsMappingObj);
				}
			}

        } catch (Exception re) {
            log.error(" Error while executing the method listUniqueClassesFromSubjectsMapping " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method listUniqueClassesFromSubjectsMapping");

        }
		return uniqueClassesFromSubjectsMappingList;
	}
	
	@Override
	public synchronized List<TeachersClassesSubjectsMapping> getSubjectsFromClassesSubjectsMappingAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) {
        log.info("Entering Method getSubjectsFromClassesSubjectsMappingAction ");
        Session session = this.userDetailsSessionFactoryForJoinTable();
        List<TeachersClassesSubjectsMapping> getSubjectsFromClassesSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {
			Criteria uniqueClassesFromSubjectsMappingCriteria  = session.createCriteria(ClassesSubjectsMapping.class);
			uniqueClassesFromSubjectsMappingCriteria.add(Restrictions.eq("classId", teachersClassesSubjectsMapping.getClassId()));
			uniqueClassesFromSubjectsMappingCriteria.setProjection(Projections.distinct(Projections.projectionList()
					 .add(Projections.property("subjectId"))         //0
					 .add(Projections.property("subjectName"))       //1
			));
			List results = uniqueClassesFromSubjectsMappingCriteria.list();
			if(results != null && results.size() > 0) {
				Iterator<Object> it = results.iterator();
				while(it.hasNext()) {
					Object[] row = (Object[]) it.next();
					TeachersClassesSubjectsMapping teachersClassesSubjectsMappingObj = new TeachersClassesSubjectsMapping();
					teachersClassesSubjectsMappingObj.setSubjectId((Integer) row[0]);
					teachersClassesSubjectsMappingObj.setSubjectName((String) row[1]);
					getSubjectsFromClassesSubjectsMappingList.add(teachersClassesSubjectsMappingObj);
				}
			}
        } catch (Exception re) {
            log.error(" Error while executing the method getSubjectsFromClassesSubjectsMappingAction " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getSubjectsFromClassesSubjectsMappingAction ");

        }
		return getSubjectsFromClassesSubjectsMappingList;
	}

 
}