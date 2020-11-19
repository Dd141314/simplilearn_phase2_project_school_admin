package com.dd.schoolAdminPanel.classesAction;

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
import com.dd.schoolAdminPanel.classesBean.Classes;
import com.dd.schoolAdminPanel.classesService.ClassesService;
import com.dd.schoolAdminPanel.classesService.ClassesServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/ListClasses")
public class ListClassesAction extends HttpServlet {

    private Log log = LogFactory.getLog(ListClassesAction.class);
    private static final long serialVersionUID = 1;
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doGet in class ListClasses");
        PrintWriter out = response.getWriter();
        JSONObject listClassesResponse = new JSONObject();
        ClassesServiceInterface classesServiceInterface = new ClassesService();
		List<Classes> classesList = new ArrayList<Classes>();
        try {

        	classesList = classesServiceInterface.listClasses();
            listClassesResponse.accumulate("success", true);
            listClassesResponse.accumulate("response", classesList);
            response.setContentType("text/json; charset=UTF-8");
            out.print(listClassesResponse);


        } catch (Exception e) {
            log.error("Error while executing the method doGet in class ListClasses " + e.getMessage());
            listClassesResponse.accumulate("failure", true);
            listClassesResponse.accumulate("message", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(listClassesResponse);
        } finally {
            log.info("Exiting the method doGet in class ListClasses ");
        }

    }

}