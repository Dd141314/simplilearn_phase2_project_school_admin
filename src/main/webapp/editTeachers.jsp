<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Edit Teachers</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				<form class="editTeachers" id="editTeachers" action="EditTeachers" role="form" method="POST" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-5" style="display : none;">
							<label for="firstName">First Name</label>
							<input type="text" class="form-control" id="teacherId" name="teacherId" placeholder="Enter Teacher Id"> </div>
						<div class="form-group col-md-5">
							<label for="firstName">First Name</label>
							<input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name"> </div>
						<div class="form-group col-md-5">
							<label for="lastName">Last Name</label>
							<input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter Last Name"> </div>
						<div class="form-group col-md-5">
							<label for="Contact Number">Contact Number</label>
							<input type="text" class="form-control" id="contactNumber" name="contactNumber" placeholder="Enter Contact Number"> </div>
						<div class="form-group col-md-5">
							<label for="emailAddress">Email Address</label>
							<input type="email" class="form-control" id="emailAddress" name="emailAddress" aria-describedby="emailHelp" placeholder="Enter Email Address"> </div>
						<div class="form-group col-md-5">
							<label for="qualification">Qualification</label>
							<input type="text" class="form-control" id="qualification" name= "qualification" placeholder="Enter Qualification"> </div>
						<div class="form-group col-md-5">
							<label for="age">Age</label>
							<input type="number" class="form-control" id="age" name="age" placeholder="Enter Age"> </div>
						<div class="form-group col-md-5">
							<label for="martialStatus">Martial Status</label>
							<select class="form-control" id="martialStatus" name="martialStatus">
								<option selected>Enter Martial Status </option>
								<option value="Single">Single</option>
								<option value="Married">Married</option>
							</select>
						</div>
						<div class="form-group col-md-5">
							<label for="gender">Gender</label>
							<select class="form-control" id="gender" name="gender">
								<option selected>Enter Gender </option>
								<option value="male">Male</option>
								<option value="female">Female</option>
								<option value="others">Others</option>
							</select>
						</div>
						<div class="form-group col-md-10">
							<label for="address">Address</label>
							<textarea class="form-control" id="address" name="address" rows="3"></textarea>
						</div>
					</div>
					<div class="form-group">
						<button type="reset" id="resetFormEditTeachers" name="resetFormEditTeachers" class="btn btn-danger">clear</button>
						<button type="submit" id="submitFormEditTeachers" name="submitFormEditTeachers" class="btn btn-primary">Submit</button>
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
	
	<script src="js/edit-teachers.js"></script>
	<jsp:include page="footer.jsp" />
	