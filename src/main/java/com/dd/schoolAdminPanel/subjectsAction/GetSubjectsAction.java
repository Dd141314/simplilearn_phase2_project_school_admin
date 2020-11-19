package com.dd.schoolAdminPanel.subjectsAction;

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
import com.dd.schoolAdminPanel.subjectsBean.Subjects;
import com.dd.schoolAdminPanel.subjectsService.SubjectsService;
import com.dd.schoolAdminPanel.subjectsService.SubjectsServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/GetSubjects")
public class GetSubjectsAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetSubjectsAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetSubjectsAction");
        Subjects subjects = new Subjects();
        PrintWriter out = response.getWriter();
        JSONObject deleteSubjectsResponse = new JSONObject();
        SubjectsServiceInterface subjectsServiceInterface = new SubjectsService();
        LangUtils langUtils = new LangUtils();
        try {

            String subjectId = request.getParameter("subjectsId");

            if (langUtils.validateIsNotEmpty(subjectId)) {
                subjects.setSubjectId(langUtils.assignNumber(subjectId));
            }

            Subjects teacherResponse = subjectsServiceInterface.getSubjects(subjects);

            deleteSubjectsResponse.accumulate("success", true);
            deleteSubjectsResponse.accumulate("response", teacherResponse);
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteSubjectsResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetSubjectsAction " + e.getMessage());
            deleteSubjectsResponse.accumulate("failure", true);
            deleteSubjectsResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteSubjectsResponse);
        } finally {
            log.info("Exiting the method doPost in class GetSubjectsAction");
        }

    }





}