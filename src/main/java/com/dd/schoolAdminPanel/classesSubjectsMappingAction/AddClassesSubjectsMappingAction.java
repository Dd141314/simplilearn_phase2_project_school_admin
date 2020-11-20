package com.dd.schoolAdminPanel.classesSubjectsMappingAction;

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
import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingServiceInterface;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

import net.sf.json.JSONObject;

@WebServlet("/AddClassesSubjectsMapping")
@MultipartConfig
public class AddClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(AddClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class AddClassesSubjectsMappingAction");
        ClassesSubjectsMapping classesSubjectsMapping = new ClassesSubjectsMapping();
        PrintWriter out = response.getWriter();
        JSONObject addClassesSubjectsMappingResponse = new JSONObject();
        ClassesSubjectsMappingServiceInterface classesSubjectsMappingServiceInterface = new ClassesSubjectsMappingService();
        LangUtils langUtils = new LangUtils();
        UserDetails userTOSession = (UserDetails) this.getValueFromSessionVariable(request, SessionConstants.SESSION_VITAL_USER);
        try {

        	String classesSubjectsMappingId = request.getParameter("classesSubjectsMappingId");
            String classId = request.getParameter("classId");
            String className = request.getParameter("className");
            String subjectId = request.getParameter("subjectId");
            String subjectName = request.getParameter("subjectName");
            

            if (langUtils.validateIsNotEmpty(classesSubjectsMappingId)) {
                classesSubjectsMapping.setClassesSubjectsMappingId(langUtils.assignNumber(classesSubjectsMappingId));
            }
            if (langUtils.validateIsNotEmpty(classId)) {
                classesSubjectsMapping.setClassId(langUtils.assignNumber(classId));
            }
            if (langUtils.validateIsNotEmpty(className)) {
                classesSubjectsMapping.setClassName(langUtils.assignString(className));
            }
            if (langUtils.validateIsNotEmpty(subjectId)) {
                classesSubjectsMapping.setSubjectId(langUtils.assignNumber(subjectId));
            }
            if (langUtils.validateIsNotEmpty(subjectName)) {
                classesSubjectsMapping.setSubjectName(langUtils.assignString(subjectName));
            }

            classesSubjectsMapping.setCreatedBy(userTOSession.getUserName());
            classesSubjectsMapping.setUpdatedBy(userTOSession.getUserName());


            classesSubjectsMappingServiceInterface.addClassesSubjectsMapping(classesSubjectsMapping);

            addClassesSubjectsMappingResponse.accumulate("success", true);
            addClassesSubjectsMappingResponse.accumulate("message", "Successfully Class-Subject Mapping Values Inserted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(addClassesSubjectsMappingResponse);


        } catch (Exception e) {
        	log.error("Error while executing the method doPost in class AddClassesSubjectsMapping " + e.getMessage());
        	if(e.getMessage().contains("ConstraintViolationException")) {
                addClassesSubjectsMappingResponse.accumulate("failure", true);
                addClassesSubjectsMappingResponse.accumulate("message", "Class-Subject Mapping Already Exists, Kindly try different Mapping!");
        	}else {
                addClassesSubjectsMappingResponse.accumulate("failure", true);
                addClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
        	}
            response.setContentType("text/json; charset=UTF-8");
            out.print(addClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    public Object getValueFromSessionVariable(HttpServletRequest request, String key) {
        this.session = request.getSession(true);
        return this.session.getAttribute(key);
    }




}