$(document).ready(function() {

    $("#addTeachers").validate({
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
            var formURL = $("#addTeachers").attr("action");
            buttonDisableEnable("#submitFormAddTeachers", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
					buttonDisableEnable("#submitFormAddTeachers", false);
					if(data.success == true){
						snackBarMessage(data.message);
						$('#addTeachers').trigger("reset");
					}else{
						snackBarMessage(data.message);
					}
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormAddTeachers", false);
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

function pageRedirect(url){
	setTimeout(function () {
		window.location.href = url;
	}, 3500);
}