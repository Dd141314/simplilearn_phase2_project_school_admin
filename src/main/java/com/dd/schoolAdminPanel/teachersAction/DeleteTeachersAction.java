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

@WebServlet("/DeleteTeachers")
public class DeleteTeachersAction extends HttpServlet {

    private Log log = LogFactory.getLog(DeleteTeachersAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class DeleteTeachersAction");
        Teachers teachers = new Teachers();
        PrintWriter out = response.getWriter();
        JSONObject deleteTeachersResponse = new JSONObject();
        TeachersServiceInterface teachersServiceInterface = new TeachersService();
        LangUtils langUtils = new LangUtils();
        try {

            String teacherId = request.getParameter("teachersId");

            if (langUtils.validateIsNotEmpty(teacherId)) {
                teachers.setTeacherId(langUtils.assignNumber(teacherId));
            }

            teachersServiceInterface.deleteTeachers(teachers);

            deleteTeachersResponse.accumulate("success", true);
            deleteTeachersResponse.accumulate("message", "Successfully Teacher Values Deleted");
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteTeachersResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class deleteTeachers " + e.getMessage());
            deleteTeachersResponse.accumulate("failure", true);
            deleteTeachersResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteTeachersResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }





}