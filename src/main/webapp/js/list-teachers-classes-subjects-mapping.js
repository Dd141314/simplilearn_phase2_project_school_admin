var myTable;

$(document).ready(function() {
    BindItemTable();
    PopulateItemsTable();
});

function BindItemTable() {
    myTable = $(".teachersClassesSubjectsMappingList").DataTable({
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

function PopulateItemsTable() {
    $.ajax({
        type: "GET",
        url: "ListTeachersClassesSubjectsMapping",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(response) {
            var jsonObject = response.response;
            var result = jsonObject.map(function(item) {
                var deleteButton1 = '<button  title="Click to delete" onclick="deleteTeachersClassesSubjectsMapping(' + item.teachersClassesSubjectsMappingId + ',' + "'" + item.className + "'" + ',' + "'" + item.subjectName + "'" + ',' + "'" + item.teacherName + "'" + ' )"  class = "btn btn-danger btn-circle btn-sm" id="deleteTeachersClassesSubjectsMappingBtn" ><i class="fas fa-trash"></i></button> '
                var result = [];
                result.push(item.teacherName);
                result.push(item.className);
                result.push(item.subjectName);
                result.push(item.createdDtDisp);
                result.push(deleteButton1);
                return result;
            });
            myTable.rows.add(result);
            myTable.draw();
        },
        failure: function() {
            $(".teachersClassesSubjectsMappingList").append(" Error when fetching data please contact administrator");
        }
    });

}

function deleteTeachersClassesSubjectsMapping(id, className, subjectName,teacherName) {

    if (confirm('Are you sure you want to delete the Mapping ' + teacherName + ' <--> '+className+' <--> '+subjectName+' ?')) {
		buttonDisableEnable("#deleteTeachersClassesSubjectsMappingBtn", true);
        $.ajax({
            type: "POST",
            url: "DeleteTeachersClassesSubjectsMapping",
            data: { "teachersClassesSubjectsMappingId" :id },
            cache: false,
            success: function(data) {
                buttonDisableEnable("#deleteTeachersClassesSubjectsMappingBtn", false);
                if (data.success == true) {
                    snackBarMessage(data.message);
					location.reload(true);
                } else {
                    snackBarMessage(data.message);
                }
            },
            error: function(e) {
                buttonDisableEnable("#deleteTeachersClassesSubjectsMappingBtn", false);
                snackBarMessage('Error While logging to the Panel, Kindly Contact Admin!');
            }

        });

    } else {
		return false;
    }

}