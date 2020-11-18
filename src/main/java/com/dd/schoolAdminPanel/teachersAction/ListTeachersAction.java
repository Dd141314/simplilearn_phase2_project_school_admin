package com.dd.schoolAdminPanel.teachersAction;

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
import com.dd.schoolAdminPanel.teachersBean.Teachers;
import com.dd.schoolAdminPanel.teachersService.TeachersService;
import com.dd.schoolAdminPanel.teachersService.TeachersServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListTeachers")
public class ListTeachersAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListTeachersAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListTeachers");
        PrintWriter out = response.getWriter();
        JSONObject listTeachersResponse = new JSONObject();
        TeachersServiceInterface teachersServiceInterface = new TeachersService();
		List<Teachers> teachersList = new ArrayList<Teachers>();
        try {


        	teachersList = teachersServiceInterface.listTeachers();
            request.setAttribute("teachersList", teachersList); // Will be available as ${products} in JSP
            request.getRequestDispatcher("listTeachers.jsp").forward(request, response);

        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListTeachers " + e.getMessage());
            listTeachersResponse.accumulate("failure", true);
            listTeachersResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listTeachersResponse);
        } finally {
            log.info("Exiting the method doGet in class ListTeachers ");
        }

    }

}