<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<%
   try {
   if (session.getAttribute("VITAL_USER").toString() == null
   || session.getAttribute("VITAL_USER").toString().equals("")) {
   %>
<script type="text/javascript">
   snackBarMessage('Session Expired! Kindly login again.');
</script>
<jsp:forward page="index.jsp" />
<%
   }
   } catch (Exception e) {
   %>
<jsp:forward page="index.jsp" />
<%
   }
   %>
<body id="page-top">
   <!-- Page Wrapper -->
   <div id="wrapper">
   <!-- Sidebar -->
   <ul
      class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
      id="accordionSidebar">
      <!-- Sidebar - Brand -->
      <a
         class="sidebar-brand d-flex align-items-center justify-content-center"
         href="dashboard.jsp">
         <div class="sidebar-brand-icon ">
            <i class="fas fa-school"></i>
         </div>
         <div class="sidebar-brand-text mx-3">Admin</div>
      </a>
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      <!-- Nav Item - Dashboard -->
      <li class="nav-item active"><a class="nav-link"
         href="dashboard.jsp"> <i class="fas fa-fw fa-tachometer-alt"></i>
         <span>Dashboard</span></a>
      </li>
      <!-- Divider -->
      <hr class="sidebar-divider">
      <!-- Heading -->
      <div class="sidebar-heading">MASTER MODULES</div>
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseSubjectsModule"
            aria-expanded="true" aria-controls="collapseSubjectsModule"> <i
            class="fas fa-book"></i> <span>Subjects</span>
         </a>
         <div id="collapseSubjectsModule" class="collapse"
            aria-labelledby="headingSubjectsModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Subjects Modules:</h6>
               <a class="collapse-item" href="addSubjects.jsp">Add Subjects</a> <a
                  class="collapse-item" href="listSubjects.jsp">List Subjects</a>
            </div>
         </div>
      </li>
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseTeachersModule"
            aria-expanded="true" aria-controls="collapseTeachersModule"> <i
            class="fas fa-chalkboard-teacher"></i> <span>Teachers</span>
         </a>
         <div id="collapseTeachersModule" class="collapse"
            aria-labelledby="headingTeachersModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Teachers Modules:</h6>
               <a class="collapse-item" href="addTeachers.jsp">Add Teachers</a> <a
                  class="collapse-item" href="listTeachers.jsp">List Teachers</a>
            </div>
         </div>
      </li>
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseClassesModule"
            aria-expanded="true" aria-controls="collapseClassesModule"> <i
            class="fas fa-graduation-cap"></i> <span>Classes</span>
         </a>
         <div id="collapseClassesModule" class="collapse"
            aria-labelledby="headingClassesModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Classes Modules:</h6>
               <a class="collapse-item" href="addClasses.jsp">Add Classes</a> <a
                  class="collapse-item" href="listClasses.jsp">List Classes</a>
            </div>
         </div>
      </li>
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseStudentsModule"
            aria-expanded="true" aria-controls="collapseStudentsModule"> <i
            class="fas fa fa-child"></i> <span>Students</span>
         </a>
         <div id="collapseStudentsModule" class="collapse"
            aria-labelledby="headingStudentsModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Students Modules:</h6>
               <a class="collapse-item" href="addStudents.jsp">Add Students</a> <a
                  class="collapse-item" href="listStudents.jsp">List Students</a>
            </div>
         </div>
      </li>
      <!-- Heading -->
      <div class="sidebar-heading">MAPPING MODULES</div>
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseMappingModule"
            aria-expanded="true" aria-controls="collapseMappingModule"> <i
            class="fa fa-tasks"></i> <span>Mapping</span>
         </a>
         <div id="collapseMappingModule" class="collapse"
            aria-labelledby="headingCollapseMappingModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Classes Mapping:</h6>
               <a class="collapse-item" href="addClassesSubjectsMapping.jsp">Classes
               Subjects Mapping</a> <a class="collapse-item"
                  href="listClassesSubjectsMapping.jsp">List Classes Subjects</a>
            </div>
         </div>
         <div id="collapseMappingModule" class="collapse"
            aria-labelledby="headingCollapseMappingModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Teachers Mapping:</h6>
               <a class="collapse-item"
                  href="addTeachersClassesSubjectsMapping.jsp">Teachers Classes
               Mapping</a> <a class="collapse-item"
                  href="listTeachersClassesSubjectsMapping.jsp">List Teachers
               Classes</a>
            </div>
         </div>
      </li>
      <!-- Heading -->
      <div class="sidebar-heading">REPORT MODULES</div>
      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
         <a class="nav-link collapsed" href="#"
            data-toggle="collapse" data-target="#collapseReportsModule"
            aria-expanded="true" aria-controls="collapseReportsModule"> <i
            class="fa fa-file"></i> <span>Reports</span>
         </a>
         <div id="collapseReportsModule" class="collapse"
            aria-labelledby="headingCollapseReportsModule"
            data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
               <h6 class="collapse-header">Classes Reports:</h6>
               <a class="collapse-item" href="listClassesReport.jsp">Class
               Details Reports</a>
            </div>
         </div>
      </li>
      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">
   </ul>
   <!-- End of Sidebar -->
   <!-- Content Wrapper -->
   <div id="content-wrapper" class="d-flex flex-column">
   <!-- Main Content -->
   <div id="content">
   <!-- Topbar -->
   <nav
      class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
      <!-- Sidebar Toggle (Topbar) -->
      <button id="sidebarToggleTop" class="btn btn-link d-md-none mr-3">
      <i class="fa fa-bars"></i>
      </button>
      <!-- Topbar Navbar -->
      <ul class="navbar-nav ml-auto">
         <div class="topbar-divider d-none d-sm-block"></div>
         <!-- Nav Item - User Information -->
         <li class="nav-item dropdown no-arrow"><a
            class="nav-link dropdown-toggle" href="#" id="userDropdown"
            role="button" data-toggle="dropdown" aria-haspopup="true"
            aria-expanded="false"> <span
            class="mr-2 d-none d-lg-inline text-gray-600 small"><%=session.getAttribute("VITAL_USER").toString()%></span>
            <img class="img-profile" src="images/user_profile.svg">
            </a>
         </li>
		<div class="topbar-divider d-none d-sm-block"></div>
         <li class="nav-item dropdown no-arrow">
         	<a href="#signoutBtn"  style="margin-top: 20px;" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"><i class="fas fas fa-sign-out-alt fa-sm text-white-50"></i>Sign Out</a>
         </li>
      </ul>
   </nav>
   <div id="snackbar"></div>
   <!-- End of Topbar -->
   <jsp:include page="footer.jsp" />
   <script src="js/sidebar.js"></script>
   