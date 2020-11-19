package com.dd.schoolAdminPanel.subjectsAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
import com.dd.schoolAdminPanel.subjectsBean.Subjects;
import com.dd.schoolAdminPanel.subjectsService.SubjectsService;
import com.dd.schoolAdminPanel.subjectsService.SubjectsServiceInterface;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

import net.sf.json.JSONObject;

@WebServlet("/EditSubjects")
@MultipartConfig
public class EditSubjectsAction extends HttpServlet {

    private Log log = LogFactory.getLog(EditSubjectsAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class EditSubjectsAction");
        Subjects subjects = new Subjects();
        PrintWriter out = response.getWriter();
        JSONObject editSubjectsResponse = new JSONObject();
        SubjectsServiceInterface subjectsServiceInterface = new SubjectsService();
        LangUtils langUtils = new LangUtils();
        UserDetails userTOSession = (UserDetails) this.getValueFromSessionVariable(request, SessionConstants.SESSION_VITAL_USER);
        try {

            String subjectId = request.getParameter("subjectId");
            String subjectName = request.getParameter("subjectName");
            String subjectDescription = request.getParameter("subjectDescription");

            if (langUtils.validateIsNotEmpty(subjectId)) {
                subjects.setSubjectId(langUtils.assignNumber(subjectId));
            }
            if (langUtils.validateIsNotEmpty(subjectName)) {
                subjects.setSubjectName(langUtils.assignString(subjectName));
            }
            if (langUtils.validateIsNotEmpty(subjectDescription)) {
                subjects.setSubjectDescription(langUtils.assignString(subjectDescription));
            }
            
            subjects.setUpdatedBy(userTOSession.getUserName());
            subjects.setUpdatedDt( new Date());

            subjectsServiceInterface.editSubjects(subjects);

            editSubjectsResponse.accumulate("success", true);
            editSubjectsResponse.accumulate("message", "Successfully Subject Values Updated");
            response.setContentType("text/json; charset=UTF-8");
            out.print(editSubjectsResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class EditSubjects " + e.getMessage());
            editSubjectsResponse.accumulate("failure", true);
            editSubjectsResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(editSubjectsResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    public Object getValueFromSessionVariable(HttpServletRequest request, String key) {
        this.session = request.getSession(true);
        return this.session.getAttribute(key);
    }




}