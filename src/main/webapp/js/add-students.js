$(document).ready(function() {

	$('#classesNameCombo').click(function() {
        if (this.value == 0) {
            $.ajax({
                type: "GET",
                url: "ListClasses",
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function(response) {
                    var jsonObject = response.response;
                    $('#classesNameCombo').find('option').remove().end().append('<option value=0>Enter Class Name</option>').val('Enter Class Name');
                    jsonObject.map(function(item) {
                        var dynamicAppendValues = $('<option value="' + item.classId + '">' + item.className + '</option>');
                        $("#classesNameCombo").append(dynamicAppendValues);
                    });
                },
                failure: function() {
                    $("#classesNameCombo").append(" Error when fetching data please contact administrator");
                }
            });

        } else {
            return false;
        }
    });


    $("#addStudents").validate({
        rules: {
            studentName: "required",
			emergencyContactNumber: {
                required: true,
                minlength: 10
            },
			bloodGroup: "required",
            classesNameCombo: {min:1}
        },
        messages: {
            studentName: "Enter the Student Name",
            emergencyContactNumber: {
                required: "Enter the Contact Number",
                minlength: "Please enter a valid Contact number of parent (minimum length of 10 numbers)"
            },
            bloodGroup: "Enter the Blood Group",
            classesNameCombo: {min:"Select Class Name"}
        },
        submitHandler: function(form) {
			var classId = $("#classesNameCombo option:selected").val()
			var className = $("#classesNameCombo option:selected").text();
			$('input[name="classId"]').val(classId);
			$('input[name="className"]').val(className);
            var formURL = $("#addStudents").attr("action");
            buttonDisableEnable("#submitFormAddStudents", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
					buttonDisableEnable("#submitFormAddStudents", false);
					if(data.success == true){
						snackBarMessage(data.message);
						$('#addStudents').trigger("reset");
					}else{
						snackBarMessage(data.message);
					}
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormAddStudents", false);
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