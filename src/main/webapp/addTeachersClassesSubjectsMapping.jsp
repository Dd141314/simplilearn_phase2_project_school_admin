<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Add Teachers Classes Subjects Mapping</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				<form class="addTeachersClassesSubjectsMapping" id="addTeachersClassesSubjectsMapping" action="AddTeachersClassesSubjectsMapping" role="form" method="POST" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-5">
							<label for="teachersNameCombo">Teacher Name</label>
							<select class="form-control" id="teachersNameCombo" name="teachersNameCombo">
								<option value= 0 selected>Enter Teacher Name </option>
							</select>
						</div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="teacherId">Teacher Id</label>
							<input type="text" class="form-control" id="teacherId" name="teacherId" placeholder="Enter Teacher Id"> </div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="teacherName">Teacher Name</label>
							<input type="text" class="form-control" id="teacherName" name="teacherName" placeholder="Enter Teacher Name"> </div>
					</div>	
					<div class="form-row">
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
						
					</div>
					<div class="form-row">
						<div class="form-group col-md-5">
							<label for="subjectsNameCombo">Subject Name</label>
							<select class="form-control" id="subjectsNameCombo" name="subjectsNameCombo">
								<option value= 0 selected>Enter Subject Name </option>
							</select>
						</div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="subjectId">Subject Id</label>
							<input type="text" class="form-control" id="subjectId" name="subjectId" placeholder="Enter Subject Id"> </div>
						<div class="form-group col-md-5" style="display : none;">
							<label for="subjectName">Subject Name</label>
							<input type="text" class="form-control" id="subjectName" name="subjectName" placeholder="Enter Subject Name"> </div>
					</div>
					<div class="form-group">
						<button type="reset" id="resetFormAddTeachersClassesSubjectsMapping" name="resetFormAddTeachersClassesSubjectsMapping" class="btn btn-danger">clear</button>
						<button type="submit" id="submitFormAddTeachersClassesSubjectsMapping" name="submitFormAddTeachersClassesSubjectsMapping" class="btn btn-primary">Submit</button>
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
	
	<script src="js/add-teachers-classes-subjects-mapping.js"></script>
	<jsp:include page="footer.jsp" />
	