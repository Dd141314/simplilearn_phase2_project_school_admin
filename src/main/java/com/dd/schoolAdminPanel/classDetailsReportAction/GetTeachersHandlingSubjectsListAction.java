package com.dd.schoolAdminPanel.classDetailsReportAction;

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

import com.dd.schoolAdminPanel.classDetailsReportService.ClassDetailsReportService;
import com.dd.schoolAdminPanel.classDetailsReportService.ClassDetailsReportServiceInterface;
import com.dd.schoolAdminPanel.constants.LangUtils;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;

import net.sf.json.JSONObject;

@WebServlet("/GetTeachersHandlingSubjectsList")
public class GetTeachersHandlingSubjectsListAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetTeachersHandlingSubjectsListAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetTeachersHandlingSubjectsListAction");
        TeachersClassesSubjectsMapping teachersClassesSubjectsMapping = new TeachersClassesSubjectsMapping();
		List<TeachersClassesSubjectsMapping> teachersHandlingSubjectsList = new ArrayList<TeachersClassesSubjectsMapping>();
        PrintWriter out = response.getWriter();
        JSONObject teachersClassesSubjectsMappingResponse = new JSONObject();
        ClassDetailsReportServiceInterface classDetailsReportServiceInterface = new ClassDetailsReportService();
        LangUtils langUtils = new LangUtils();
        try {

            String classId = request.getParameter("classId");

            if (langUtils.validateIsNotEmpty(classId)) {
            	teachersClassesSubjectsMapping.setClassId(langUtils.assignNumber(classId));
            }

            teachersHandlingSubjectsList = classDetailsReportServiceInterface.getTeachersHandlingSubjectsListAction(teachersClassesSubjectsMapping);

            teachersClassesSubjectsMappingResponse.accumulate("success", true);
            teachersClassesSubjectsMappingResponse.accumulate("response", teachersHandlingSubjectsList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(teachersClassesSubjectsMappingResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetTeachersHandlingSubjectsListAction " + e.getMessage());
            teachersClassesSubjectsMappingResponse.accumulate("failure", true);
            teachersClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(teachersClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doPost in class GetTeachersHandlingSubjectsListAction");
        }

    }





}