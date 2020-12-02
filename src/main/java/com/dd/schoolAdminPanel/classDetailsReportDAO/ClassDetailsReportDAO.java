package com.dd.schoolAdminPanel.classDetailsReportDAO;

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

import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

@SuppressWarnings({"unchecked","rawtypes","deprecation"})
public class ClassDetailsReportDAO implements ClassDetailsReportDAOInterface {

    private Log log = LogFactory.getLog(ClassDetailsReportDAO.class);
    
    @Override
    public synchronized Session userDetailsSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(TeachersClassesSubjectsMapping.class)
            .addAnnotatedClass(Students.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }

	public synchronized List<TeachersClassesSubjectsMapping> getTeachersHandlingSubjectsListAction(TeachersClassesSubjectsMapping teachersClassesSubjectsMapping) {
        log.info("Entering Method getTeachersHandlingSubjectsListAction ");
        Session session = this.userDetailsSessionFactory();
        List<TeachersClassesSubjectsMapping> getTeachersHandlingSubjectsList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {
			Criteria teachersHandlingSubjectsCriteria  = session.createCriteria(TeachersClassesSubjectsMapping.class);
			teachersHandlingSubjectsCriteria.add(Restrictions.eq("classId", teachersClassesSubjectsMapping.getClassId()));
			teachersHandlingSubjectsCriteria.setProjection(Projections.distinct(Projections.projectionList()
					 .add(Projections.property("teacherId"))         //0
					 .add(Projections.property("teacherName"))       //1
					 .add(Projections.property("subjectId"))         //2
					 .add(Projections.property("subjectName"))       //3
			));
			List results = teachersHandlingSubjectsCriteria.list();
			if(results != null && results.size() > 0) {
				Iterator<Object> it = results.iterator();
				while(it.hasNext()) {
					Object[] row = (Object[]) it.next();
					TeachersClassesSubjectsMapping teachersClassesSubjectsMappingObj = new TeachersClassesSubjectsMapping();
					teachersClassesSubjectsMappingObj.setTeacherId((Integer) row[0]);
					teachersClassesSubjectsMappingObj.setTeacherName((String) row[1]);
					teachersClassesSubjectsMappingObj.setSubjectId((Integer) row[2]);
					teachersClassesSubjectsMappingObj.setSubjectName((String) row[3]);
					getTeachersHandlingSubjectsList.add(teachersClassesSubjectsMappingObj);
				}
			}
        } catch (Exception re) {
            log.error(" Error while executing the method getTeachersHandlingSubjectsListAction " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getTeachersHandlingSubjectsListAction ");

        }
		return getTeachersHandlingSubjectsList;
	}
	
	
	public synchronized List<Students> getStudentsInTheClassListAction(Students students) {
        log.info("Entering Method getStudentsInTheClassListAction ");
        Session session = this.userDetailsSessionFactory();
        List<Students> getStudentsInTheClassList = new ArrayList<Students>();
        try {
			Criteria studentsInTheClassCriteria  = session.createCriteria(Students.class);
			studentsInTheClassCriteria.add(Restrictions.eq("classId", students.getClassId()));
			studentsInTheClassCriteria.setProjection(Projections.distinct(Projections.projectionList()
					 .add(Projections.property("studentId"))         //0
					 .add(Projections.property("studentName"))       //1
					 .add(Projections.property("emergencyContactNumber")) //2
					 .add(Projections.property("bloodGroup"))       //3
					 .add(Projections.property("gender"))       //3
			));
			List results = studentsInTheClassCriteria.list();
			if(results != null && results.size() > 0) {
				Iterator<Object> it = results.iterator();
				while(it.hasNext()) {
					Object[] row = (Object[]) it.next();
					Students studentsObj = new Students();
					studentsObj.setStudentsId((Integer) row[0]);
					studentsObj.setStudentName((String) row[1]);
					studentsObj.setEmergencyContactNumber((String) row[2]);
					studentsObj.setBloodGroup((String) row[3]);
					studentsObj.setGender((String) row[4]);
					getStudentsInTheClassList.add(studentsObj);
				}
			}
        } catch (Exception re) {
            log.error(" Error while executing the method getStudentsInTheClassListAction " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method getStudentsInTheClassListAction ");

        }
		return getStudentsInTheClassList;
	}


 
}