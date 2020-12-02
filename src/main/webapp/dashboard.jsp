<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<jsp:include page="sidebar.jsp" />
<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- Page Heading -->
	<div class="d-sm-flex align-items-center justify-content-between mb-4">
		<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
		<a href="/school_admin_panel/documentation/index.html" target="_blank" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i>View Documentation</a>
	</div>

	<!-- Content Row -->
	<div class="row">

		<!-- Pending Requests Card Example -->
		<div class="col-xl-3 col-md-6 mb-4">
			<div class="card border-left-success shadow h-100 py-2">
				<div class="card-body">
					<div class="row no-gutters align-items-center">
						<div class="col mr-2">
							<div
								class="text-xs font-weight-bold text-success text-uppercase mb-1">
								Total No Of Students</div>
							<a href="listStudents.jsp"><div
									class="h5 mb-0 font-weight-bold text-gray-800"
									id="totalNoOfStudents"></div></a>
						</div>
						<div class="col-auto">
							<i class="fas fa fa-child fa-2x text-gray-300"></i>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Pending Requests Card Example -->
		<div class="col-xl-3 col-md-6 mb-4">
			<div class="card border-left-success shadow h-100 py-2">
				<div class="card-body">
					<div class="row no-gutters align-items-center">
						<div class="col mr-2">
							<div
								class="text-xs font-weight-bold text-success text-uppercase mb-1">
								Total No Of Teachers</div>
							<a href="listTeachers.jsp"><div
									class="h5 mb-0 font-weight-bold text-gray-800"
									id="totalNoOfTeachers"></div></a>
						</div>
						<div class="col-auto">
							<i class="fas fa-chalkboard-teacher fa-2x text-gray-300"></i>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Pending Requests Card Example -->
		<div class="col-xl-3 col-md-6 mb-4">
			<div class="card border-left-success shadow h-100 py-2">
				<div class="card-body">
					<div class="row no-gutters align-items-center">
						<div class="col mr-2">
							<div
								class="text-xs font-weight-bold text-success text-uppercase mb-1">
								Total No Of Classes</div>
							<a href="listClasses.jsp"><div
									class="h5 mb-0 font-weight-bold text-gray-800"
									id="totalNoOfClasses"></div></a>
						</div>
						<div class="col-auto">
							<i class="fas fa-graduation-cap fa-2x text-gray-300"></i>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Pending Requests Card Example -->
		<div class="col-xl-3 col-md-6 mb-4">
			<div class="card border-left-success shadow h-100 py-2">
				<div class="card-body">
					<div class="row no-gutters align-items-center">
						<div class="col mr-2">
							<div
								class="text-xs font-weight-bold text-success text-uppercase mb-1">
								Total No Of Subjects</div>
							<a href="listSubjects.jsp"><div
									class="h5 mb-0 font-weight-bold text-gray-800"
									id="totalNoOfSubjects"></div></a>
						</div>
						<div class="col-auto">
							<i class="fas fa-book fa-2x text-gray-300"></i>
						</div>
					</div>
				</div>
			</div>
		</div>


	</div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<!-- Footer -->
<footer class="sticky-footer bg-white">
	<div class="container my-auto">
		<div class="copyright text-center my-auto">
			<span>Copyright &copy; Dd School Admin Panel 2020</span>
		</div>
	</div>
</footer>
<!-- End of Footer -->

</div>
<!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->
<script src="js/dashboard.js"></script>
<jsp:include page="footer.jsp" />
