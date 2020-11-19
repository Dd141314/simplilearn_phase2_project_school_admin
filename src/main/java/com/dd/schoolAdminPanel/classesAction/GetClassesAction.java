package com.dd.schoolAdminPanel.classesAction;

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
import com.dd.schoolAdminPanel.classesBean.Classes;
import com.dd.schoolAdminPanel.classesService.ClassesService;
import com.dd.schoolAdminPanel.classesService.ClassesServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/GetClasses")
public class GetClassesAction extends HttpServlet {

    private Log log = LogFactory.getLog(GetClassesAction.class);
    private static final long serialVersionUID = 1;
    public HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class GetClassesAction");
        Classes classes = new Classes();
        PrintWriter out = response.getWriter();
        JSONObject deleteClassesResponse = new JSONObject();
        ClassesServiceInterface classesServiceInterface = new ClassesService();
        LangUtils langUtils = new LangUtils();
        try {

            String classId = request.getParameter("classId");

            if (langUtils.validateIsNotEmpty(classId)) {
                classes.setClassId(langUtils.assignNumber(classId));
            }

            Classes teacherResponse = classesServiceInterface.getClasses(classes);

            deleteClassesResponse.accumulate("success", true);
            deleteClassesResponse.accumulate("response", teacherResponse);
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteClassesResponse);

        } catch (Exception e) {
            log.error("Error while executing the method doPost in class GetClassesAction " + e.getMessage());
            deleteClassesResponse.accumulate("failure", true);
            deleteClassesResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(deleteClassesResponse);
        } finally {
            log.info("Exiting the method doPost in class GetClassesAction");
        }

    }





}