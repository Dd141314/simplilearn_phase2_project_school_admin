package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingAction;

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
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingServiceInterface;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

import net.sf.json.JSONObject;

@WebServlet("/AddTeachersClassesSubjectsMapping")
@MultipartConfig
public class AddTeachersClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(AddTeachersClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class AddTeachersClassesSubjectsMappingAction");
        TeachersClassesSubjectsMapping teachersClassesSubjectsMapping = new TeachersClassesSubjectsMapping();
        PrintWriter out = response.getWriter();
        JSONObject addTeachersClassesSubjectsMappingResponse = new JSONObject();
        TeachersClassesSubjectsMappingServiceInterface teachersClassesSubjectsMappingServiceInterface = new TeachersClassesSubjectsMappingService();
        LangUtils langUtils = new LangUtils();
        UserDetails userTOSession = (UserDetails) this.getValueFromSessionVariable(request, SessionConstants.SESSION_VITAL_USER);
        try {

        	String teachersClassesSubjectsMappingId = request.getParameter("teachersClassesSubjectsMappingId");
            String classId = request.getParameter("classId");
            String className = request.getParameter("className");
            String subjectId = request.getParameter("subjectId");
            String subjectName = request.getParameter("subjectName");
            String teacherId = request.getParameter("teacherId");
            String teacherName = request.getParameter("teacherName");

            if (langUtils.validateIsNotEmpty(teachersClassesSubjectsMappingId)) {
                teachersClassesSubjectsMapping.setTeachersClassesSubjectsMappingId(langUtils.assignNumber(teachersClassesSubjectsMappingId));
            }
            if (langUtils.validateIsNotEmpty(classId)) {
                teachersClassesSubjectsMapping.setClassId(langUtils.assignNumber(classId));
            }
            if (langUtils.validateIsNotEmpty(className)) {
                teachersClassesSubjectsMapping.setClassName(langUtils.assignString(className));
            }
            if (langUtils.validateIsNotEmpty(subjectId)) {
                teachersClassesSubjectsMapping.setSubjectId(langUtils.assignNumber(subjectId));
            }
            if (langUtils.validateIsNotEmpty(subjectName)) {
                teachersClassesSubjectsMapping.setSubjectName(langUtils.assignString(subjectName));
            }
            if (langUtils.validateIsNotEmpty(teacherId)) {
                teachersClassesSubjectsMapping.setTeacherId(langUtils.assignNumber(teacherId));
            }
            if (langUtils.validateIsNotEmpty(teacherName)) {
                teachersClassesSubjectsMapping.setTeacherName(langUtils.assignString(teacherName));
            }

            teachersClassesSubjectsMapping.setCreatedBy(userTOSession.getUserName());
            teachersClassesSubjectsMapping.setUpdatedBy(userTOSession.getUserName());


            teachersClassesSubjectsMappingServiceInterface.addTeachersClassesSubjectsMapping(teachersClassesSubjectsMapping);

            addTeachersClassesSubjectsMappingResponse.accumulate("success", true);
            addTeachersClassesSubjectsMappingResponse.accumulate("message", "Successfully Teacher-Class-Subject Mapping Values Inserted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(addTeachersClassesSubjectsMappingResponse);


        } catch (Exception e) {
        	log.error("Error while executing the method doPost in class AddTeachersClassesSubjectsMapping " + e.getMessage());
        	if(e.getMessage().contains("ConstraintViolationException")) {
                addTeachersClassesSubjectsMappingResponse.accumulate("failure", true);
                addTeachersClassesSubjectsMappingResponse.accumulate("message", "Class-Subject Mapping Already Exists, Kindly try different Mapping!");
        	}else {
                addTeachersClassesSubjectsMappingResponse.accumulate("failure", true);
                addTeachersClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
        	}
            response.setContentType("text/json; charset=UTF-8");
            out.print(addTeachersClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    public Object getValueFromSessionVariable(HttpServletRequest request, String key) {
        this.session = request.getSession(true);
        return this.session.getAttribute(key);
    }




}