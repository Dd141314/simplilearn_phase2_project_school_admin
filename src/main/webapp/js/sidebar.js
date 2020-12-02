$(document).ready(function() {

	$(document).on('click',function(){
		$('.collapse').collapse('hide');
	});
	
	$('#userDropdown').on('click', function(){
		
		$('.nav-item dropdown no-arrow').find('li.parent > li').addClass('show');
		$("#userDropdown").attr("aria-expanded","true");
   		$('.dropdown-menu dropdown-menu-right shadow animated--grow-in').toggleClass('show');
	});
	
	$('a[href="#signoutBtn"]').click(function(){
		console.log("Im in Signout");		
	}); 




});

