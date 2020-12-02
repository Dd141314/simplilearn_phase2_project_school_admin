package com.dd.schoolAdminPanel.studentsAction;

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
import com.dd.schoolAdminPanel.studentsBean.Students;
import com.dd.schoolAdminPanel.studentsService.StudentsService;
import com.dd.schoolAdminPanel.studentsService.StudentsServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListStudents")
public class ListStudentsAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListStudentsAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListStudents");
        PrintWriter out = response.getWriter();
        JSONObject listStudentsResponse = new JSONObject();
        StudentsServiceInterface studentsServiceInterface = new StudentsService();
		List<Students> studentsList = new ArrayList<Students>();
        try {


        	studentsList = studentsServiceInterface.listStudents();
            listStudentsResponse.accumulate("success", true);
            listStudentsResponse.accumulate("response", studentsList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listStudentsResponse);

//            request.setAttribute("studentsList", studentsList); // Will be available as ${products} in JSP
//            request.getRequestDispatcher("listStudents.jsp").forward(request, response);

        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListStudents " + e.getMessage());
            listStudentsResponse.accumulate("failure", true);
            listStudentsResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listStudentsResponse);
        } finally {
            log.info("Exiting the method doGet in class ListStudents ");
        }

    }

}