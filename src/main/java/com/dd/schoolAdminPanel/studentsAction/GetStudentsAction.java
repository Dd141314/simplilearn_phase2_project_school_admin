package com.dd.schoolAdminPanel.studentsAction;

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
import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.studentsService.StudentsService;
import com.dd.schoolAdminPanel.studentsService.StudentsServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/GetStudents")
public class GetStudentsAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetStudentsAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetStudentsAction");
        Students students = new Students();
        PrintWriter out = response.getWriter();
        JSONObject deleteStudentsResponse = new JSONObject();
        StudentsServiceInterface studentsServiceInterface = new StudentsService();
        LangUtils langUtils = new LangUtils();
        try {

            String studentId = request.getParameter("studentsId");

            if (langUtils.validateIsNotEmpty(studentId)) {
                students.setStudentsId(langUtils.assignNumber(studentId));
            }

            Students teacherResponse = studentsServiceInterface.getStudents(students);

            deleteStudentsResponse.accumulate("success", true);
            deleteStudentsResponse.accumulate("response", teacherResponse);
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteStudentsResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetStudentsAction " + e.getMessage());
            deleteStudentsResponse.accumulate("failure", true);
            deleteStudentsResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteStudentsResponse);
        } finally {
        }

    }





}