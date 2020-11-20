package com.dd.schoolAdminPanel.teachersClassesSubjectsMappingAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet("/GetSubjectsFromClassesSubjectsMapping")
public class GetSubjectsFromClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetSubjectsFromClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetSubjectsFromClassesSubjectsMappingAction");
        TeachersClassesSubjectsMapping teachersClassesSubjectsMapping = new TeachersClassesSubjectsMapping();
		List<TeachersClassesSubjectsMapping> subjectsFromClassesSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        PrintWriter out = response.getWriter();
        JSONObject teachersClassesSubjectsMappingResponse = new JSONObject();
        TeachersClassesSubjectsMappingServiceInterface teachersClassesSubjectsMappingServiceInterface = new TeachersClassesSubjectsMappingService();
        LangUtils langUtils = new LangUtils();
        try {

            String classId = request.getParameter("classId");

            if (langUtils.validateIsNotEmpty(classId)) {
            	teachersClassesSubjectsMapping.setClassId(langUtils.assignNumber(classId));
            }

             subjectsFromClassesSubjectsMappingList = teachersClassesSubjectsMappingServiceInterface.getSubjectsFromClassesSubjectsMappingAction(teachersClassesSubjectsMapping);

            teachersClassesSubjectsMappingResponse.accumulate("success", true);
            teachersClassesSubjectsMappingResponse.accumulate("response", subjectsFromClassesSubjectsMappingList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(teachersClassesSubjectsMappingResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetSubjectsFromClassesSubjectsMappingAction " + e.getMessage());
            teachersClassesSubjectsMappingResponse.accumulate("failure", true);
            teachersClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(teachersClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class GetSubjectsFromClassesSubjectsMappingAction");
        }

    }





}