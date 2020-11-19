var myTable;

$(document).ready(function() {
    BindItemTable();
    PopulateItemsTable();
});

function BindItemTable() {
    myTable = $(".classesList").DataTable({
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
        url: "ListClasses",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(response) {
            var jsonObject = response.response;
            var result = jsonObject.map(function(item) {
                var editButton = '<a title="Click to edit" href="editClasses.jsp?classId=' + item.classId + '" class="btn btn-info btn-circle btn-sm"><i class="fas fa-info-circle"></i></a>';
                var spaceInHtml = '&nbsp&nbsp&nbsp&nbsp';
                var deleteButton1 = '<button  title="Click to delete" onclick="deleteClasses(' + item.classId + ',' + "'" + item.className + "'" + ')"  class = "btn btn-danger btn-circle btn-sm" id="deleteClassesBtn" ><i class="fas fa-trash"></i></button> '
                var result = [];
                result.push(item.className);
                result.push(item.totalNumberOfStudents);
                result.push(item.createdDtDisp);
                result.push(editButton + spaceInHtml + deleteButton1);
                return result;
            });
            myTable.rows.add(result);
            myTable.draw();
        },
        failure: function() {
            $(".classesList").append(" Error when fetching data please contact administrator");
        }
    });

}

function deleteClasses(id, Name) {

    if (confirm('Are you sure you want to delete the Class ' + Name + ' ?')) {
		buttonDisableEnable("#deleteClassesBtn", true);
        $.ajax({
            type: "POST",
            url: "DeleteClasses",
            data: { "classId" :id },
            cache: false,
            success: function(data) {
                buttonDisableEnable("#deleteClassesBtn", false);
                if (data.success == true) {
                    snackBarMessage(data.message);
					location.reload(true);
                } else {
                    snackBarMessage(data.message);
                }
            },
            error: function(e) {
                buttonDisableEnable("#deleteClassesBtn", false);
                snackBarMessage('Error While logging to the Panel, Kindly Contact Admin!');
            }

        });

    } else {
		return false;
    }

}