var myTable;

$(document).ready(function() {
    BindItemTable();
    PopulateItemsTable();
});

function BindItemTable() {
    myTable = $(".classesSubjectsMappingList").DataTable({
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
        url: "ListClassesSubjectsMapping",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(response) {
            var jsonObject = response.response;
            var result = jsonObject.map(function(item) {
                var deleteButton1 = '<button  title="Click to delete" onclick="deleteClassesSubjectsMapping(' + item.classesSubjectsMappingId + ',' + "'" + item.className + "'" + ',' + "'" + item.subjectName + "'" + ' )"  class = "btn btn-danger btn-circle btn-sm" id="deleteClassesSubjectsMappingBtn" ><i class="fas fa-trash"></i></button> '
                var result = [];
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
            $(".classesSubjectsMappingList").append(" Error when fetching data please contact administrator");
        }
    });

}

function deleteClassesSubjectsMapping(id, className, subjectName) {

    if (confirm('Are you sure you want to delete the Mapping ' + className + ' <--> '+subjectName+' ?')) {
		buttonDisableEnable("#deleteClassesBtn", true);
        $.ajax({
            type: "POST",
            url: "DeleteClassesSubjectsMapping",
            data: { "classesSubjectsMappingId" :id },
            cache: false,
            success: function(data) {
                buttonDisableEnable("#deleteClassesSubjectsMappingBtn", false);
                if (data.success == true) {
                    snackBarMessage(data.message);
					location.reload(true);
                } else {
                    snackBarMessage(data.message);
                }
            },
            error: function(e) {
                buttonDisableEnable("#deleteClassesSubjectsMappingBtn", false);
                snackBarMessage('Error While logging to the Panel, Kindly Contact Admin!');
            }

        });

    } else {
		return false;
    }

}