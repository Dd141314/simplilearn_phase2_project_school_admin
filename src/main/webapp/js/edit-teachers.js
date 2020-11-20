$(document).ready(function() {

    var url_string = window.location.href;
    var url = new URL(url_string);
    var teacherId = url.searchParams.get("teacherId");
    $.ajax({
        type: "POST",
        url: "GetTeachers",
        data: {
            "teachersId": teacherId
        },
        cache: false,
        success: function(data) {
			if(data.response != null){
				$('#editTeachers').trigger("reset");
				$('input[name="firstName"]').val(data.response.firstName);
				$('input[name="lastName"]').val(data.response.lastName);
				$('input[name="contactNumber"]').val(data.response.contactNumber);
				$('input[name="emailAddress"]').val(data.response.emailId);
				$('input[name="qualification"]').val(data.response.qualification);
				$('input[name="age"]').val(data.response.age);
				$('select[name="martialStatus"]').val(data.response.martialStatus);
				$('select[name="gender"]').val(data.response.gender);
				$('textarea[name="address"]').val(data.response.address);
				$('input[name="teacherId"]').val(data.response.teacherId);

			}else{
				snackBarMessage('Something went wrong, Kindly try again!');
			}
        },
        error: function(e) {
            snackBarMessage('Something went wrong, Kindly Contact Admin!');
        }

    });


    $("#editTeachers").validate({
        rules: {
            firstName: "required",
            contactNumber: {
                required: true,
                minlength: 10
            },
            emailAddress: {
                required: true,
                email: true
            },
            qualification: "required",

        },
        messages: {
            firstName: "Enter the First Name",
            contactNumber: {
                required: "Enter the Contact Number",
                minlength: "Please enter a valid Contact number (minimum length of 10 numbers)"
            },
            emailAddress: {
                required: "Enter the Email Address",
                email: "Enter input is not a valid email address"
            },
            qualification: "Enter the Qualification",

        },
        submitHandler: function(form) {
            var formURL = $("#editTeachers").attr("action");
            buttonDisableEnable("#submitFormEditTeachers", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
                    buttonDisableEnable("#submitFormEditTeachers", false);
                    if (data.success == true) {
                        snackBarMessage(data.message);
                        $('#editTeachers').trigger("reset");
						pageRedirect('listTeachers.jsp');	
                    } else {
                        snackBarMessage(data.message);
                    }
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormEditTeachers", false);
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