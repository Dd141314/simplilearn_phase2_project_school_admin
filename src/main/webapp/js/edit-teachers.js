$(document).ready(function() {

    var url_string = window.location.href;
    var url = new URL(url_string);
    var subjectId = url.searchParams.get("subjectId");
    $.ajax({
        type: "POST",
        url: "GetSubjects",
        data: {
            "subjectsId": subjectId
        },
        cache: false,
        success: function(data) {
			if(data.response != null){
				$('#editSubjects').trigger("reset");
				$('input[name="subjectName"]').val(data.response.subjectName);
				$('textarea[name="subjectDescription"]').val(data.response.subjectDescription);
				$('input[name="subjectId"]').val(data.response.subjectId);

			}else{
				snackBarMessage('Something went wrong, Kindly try again!');
			}
        },
        error: function(e) {
            snackBarMessage('Something went wrong, Kindly Contact Admin!');
        }

    });


    $("#editSubjects").validate({
        rules: {
            subjectName: "required",
			subjectDescription : {
				maxlength: 500
			}

        },
        messages: {
            subjectName: "Enter the Subject Name",
			subjectDescription : {
				maxlength: "Enter the Subject Description of maximum 500 characters"
			}

        },        
		submitHandler: function(form) {
            var formURL = $("#editSubjects").attr("action");
            buttonDisableEnable("#submitFormEditSubjects", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
                    buttonDisableEnable("#submitFormEditSubjects", false);
                    if (data.success == true) {
                        snackBarMessage(data.message);
                        $('#editSubjects').trigger("reset");
						pageRedirect('listSubjects.jsp');	
                    } else {
                        snackBarMessage(data.message);
                    }
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormEditSubjects", false);
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