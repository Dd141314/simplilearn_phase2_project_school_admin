$(document).ready(function() {

    $("#userLogin").validate({
        rules: {
            userName: "required",
            password: "required"
        },
        messages: {
            userName: "Enter the UserName",
            password: "Enter the Password",
        },
        submitHandler: function(form) {
            var formURL = $("#userLogin").attr("action");
            buttonDisableEnable("#loginButton", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
					buttonDisableEnable("#loginButton", false);
					if(data.response != null){
						snackBarMessage('Logged In Successfully');
						pageRedirect('dashboard.jsp');	
					}else{
						snackBarMessage('Kindly Check the UserName and Password!');
					}
                },
                error: function(e) {
                    buttonDisableEnable("#loginButton", false);
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