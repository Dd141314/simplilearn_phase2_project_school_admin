<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">List Class Details Report</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Teachers and Handling Subjects</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered teachersHandlingSubjectsList" id="dataTable teachersHandlingSubjectsList" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
											<th>Teacher Name</th>
                                        	<th>Subject Name</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                           					<th>Teacher Name</th>
                                        	<th>Subject Name</th>
                                        </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                    </div>
                    
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Students in the Class</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered studentsInTheClassList" id="dataTable studentsInTheClassList" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                        	<th>Student Name</th>
                                        	<th>Gender</th>
                                        	<th>Contact Number</th>
                                        	<th>Blood Group</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                        	<th>Student Name</th>
                                        	<th>Gender</th>
                                        	<th>Contact Number</th>
                                        	<th>Blood Group</th>
                                        </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </div>
                    </div>
                    
			</div>
		</div>
		<div id="snackbar"></div>
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
	<script src="js/list-students-inthe-class.js"></script>
	<jsp:include page="footer.jsp" />
	
	