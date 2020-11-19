$(document).ready(function() {

    $("#addClasses").validate({
        rules: {
            className: "required",
			totalNumberOfStudents: "required"
        },
        messages: {
            className: "Enter the Class Name",
			totalNumberOfStudents: "Enter the Total Number of Students in the Class"
        },
        submitHandler: function(form) {
            var formURL = $("#addClasses").attr("action");
            buttonDisableEnable("#submitFormAddClasses", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
					buttonDisableEnable("#submitFormAddClasses", false);
					if(data.success == true){
						snackBarMessage(data.message);
						$('#addClasses').trigger("reset");
					}else{
						snackBarMessage(data.message);
					}
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormAddClasses", false);
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