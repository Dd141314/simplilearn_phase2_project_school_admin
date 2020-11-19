$(document).ready(function() {

    $("#addSubjects").validate({
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
            var formURL = $("#addSubjects").attr("action");
            buttonDisableEnable("#submitFormAddSubjects", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
					buttonDisableEnable("#submitFormAddSubjects", false);
					if(data.success == true){
						snackBarMessage(data.message);
						$('#addSubjects').trigger("reset");
					}else{
						snackBarMessage(data.message);
					}
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormAddSubjects", false);
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