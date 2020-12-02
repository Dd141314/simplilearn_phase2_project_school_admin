<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Add Students</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				<form class="addStudents" id="addStudents" action="AddStudents" role="form" method="POST" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-5">
							<label for="studentName">Student Name</label>
							<input type="text" class="form-control" id="studentName" name="studentName" placeholder="Enter Student Name"> </div>
						<div class="form-group col-md-5">
							<label for="fathersName">Father's Name</label>
							<input type="text" class="form-control" id="fathersName" name="fathersName" placeholder="Enter Fathers Name"> </div>
						<div class="form-group col-md-5">
							<label for="mothersName">Mother's Name</label>
							<input type="text" class="form-control" id="mothersName" name="mothersName" placeholder="Enter Mothers Number"> </div>
						<div class="form-group col-md-5">
							<label for="emergencyContactNumber">Emergency Contact Number</label>
							<input type="text" class="form-control" id="emergencyContactNumber" name="emergencyContactNumber" placeholder="Enter Emergency Contact Number"> </div>
						<div class="form-group col-md-5">
							<label for="bloodGroup">Blood Group</label>
							<input type="text" class="form-control" id="bloodGroup" name="bloodGroup" placeholder="Enter Blood Group"> </div>
						<div class="form-group col-md-5">
							<label for="age">Age</label>
							<input type="number" class="form-control" id="age" name="age" placeholder="Enter Age"> </div>
						<div class="form-group col-md-5">
							<label for="gender">Gender</label>
							<select class="form-control" id="gender" name="gender">
								<option selected>Enter Gender </option>
								<option value="male">Male</option>
								<option value="female">Female</option>
								<option value="others">Others</option>
							</select>
						</div>
						<div class="form-group col-md-5">
							<label for="classesNameCombo">Class Name</label>
							<select class="form-control" id="classesNameCombo" name="classesNameCombo">
								<option value= 0 selected>Enter Class Name </option>
							</select>
						</div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="classId">Class Id</label>
							<input type="text" class="form-control" id="classId" name="classId" placeholder="Enter Class Id"> </div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="className">Class Name</label>
							<input type="text" class="form-control" id="className" name="className" placeholder="Enter Class Name"> </div>
						<div class="form-group col-md-10">
							<label for="address">Address</label>
							<textarea class="form-control" id="address" name="address" rows="3"></textarea>
						</div>
					</div>
					<div class="form-group">
						<button type="reset" id="resetFormAddStudents" name="resetFormAddStudents" class="btn btn-danger">clear</button>
						<button type="submit" id="submitFormAddStudents" name="submitFormAddStudents" class="btn btn-primary">Submit</button>
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
	
	<script src="js/add-students.js"></script>
	<jsp:include page="footer.jsp" />
	