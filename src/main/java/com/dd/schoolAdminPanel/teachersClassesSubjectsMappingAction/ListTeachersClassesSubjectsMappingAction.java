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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingBean.TeachersClassesSubjectsMapping;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingService;
import com.dd.schoolAdminPanel.teachersClassesSubjectsMappingService.TeachersClassesSubjectsMappingServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListTeachersClassesSubjectsMapping")
public class ListTeachersClassesSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListTeachersClassesSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListTeachersClassesSubjectsMapping");
        PrintWriter out = response.getWriter();
        JSONObject listTeachersClassesSubjectsMappingResponse = new JSONObject();
        TeachersClassesSubjectsMappingServiceInterface teachersClassesSubjectsMappingServiceInterface = new TeachersClassesSubjectsMappingService();
		List<TeachersClassesSubjectsMapping> teachersClassesSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {

        	teachersClassesSubjectsMappingList = teachersClassesSubjectsMappingServiceInterface.listTeachersClassesSubjectsMapping();
            listTeachersClassesSubjectsMappingResponse.accumulate("success", true);
            listTeachersClassesSubjectsMappingResponse.accumulate("response", teachersClassesSubjectsMappingList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listTeachersClassesSubjectsMappingResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListTeachersClassesSubjectsMapping " + e.getMessage());
            listTeachersClassesSubjectsMappingResponse.accumulate("failure", true);
            listTeachersClassesSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listTeachersClassesSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doGet in class ListTeachersClassesSubjectsMapping ");
        }

    }

}