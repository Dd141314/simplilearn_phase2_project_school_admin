package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingAction;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.constants.LangUtils;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/DeleteTeachersClassesSubjectsMapping")
public class DeleteTeachersClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(DeleteTeachersClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class DeleteTeachersClassesSubjectsMappingAction");
        TeachersClassesSubjectsMapping teachersClassesSubjectsMapping = new TeachersClassesSubjectsMapping();
        PrintWriter out = response.getWriter();
        JSONObject deleteTeachersClassesSubjectsMappingResponse = new JSONObject();
        TeachersClassesSubjectsMappingServiceInterface teachersClassesSubjectsMappingServiceInterface = new TeachersClassesSubjectsMappingService();
        LangUtils langUtils = new LangUtils();
        try {

            String teachersClassesSubjectsMappingId = request.getParameter("teachersClassesSubjectsMappingId");

            if (langUtils.validateIsNotEmpty(teachersClassesSubjectsMappingId)) {
                teachersClassesSubjectsMapping.setTeachersClassesSubjectsMappingId(langUtils.assignNumber(teachersClassesSubjectsMappingId));
            }

            teachersClassesSubjectsMappingServiceInterface.deleteTeachersClassesSubjectsMapping(teachersClassesSubjectsMapping);

            deleteTeachersClassesSubjectsMappingResponse.accumulate("success", true);
            deleteTeachersClassesSubjectsMappingResponse.accumulate("message", "Successfully Teacher-Class-Subject Mapping Values Deleted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteTeachersClassesSubjectsMappingResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class deleteTeachersClassesSubjectsMapping " + e.getMessage());
            deleteTeachersClassesSubjectsMappingResponse.accumulate("failure", true);
            deleteTeachersClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteTeachersClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }





}