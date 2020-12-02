var myTable;

$(document).ready(function() {
    BindItemTable();
    PopulateItemsTable();
});

function BindItemTable() {
    myTable = $(".studentsList").DataTable({
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
        url: "ListStudents",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(response) {
            var jsonObject = response.response;
            var result = jsonObject.map(function(item) {
                var editButton = '<a title="Click to edit" href="editStudents.jsp?studentId=' + item.studentId + '" class="btn btn-info btn-circle btn-sm"><i class="fas fa-info-circle"></i></a>';
                var spaceInHtml = '&nbsp&nbsp&nbsp&nbsp';
                var deleteButton1 = '<button  title="Click to delete" onclick="deleteStudents(' + item.studentId + ',' + "'" + item.studentName + "'" + ')"  class = "btn btn-danger btn-circle btn-sm" id="deleteStudentsBtn" ><i class="fas fa-trash"></i></button> '
                var result = [];
                result.push(item.studentName);
                result.push(item.className);
                result.push(item.emergencyContactNumber);
                result.push(item.bloodGroup);
                result.push(item.createdDtDisp);
                result.push(editButton + spaceInHtml + deleteButton1);
                return result;
            });
            myTable.rows.add(result);
            myTable.draw();
        },
        failure: function() {
            $(".studentsList").append(" Error when fetching data please contact administrator");
        }
    });

}

function deleteStudents(id, Name) {

    if (confirm('Are you sure you want to delete the student ' + Name + ' ?')) {
		buttonDisableEnable("#deleteStudentsBtn", true);
        $.ajax({
            type: "POST",
            url: "DeleteStudents",
            data: { "studentsId" :id },
            cache: false,
            success: function(data) {
                buttonDisableEnable("#deleteStudentsBtn", false);
                if (data.success == true) {
                    snackBarMessage(data.message);
					location.reload(true);
                } else {
                    snackBarMessage(data.message);
                }
            },
            error: function(e) {
                buttonDisableEnable("#deleteStudentsBtn", false);
                snackBarMessage('Error While logging to the Panel, Kindly Contact Admin!');
            }

        });

    } else {
		return false;
    }

}