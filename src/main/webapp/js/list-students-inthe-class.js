var myTableListStudentsInTheClass;
var myTableListTeachersHandlingSubjects;


$(document).ready(function() {
	
	var url_string = window.location.href;
    var url = new URL(url_string);
    var classId = url.searchParams.get("classId");
	BindListTeachersHandlingSubjects();
   	PopulateListTeachersHandlingSubjects(classId);
    BindListStudentsInTheClass();
    PopulateListStudentsInTheClassTable(classId);
});

function BindListStudentsInTheClass() {
    myTableListStudentsInTheClass = $(".studentsInTheClassList").DataTable({
        "deferRender": true,
        "paging": true,
        "lengthChange": false,
        "searching": true,
        "ordering": true,
        "info": true,
        "autoWidth": false,
        "sDom": 'lfrtip',
        "bDestroy": true
    });
}

function PopulateListStudentsInTheClassTable(classId) {

    $.ajax({
        type: "POST",
        url: "GetStudentsInTheClassList",
        data: {
            "classId": classId
        },
        cache: false,
        success: function(response) {
            var jsonObjectListOfStudentsInTheClass = response.response;
            var resultListOfStudentsInTheClass = jsonObjectListOfStudentsInTheClass.map(function(listOfStudentsInTheClass) {
                var resultListOfStudentsInTheClassResponse = [];
                resultListOfStudentsInTheClassResponse.push(listOfStudentsInTheClass.studentName);
                resultListOfStudentsInTheClassResponse.push(listOfStudentsInTheClass.gender);
                resultListOfStudentsInTheClassResponse.push(listOfStudentsInTheClass.emergencyContactNumber);
                resultListOfStudentsInTheClassResponse.push(listOfStudentsInTheClass.bloodGroup);
                return resultListOfStudentsInTheClassResponse;
            });
            myTableListStudentsInTheClass.rows.add(resultListOfStudentsInTheClass);
            myTableListStudentsInTheClass.draw();
        },
        failure: function() {
            $("#studentsInTheClassList").append(" Error when fetching data please contact administrator");
        }
    });


}


function BindListTeachersHandlingSubjects() {
    myTableListTeachersHandlingSubjects = $(".teachersHandlingSubjectsList").DataTable({
        "deferRender": true,
        "paging": true,
        "lengthChange": false,
        "searching": true,
        "ordering": true,
        "info": true,
        "autoWidth": false,
        "sDom": 'lfrtip',
        "bDestroy": true
    });
}

function PopulateListTeachersHandlingSubjects(classId) {

    $.ajax({
        type: "POST",
        url: "GetTeachersHandlingSubjectsList",
        data: {
            "classId": classId
        },
        cache: false,
        success: function(response) {
            var jsonObject = response.response;
            var result = jsonObject.map(function(item) {
                var result = [];
                result.push(item.teacherName);
                result.push(item.subjectName);
                return result;
            });
            myTableListTeachersHandlingSubjects.rows.add(result);
            myTableListTeachersHandlingSubjects.draw();
        },
        failure: function() {
            $("#teachersHandlingSubjectsList").append(" Error when fetching data please contact administrator");
        }
    });


}