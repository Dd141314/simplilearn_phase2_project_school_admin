package com.dd.schoolAdminPanel.classesAction;

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
import com.dd.schoolAdminPanel.classesBean.Classes;
import com.dd.schoolAdminPanel.classesService.ClassesService;
import com.dd.schoolAdminPanel.classesService.ClassesServiceInterface;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;

import net.sf.json.JSONObject;

@WebServlet("/EditClasses")
@MultipartConfig
public class EditClassesAction extends HttpServlet {

    private Log log = LogFactory.getLog(EditClassesAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class EditClassesAction");
        Classes classes = new Classes();
        PrintWriter out = response.getWriter();
        JSONObject editClassesResponse = new JSONObject();
        ClassesServiceInterface classesServiceInterface = new ClassesService();
        LangUtils langUtils = new LangUtils();
        UserDetails userTOSession = (UserDetails) this.getValueFromSessionVariable(request, SessionConstants.SESSION_VITAL_USER);
        try {

            String classId = request.getParameter("classId");
            String className = request.getParameter("className");
            String sectionName = request.getParameter("sectionName");
            String totalNumberOfStudents = request.getParameter("totalNumberOfStudents");
            String roomNo = request.getParameter("roomNo");
            String classTeacherName = request.getParameter("classTeacherName");

            if (langUtils.validateIsNotEmpty(classId)) {
                classes.setClassId(langUtils.assignNumber(classId));
            }
            if (langUtils.validateIsNotEmpty(className)) {
                classes.setClassName(langUtils.assignString(className));
            }
            if (langUtils.validateIsNotEmpty(sectionName)) {
                classes.setSectionName(langUtils.assignString(sectionName));
            }
            if (langUtils.validateIsNotEmpty(totalNumberOfStudents)) {
                classes.setTotalNumberOfStudents(langUtils.assignNumber(totalNumberOfStudents));
            }
            if (langUtils.validateIsNotEmpty(roomNo)) {
                classes.setRoomNo(langUtils.assignString(roomNo));
            }
            if (langUtils.validateIsNotEmpty(classTeacherName)) {
                classes.setClassTeacherName(langUtils.assignString(classTeacherName));
            }

            classes.setUpdatedBy(userTOSession.getUserName());
            classes.setUpdatedDt( new Date());

            classesServiceInterface.editClasses(classes);

            editClassesResponse.accumulate("success", true);
            editClassesResponse.accumulate("message", "Successfully Teacher Values Updated");
            response.setContentType("text/json; charset=UTF-8");
            out.print(editClassesResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class EditClasses " + e.getMessage());
            editClassesResponse.accumulate("failure", true);
            editClassesResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(editClassesResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    public Object getValueFromSessionVariable(HttpServletRequest request, String key) {
        this.session = request.getSession(true);
        return this.session.getAttribute(key);
    }




}