$(document).ready(function() {

    $('#teachersNameCombo').click(function() {
        if (this.value == 0) {
            $.ajax({
                type: "GET",
                url: "ListTeachers",
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function(response) {
                    var jsonObject = response.response;
                    $('#teachersNameCombo').find('option').remove().end().append('<option value=0>Enter Teacher Name</option>').val('Enter Teacher Name');
                    jsonObject.map(function(item) {
                        var dynamicAppendValues = $('<option value="' + item.teacherId + '">' + item.firstName + '</option>');
                        $("#teachersNameCombo").append(dynamicAppendValues);
                    });
                },
                failure: function() {
                    $("#teachersNameCombo").append(" Error when fetching data please contact administrator");
                }
            });

        } else {
            return false;
        }
    });


    $('#classesNameCombo').click(function() {
        if (this.value == 0) {
            $.ajax({
                type: "GET",
                url: "ListUniqueClassesFromSubjectsMapping",
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

    $('#subjectsNameCombo').click(function() {
        var classId = $("#classesNameCombo option:selected").val();
        if (classId > 0) {

            if (this.value == 0) {
                $.ajax({
                    type: "POST",
                    url: "GetSubjectsFromClassesSubjectsMapping",
                    data: {
                        "classId": classId
                    },
                    cache: false,
                    success: function(response) {
                        var jsonObject = response.response;
                        $('#subjectsNameCombo').find('option').remove().end().append('<option value=0>Enter Subject Name</option>').val('Enter Subject Name');
                        jsonObject.map(function(item) {
                            var dynamicAppendValues = $('<option value="' + item.subjectId + '">' + item.subjectName + '</option>');
                            $("#subjectsNameCombo").append(dynamicAppendValues);
                        });
                    },
                    failure: function() {
                        $("#subjectsNameCombo").append(" Error when fetching data please contact administrator");
                    }
                });

            } else {
                return false;
            }

        } else {
			snackBarMessage('Kindly Select Class Name First');
        }

    });


    $("#addTeachersClassesSubjectsMapping").validate({ 
        rules: {
            teachersNameCombo: {
                min: 1
            },
            subjectsNameCombo: {
                min: 1
            },
            classesNameCombo: {
                min: 1
            }
        },
        messages: {
            teachersNameCombo: {
                min: "Select Teacher Name"
            },
            subjectsNameCombo: {
                min: "Select Subject Name"
            },
            classesNameCombo: {
                min: "Select Class Name"
            }
        },
        submitHandler: function(form) {
            var subjectId = $("#subjectsNameCombo option:selected").val()
            var subjectName = $("#subjectsNameCombo option:selected").text();
            var classId = $("#classesNameCombo option:selected").val()
            var className = $("#classesNameCombo option:selected").text();
            var teacherId = $("#teachersNameCombo option:selected").val()
            var teacherName = $("#teachersNameCombo option:selected").text();
            $('input[name="subjectId"]').val(subjectId);
            $('input[name="subjectName"]').val(subjectName);
            $('input[name="classId"]').val(classId);
            $('input[name="className"]').val(className);
            $('input[name="teacherId"]').val(teacherId);
            $('input[name="teacherName"]').val(teacherName);
            var formURL = $("#addTeachersClassesSubjectsMapping").attr("action");
            buttonDisableEnable("#submitFormAddTeachersClassesSubjectsMapping", true);
            $.ajax({
                type: "POST",
                url: formURL,
                data: new FormData(form),
                cache: false,
                contentType: false,
                processData: false,
                success: function(data) {
                    buttonDisableEnable("#submitFormAddTeachersClassesSubjectsMapping", false);
                    if (data.success == true) {
                        snackBarMessage(data.message);
                        $('#addTeachersClassesSubjectsMapping').trigger("reset");
                    } else {
                        snackBarMessage(data.message);
                    }
                },
                error: function(e) {
                    buttonDisableEnable("#submitFormAddTeachersClassesSubjectsMapping", false);
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
    }, 3500);
}