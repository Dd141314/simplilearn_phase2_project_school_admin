package com.dd.schoolAdminPanel.subjectsAction;

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
import com.dd.schoolAdminPanel.subjectsBean.Subjects;
import com.dd.schoolAdminPanel.subjectsService.SubjectsService;
import com.dd.schoolAdminPanel.subjectsService.SubjectsServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListSubjects")
public class ListSubjectsAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListSubjectsAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListSubjects");
        PrintWriter out = response.getWriter();
        JSONObject listSubjectsResponse = new JSONObject();
        SubjectsServiceInterface subjectsServiceInterface = new SubjectsService();
		List<Subjects> subjectsList = new ArrayList<Subjects>();
        try {


        	subjectsList = subjectsServiceInterface.listSubjects();
            listSubjectsResponse.accumulate("success", true);
            listSubjectsResponse.accumulate("response", subjectsList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listSubjectsResponse);

//            request.setAttribute("subjectsList", subjectsList); // Will be available as ${products} in JSP
//            request.getRequestDispatcher("listSubjects.jsp").forward(request, response);

        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListSubjects " + e.getMessage());
            listSubjectsResponse.accumulate("failure", true);
            listSubjectsResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listSubjectsResponse);
        } finally {
            log.info("Exiting the method doGet in class ListSubjects ");
        }

    }

}