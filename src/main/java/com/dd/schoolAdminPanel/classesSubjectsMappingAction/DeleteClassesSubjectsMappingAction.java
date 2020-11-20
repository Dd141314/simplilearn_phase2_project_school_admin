package com.dd.schoolAdminPanel.classesSubjectsMappingAction;

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
import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/DeleteClassesSubjectsMapping")
public class DeleteClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(DeleteClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class DeleteClassesSubjectsMappingAction");
        ClassesSubjectsMapping classesSubjectsMapping = new ClassesSubjectsMapping();
        PrintWriter out = response.getWriter();
        JSONObject deleteClassesSubjectsMappingResponse = new JSONObject();
        ClassesSubjectsMappingServiceInterface classesSubjectsMappingServiceInterface = new ClassesSubjectsMappingService();
        LangUtils langUtils = new LangUtils();
        try {

            String classesSubjectsMappingId = request.getParameter("classesSubjectsMappingId");

            if (langUtils.validateIsNotEmpty(classesSubjectsMappingId)) {
                classesSubjectsMapping.setClassesSubjectsMappingId(langUtils.assignNumber(classesSubjectsMappingId));
            }

            classesSubjectsMappingServiceInterface.deleteClassesSubjectsMapping(classesSubjectsMapping);

            deleteClassesSubjectsMappingResponse.accumulate("success", true);
            deleteClassesSubjectsMappingResponse.accumulate("message", "Successfully Class-Subject Mapping Values Deleted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteClassesSubjectsMappingResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class deleteClassesSubjectsMapping " + e.getMessage());
            deleteClassesSubjectsMappingResponse.accumulate("failure", true);
            deleteClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }





}