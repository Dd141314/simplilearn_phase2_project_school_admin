<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Edit Subjects</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				<form class="editSubjects" id="editSubjects" action="EditSubjects" role="form" method="POST" enctype="multipart/form-data">
					<div class="form-row">
						<div class="form-group col-md-5" style="display : none;">
							<label for="subjectId">Subject Id</label>
							<input type="text" class="form-control" id="subjectId" name="subjectId" placeholder="Enter Subject Id"> </div>
						<div class="form-group col-md-5">
							<label for="subjectName">Subject Name</label>
							<input type="text" class="form-control" id="subjectName" name="subjectName" placeholder="Enter subject Name"> </div>
						<div class="form-group col-md-10">
							<label for="subjectDescription">Subject Description</label>
							<textarea class="form-control" id="subjectDescription" name="subjectDescription" rows="3"></textarea>
						</div>
					</div>
					<div class="form-group">
						<button type="reset" id="resetFormEditSubjects" name="resetFormEditSubjects" class="btn btn-danger">clear</button>
						<button type="submit" id="submitFormEditSubjects" name="submitFormEditSubjects" class="btn btn-primary">Submit</button>
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
	
	<script src="js/edit-subjects.js"></script>
	<jsp:include page="footer.jsp" />
	