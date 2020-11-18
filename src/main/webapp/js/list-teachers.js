$(document).ready(function() {

    $.ajax({
        type: "GET",
        url: "ListTeachers",
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
			$(".teachersList > tbody").html("");
			for(var i= 0 ; i < data.response.length ; i++){
				var newRowContent = "<tr><td>"+data.response[i].firstName+"</td><td>"+data.response[i].contactNumber+"</td></tr>";
				$(".teachersList tbody").append(newRowContent);
			}			
        },
        error: function(e) {
			console.log(e)
        }

    });

});

