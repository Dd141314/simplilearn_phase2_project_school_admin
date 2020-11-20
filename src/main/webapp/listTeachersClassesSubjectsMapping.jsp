<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<jsp:include page="header.jsp" />
	<jsp:include page="sidebar.jsp" />
	<div class="container-fluid">
		<!-- Page Heading -->
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">List Teachers Classes Subjects Mapping</h1> </div>
		<!-- Content Row -->
		<div class="row">
			<div class="col-lg-12">
				
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Teachers Classes Subjects Mapping</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered teachersClassesSubjectsMappingList" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
											<th>Teacher Name</th>
                                        	<th>Class Name</th>
                                        	<th>Subject Name</th>
                                        	<th>Created Dt</th>
											<th>Action</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                           					<th>Teacher Name</th>
                                        	<th>Class Name</th>
                                        	<th>Subject Name</th>
                                        	<th>Created Dt</th>
											<th>Action</th>
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
	<script src="js/list-teachers-classes-subjects-mapping.js"></script>
	<jsp:include page="footer.jsp" />
	
	