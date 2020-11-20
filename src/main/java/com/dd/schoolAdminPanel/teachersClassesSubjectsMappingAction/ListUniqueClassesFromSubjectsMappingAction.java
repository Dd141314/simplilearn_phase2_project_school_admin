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

@WebServlet("/ListUniqueClassesFromSubjectsMapping")
public class ListUniqueClassesFromSubjectsMappingAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListUniqueClassesFromSubjectsMappingAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListUniqueClassesFromSubjectsMapping");
        PrintWriter out = response.getWriter();
        JSONObject listUniqueClassesFromSubjectsMappingResponse = new JSONObject();
        TeachersClassesSubjectsMappingServiceInterface teachersClassesSubjectsMappingServiceInterface = new TeachersClassesSubjectsMappingService();
		List<TeachersClassesSubjectsMapping> uniqueClassesFromSubjectsMappingList = new ArrayList<TeachersClassesSubjectsMapping>();
        try {

        	uniqueClassesFromSubjectsMappingList = teachersClassesSubjectsMappingServiceInterface.listUniqueClassesFromSubjectsMapping();
            listUniqueClassesFromSubjectsMappingResponse.accumulate("success", true);
            listUniqueClassesFromSubjectsMappingResponse.accumulate("response", uniqueClassesFromSubjectsMappingList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listUniqueClassesFromSubjectsMappingResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListUniqueClassesFromSubjectsMapping " + e.getMessage());
            listUniqueClassesFromSubjectsMappingResponse.accumulate("failure", true);
            listUniqueClassesFromSubjectsMappingResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listUniqueClassesFromSubjectsMappingResponse);
        } finally {
            log.info("Exiting the method doGet in class ListUniqueClassesFromSubjectsMapping ");
        }

    }

}