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
import com.dd.schoolAdminPanel.studentsBean.Students;

import net.sf.json.JSONObject;

@WebServlet("/GetStudentsInTheClassList")
public class GetStudentsInTheClassListAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetStudentsInTheClassListAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetStudentsInTheClassListAction");
        Students students = new Students();
		List<Students> studentsInTheClassList = new ArrayList<Students>();
        PrintWriter out = response.getWriter();
        JSONObject  studentsInTheClassListResponse = new JSONObject();
        ClassDetailsReportServiceInterface classDetailsReportServiceInterface = new ClassDetailsReportService();
        LangUtils langUtils = new LangUtils();
        try {

            String classId = request.getParameter("classId");

            if (langUtils.validateIsNotEmpty(classId)) {
            	students.setClassId(langUtils.assignNumber(classId));
            }

            studentsInTheClassList = classDetailsReportServiceInterface.getStudentsInTheClassListAction(students);

            studentsInTheClassListResponse.accumulate("success", true);
            studentsInTheClassListResponse.accumulate("response", studentsInTheClassList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(studentsInTheClassListResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetStudentsInTheClassListAction " + e.getMessage());
            studentsInTheClassListResponse.accumulate("failure", true);
            studentsInTheClassListResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(studentsInTheClassListResponse);
        } finally {
            log.info("Exiting the method doPost in class GetStudentsInTheClassListAction");
        }

    }





}