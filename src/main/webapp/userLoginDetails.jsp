<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Registration Details</title>
</head>
<body>
<!-- Using jsp:useBean with setProperty and getProperty -->

<jsp:useBean id="getAdminDetails" class="com.dd.schoolAdminPanel.userManagementBean.UserDetails"></jsp:useBean>


<!-- Setting the properties for this particular bean object -->
<jsp:setProperty property="*" name="getAdminDetails"/>


<!-- Getting values from the bean -->
<jsp:getProperty property="userName" name="getAdminDetails"/>
<br>
<jsp:getProperty property="password" name="getAdminDetails"/>
<br>

</body>
</html>