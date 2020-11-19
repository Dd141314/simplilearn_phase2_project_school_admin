$(document).ready(function() {

    var url_string = window.location.href;
    var url = new URL(url_string);
    var classId = url.searchParams.get("classId");
    $.ajax({
        type: "POST",
        url: "GetClasses",
        data: {
            "classId": classId
        },
        cache: false,
        success: function(data) {
			if(data.response != null){
				$('#editClasses').trigger("reset");
				$('input[name="className"]').val(data.response.className);
				$('input[name="sectionName"]').val(data.response.sectionName);
				$('input[name="totalNumberOfStudents"]').val(data.response.totalNumberOfStudents);
				$('input[name="roomNo"]').val(data.response.roomNo);
				$('input[name="classTeacherName"]').val(data.response.classTeacherName);
				$('input[name="classId"]').val(data.response.classId);
			}else{
				snackBarMessage('Something went wrong, Kindly try again!');
			}
        },
        error: function(e) {
            snackBarMessage('Something went wrong, Kindly Contact Admin!');
        }

    });


    $("#editClasses").validate({
         rules: {
            className: "required",
			totalNumberOfStudents: "required"
        },
        messages: {
            className: "Enter the Class Name",
			totalNumberOfStudents: "Enter the Total Number of Students in the Class"
        },     
		submitHandler: function(form) {
            var formURL = $("#editClasses").attr("action");
            buttonDisableEnable("#submitFormEditClasses", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
                    buttonDisableEnable("#submitFormEditClasses", false);
                    if (data.success == true) {
                        snackBarMessage(data.message);
                        $('#editClasses').trigger("reset");
						pageRedirect('listClasses.jsp');	
                    } else {
                        snackBarMessage(data.message);
                    }
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormEditClasses", false);
                    snackBarMessage('Error While logging to the Panel, Kindly Contact Admin!');
                }

            });
        }
    });

});

function buttonDisableEnable(buttonId, disabled) {
    var button = $(buttonId);
    button.prop("disabled", disabled);
}

function snackBarMessage(data) {
    document.getElementById("snackbar").innerHTML = "";
    document.getElementById("snackbar").innerHTML = data;
    var x = document.getElementById("snackbar")
    x.className = "show";
    setTimeout(function() {
        x.className = x.className.replace("show", "");
    }, 3000);
}

function pageRedirect(url) {
    setTimeout(function() {
        window.location.href = url;
    }, 3000);
}