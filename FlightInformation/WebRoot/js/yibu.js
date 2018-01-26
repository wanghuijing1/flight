
$(function(){
	
	$("[name=sel]").toggle(	
			  function(){
				  sel($(this));
			 	  },
			  function(){
				  $("[name=hiden"+$(this).attr("fid")+"]").remove();}
			);
	
});
function sel(obj){
	$.ajax({
		type : "POST",
		url : $("#path").val()+"/yibu.do",
		data : {id : obj.attr("fid")},
		dataType : "json",
		success : function(data) {
			var tr = "";
			if (data != null) {		
				if(data.length==0){
					tr+="<tr style='background-color: orange' name='hiden"+obj.attr("fid")
					+"'><td>无票</td></tr>";
				}
				for ( var i = 0; i < data.length; i++) {
					tr+="<tr style='background-color: orange' name='hiden"+obj.attr("fid")+"'><td>"+data[i].sellCompany+"</td><td>"
					+data[i].ticketPrice+"</td></tr>";
				}
			}
			obj.parent().parent().after(tr);
		},
		error : function(data) {
			alert($("#path").val()+"/yibu");
		}
	});
}