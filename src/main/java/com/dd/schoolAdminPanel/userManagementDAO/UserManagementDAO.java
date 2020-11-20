package com.dd.schoolAdminPanel.userManagementDAO;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

@SuppressWarnings({"rawtypes","unchecked"})
public class UserManagementDAO implements UserManagementDAOInterface {

    private Log log = LogFactory.getLog(UserManagementDAO.class);

    @Override
    public synchronized UserDetails userLoginAuthentication(UserDetails userDetails) {
        log.info("Entering Method userLoginAuthentication ");
        Session session = this.userDetailsSessionFactory();
        UserDetails UserDetailsResponse;
        try {
        	
        	Query query =  session.createQuery(" from UserDetails UD where UD.userName= :userName and UD.password= :password ");
			query.setParameter("userName", userDetails.getUserName());
			query.setParameter("password", userDetails.getPassword());
			List<UserDetails> results = query.list();
			if (results.size() > 0) {
				UserDetailsResponse = (UserDetails) results.get(0);
			} else {
				UserDetailsResponse = null;
			}
			
        } catch (Exception re) {
            log.error(" Error while executing the method userLoginAuthentication " + re.getMessage() + re.getClass());
            throw re;
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (Exception e) {
                    log.error("Session Closed!" + e);
                }
            }
            log.info("Exiting the method userLoginAuthentication");

        }
		return UserDetailsResponse;
    }

    @Override
    public synchronized Session userDetailsSessionFactory() {
        // TODO Auto-generated method stub
        SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(UserDetails.class)
            .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
        return session;
    }
    
 
}