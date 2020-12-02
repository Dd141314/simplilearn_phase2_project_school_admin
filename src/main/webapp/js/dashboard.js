$(document).ready(function() {

	$.ajax({
		type: "GET",
		url: "ListStudents",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(response) {
			var jsonObject = response.response;
			$('#totalNoOfStudents').append("");
			$('#totalNoOfStudents').append(jsonObject.length);
		},
		failure: function() {
			$("#totalNoOfStudents").append("");
		}
	});

	$.ajax({
		type: "GET",
		url: "ListClasses",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(response) {
			var jsonObject = response.response;
			$('#totalNoOfClasses').append("");
			$('#totalNoOfClasses').append(jsonObject.length);
		},
		failure: function() {
			$("#totalNoOfClasses").append("");
		}
	});

	$.ajax({
		type: "GET",
		url: "ListTeachers",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(response) {
			var jsonObject = response.response;
			$('#totalNoOfTeachers').append("");
			$('#totalNoOfTeachers').append(jsonObject.length);
		},
		failure: function() {
			$("#totalNoOfTeachers").append("");
		}
	});

	$.ajax({
		type: "GET",
		url: "ListSubjects",
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(response) {
			var jsonObject = response.response;
			$('#totalNoOfSubjects').append("");
			$('#totalNoOfSubjects').append(jsonObject.length);
		},
		failure: function() {
			$("#totalNoOfSubjects").append("");
		}
	});





});

