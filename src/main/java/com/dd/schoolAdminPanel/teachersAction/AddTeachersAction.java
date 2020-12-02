package com.dd.schoolAdminPanel.teachersAction;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.constants.LangUtils;
import com.dd.schoolAdminPanel.constants.SessionConstants;
import com.dd.schoolAdminPanel.teachersBean.Teachers;
import com.dd.schoolAdminPanel.teachersService.TeachersService;
import com.dd.schoolAdminPanel.teachersService.TeachersServiceInterface;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

import net.sf.json.JSONObject;

@WebServlet("/AddTeachers")
@MultipartConfig
public class AddTeachersAction extends HttpServlet {

    private Log log = LogFactory.getLog(AddTeachersAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class AddTeachersAction");
        Teachers teachers = new Teachers();
        PrintWriter out = response.getWriter();
        JSONObject addTeachersResponse = new JSONObject();
        TeachersServiceInterface teachersServiceInterface = new TeachersService();
        LangUtils langUtils = new LangUtils();
        UserDetails userTOSession = (UserDetails) this.getValueFromSessionVariable(request, SessionConstants.SESSION_VITAL_USER);
        try {

            String teacherId = request.getParameter("teacherId");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String contactNumber = request.getParameter("contactNumber");
            String emailAddress = request.getParameter("emailAddress");
            String qualification = request.getParameter("qualification");
            String gender = request.getParameter("gender");
            String age = request.getParameter("age");
            String martialStatus = request.getParameter("martialStatus");
            String address = request.getParameter("address");

            if (langUtils.validateIsNotEmpty(teacherId)) {
                teachers.setTeacherId(langUtils.assignNumber(teacherId));
            }
            if (langUtils.validateIsNotEmpty(firstName)) {
                teachers.setFirstName(langUtils.assignString(firstName));
            }
            if (langUtils.validateIsNotEmpty(lastName)) {
                teachers.setLastName(langUtils.assignString(lastName));
            }
            if (langUtils.validateIsNotEmpty(contactNumber)) {
                teachers.setContactNumber(langUtils.assignString(contactNumber));
            }
            if (langUtils.validateIsNotEmpty(emailAddress)) {
                teachers.setEmailId(langUtils.assignString(emailAddress));
            }
            if (langUtils.validateIsNotEmpty(qualification)) {
                teachers.setQualification(langUtils.assignString(qualification));
            }
            if (langUtils.validateIsNotEmpty(gender)) {
                teachers.setGender(langUtils.assignString(gender));
            }
            if (langUtils.validateIsNotEmpty(age)) {
                teachers.setAge(langUtils.assignNumber(age));
            }
            if (langUtils.validateIsNotEmpty(martialStatus)) {
                teachers.setMartialStatus(langUtils.assignString(martialStatus));
            }
            if (langUtils.validateIsNotEmpty(address)) {
                teachers.setAddress(langUtils.assignString(address));
            }

            teachers.setCreatedBy(userTOSession.getUserName());
            teachers.setUpdatedBy(userTOSession.getUserName());


            teachersServiceInterface.addTeachers(teachers);

            addTeachersResponse.accumulate("success", true);
            addTeachersResponse.accumulate("message", "Successfully Teacher Values Inserted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(addTeachersResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class AddTeachers " + e.getMessage());
            if(e.getMessage().contains("ConstraintViolationException")) {
            	addTeachersResponse.accumulate("failure", true);
            	addTeachersResponse.accumulate("message", "Teacher Already Exists, Kindly try to add different Teachers");
        	}else {
        		addTeachersResponse.accumulate("failure", true);
        		addTeachersResponse.accumulate("message", e.getMessage());
        	}
            response.setContentType("text/json; charset=UTF-8");
            out.print(addTeachersResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    public Object getValueFromSessionVariable(HttpServletRequest request, String key) {
        this.session = request.getSession(true);
        return this.session.getAttribute(key);
    }




}