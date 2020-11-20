package com.dd.schoolAdminPanel.classesSubjectsMappingAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.dd.schoolAdminPanel.classesSubjectsMappingBean.ClassesSubjectsMapping;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.classesSubjectsMappingService.ClassesSubjectsMappingServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListClassesSubjectsMapping")
public class ListClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListClassesSubjectsMapping");
        PrintWriter out = response.getWriter();
        JSONObject listClassesSubjectsMappingResponse = new JSONObject();
        ClassesSubjectsMappingServiceInterface classesSubjectsMappingServiceInterface = new ClassesSubjectsMappingService();
		List<ClassesSubjectsMapping> classesSubjectsMappingList = new ArrayList<ClassesSubjectsMapping>();
        try {

        	classesSubjectsMappingList = classesSubjectsMappingServiceInterface.listClassesSubjectsMapping();
            listClassesSubjectsMappingResponse.accumulate("success", true);
            listClassesSubjectsMappingResponse.accumulate("response", classesSubjectsMappingList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listClassesSubjectsMappingResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListClassesSubjectsMapping " + e.getMessage());
            listClassesSubjectsMappingResponse.accumulate("failure", true);
            listClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doGet in class ListClassesSubjectsMapping ");
        }

    }

}