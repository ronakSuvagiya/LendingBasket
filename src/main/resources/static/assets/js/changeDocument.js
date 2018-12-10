$(document).ready(function(){
//	$("#ddlDocument")
//	$("#optLoanCat").attr("type");
});

 
function ddlProductChange(e)
{
	if(e.value <= 2)
	{
		
		$("#divLoanName").show();
		$("#ddlLoanCategory").prop('required',true);
	
	}
	else
	{
		$("#divLoanName").hide();
		$("#ddlLoanCategory").prop('required',false);
	}
}


/*
var ddlProduct = document.getElementsByName("proId");
var ddlLoanCategory = document.getElementsByName("ddlLoanCategory");
var ddlDoc = document.getElementsByName("docId");
*/