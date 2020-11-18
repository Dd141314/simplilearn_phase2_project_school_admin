package com.dd.schoolAdminPanel.userManagementAction;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dd.schoolAdminPanel.constants.SessionConstants;
import com.dd.schoolAdminPanel.userManagementBean.UserDetails;
import com.dd.schoolAdminPanel.userManagementService.UserManagementService;
import com.dd.schoolAdminPanel.userManagementService.UserManagementServiceInterface;

import net.sf.json.JSONObject;

@WebServlet("/UserAuthentication")
@MultipartConfig
public class UserManagementAction extends HttpServlet {

    private Log log = LogFactory.getLog(UserManagementAction.class);
    private static final long serialVersionUID = 1;
    private HttpSession session;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Entering into the method doPost in class UserManagementAction");
        UserDetails userDetails = new UserDetails();
        PrintWriter out = response.getWriter();
        JSONObject checkUserAuthenticationResponse = new JSONObject();
        UserManagementServiceInterface userManagementServiceInterface = new UserManagementService();
        try {

            String userName = request.getParameter("userName");
            String password = request.getParameter("password");


            if (userName != null && !userName.equals("")) {
                userDetails.setUserName(userName);
            }

            if (password != null && !password.equals("")) {
                userDetails.setPassword(password);
            }

            UserDetails userDetailsResponse = userManagementServiceInterface.userLoginAuthentication(userDetails);
            if (userDetailsResponse != null) {
                this.setSessionValuesForUser(request, response, userDetailsResponse);
                checkUserAuthenticationResponse.accumulate("success", true);
                checkUserAuthenticationResponse.accumulate("validation", true);
                checkUserAuthenticationResponse.accumulate("response", userDetailsResponse);
                response.setContentType("text/json; charset=UTF-8");
                out.print(checkUserAuthenticationResponse);
            } else {
                checkUserAuthenticationResponse.accumulate("success", true);
                checkUserAuthenticationResponse.accumulate("validation", false);
                checkUserAuthenticationResponse.accumulate("response", userDetailsResponse);
                response.setContentType("text/json; charset=UTF-8");
                out.print(checkUserAuthenticationResponse);
            }


        } catch (Exception e) {
            log.error("Error while executing the method doPost in class UserManagementAction " + e.getMessage());
            checkUserAuthenticationResponse.accumulate("failure", true);
            checkUserAuthenticationResponse.accumulate("validation", false);
            checkUserAuthenticationResponse.accumulate("errorMessage", e.getMessage());
            response.setContentType("text/json; charset=UTF-8");
            out.print(checkUserAuthenticationResponse);
        } finally {
            log.info("Exiting the method doPost in class UserManagementAction");
        }

    }

    private void setSessionValuesForUser(HttpServletRequest request, HttpServletResponse response, UserDetails userDetailsResponse) {
        log.info("Entering Method setSessionValuesForUser ");
        try {
            this.session = request.getSession(true);
            this.session.setAttribute(SessionConstants.SESSION_VITAL_USER, userDetailsResponse);
        } catch (Exception e) {
            log.error(" Error while executing the method setSessionValuesForUser " + e.getMessage() + e.getClass());
            throw e;
        } finally {
            log.info("Exiting the method setSessionValuesForUser");
        }

    }




}