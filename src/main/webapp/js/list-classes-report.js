var myTable;

$(document).ready(function() {
    BindItemTable();
    PopulateItemsTable();
});

function BindItemTable() {
    myTable = $(".classesListReport").DataTable({
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
                var reportButton = '<a href="listClassDetailsReport.jsp?classId=' + item.classId + '" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>';
            	var result = [];
                result.push(item.className);
                result.push(reportButton);
                return result;
            });
            myTable.rows.add(result);
            myTable.draw();
        },
        failure: function() {
            $(".classesListReport").append(" Error when fetching data please contact administrator");
        }
    });

}

