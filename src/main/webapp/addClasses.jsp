<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Add Classes</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				<form class="addClasses" id="addClasses" action="AddClasses" role="form" method="POST" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-5">
							<label for="className">Class Name</label>
							<input type="text" class="form-control" id="className" name="className" placeholder="Enter Class Name"> </div>
						<div class="form-group col-md-5">
							<label for="sectionName">Section Name</label>
							<input type="text" class="form-control" id="sectionName" name="sectionName" placeholder="Enter Section Name"> </div>
						<div class="form-group col-md-5">
							<label for="totalNumberOfStudents">Total No of Students</label>
							<input type="number" class="form-control" id="totalNumberOfStudents" name="totalNumberOfStudents" placeholder="Enter Total Number of Students"> </div>
						<div class="form-group col-md-5">
							<label for="roomNo">Room Name</label>
							<input type="text" class="form-control" id="roomNo" name="roomNo" placeholder="Enter Room Name"> </div>
						<div class="form-group col-md-5">
							<label for="classTeacherName">Class Teacher Name</label>
							<input type="text" class="form-control" id="classTeacherName" name="classTeacherName" placeholder="Enter Class Teacher Name"> </div>
					</div>
					<div class="form-group">
						<button type="reset" id="resetFormAddClasses" name="resetFormAddClasses" class="btn btn-danger">clear</button>
						<button type="submit" id="submitFormAddClasses" name="submitFormAddClasses" class="btn btn-primary">Submit</button>
					</div>
				</form>
				<div id="snackbar"></div>
			</div>
		</div>
	</div>
	<!-- /.container-fluid -->
	</div>
	<!-- End of Main Content -->
	<!-- Footer -->
	<footer class="sticky-footer bg-white">
		<div class="container my-auto">
			<div class="copyright text-center my-auto"> <span>Copyright &copy; Dd School Admin Panel 2020</span> </div>
		</div>
	</footer>
	<!-- End of Footer -->
	</div>
	<!-- End of Content Wrapper -->
	</div>
	<!-- End of Page Wrapper -->
	
	<script src="js/add-classes.js"></script>
	<jsp:include page="footer.jsp" />
	