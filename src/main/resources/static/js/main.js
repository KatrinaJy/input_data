/**
 * 
 */

$(function() {

	$("#rzcx").on("click", function() {
//		if($("#myTable").dataTable()){
//			$("#myTable").dataTable().fnClearTable();
		$("#myTable").dataTable().fnDestroy();
//		}
		
		$("#myTable").dataTable({
			aLengthMenu : [[ 5, 10,15,25,50,-1 ],[ 5, 10,15,25,50,"All" ] ],
			bRetrieve:true,
			destroy:true,
//			ajax:{},
			fnServerData:function(sSource,aoData,fnCallback){
				$.ajax({
					data : $('#formrz').serialize(),
					type:"POST",
					dataType : "JSON",
//					contentType:"application/x-www-form-urlencoded;charset=utf-8",
					url:sSource,
					success:fnCallback
				});
			},
			sAjaxSource:"cxrz.aj",
			sAjaxDataProp:'data',
			bAutoWidth:false,
			aoColumns : [ {
			    sWidth: "34%",
				data : "id",
				title:"ID"
			}, {
				sWidth:"10%",
				data : "fydm",
				title:"法院代码"
			}, {
				sWidth:"8%",
				data : "ajxh",
				title:"案件序号"
			}, {
				sWidth:"5%",
				data : "type",
				title:"类型"
			},  {
				sWidth:"5%",
				data : "status",
				title:"状态"
			}, {
				sWidth:"12%",
				data : "scrq",
				title:"生成日期"
			}, {
				sWidth:"26%",
				data : "bz",
				title:"备注"
			} ]

		});
		
		
//		$.ajax({
//			cache : true,
//			type : "POST",
//			url : "cxrz.aj",
//			data : $('#formrz').serialize(),// 你的formid
//			async : true,
//			datatype : "json",
//			error : function(request) {
//				alert("Connection error");
//			},
//			success : function(msg) {
//				console.log(msg);
//				var obj = JSON.parse(msg);
//				$("#myTable").dataTable({
//					aLengthMenu : [[ 5, 10,15,25,50,-1 ],[ 5, 10,15,25,50,"All" ] ],
//					bRetrieve:true,
//					destroy:true,
//					ajax:{},
//					fnServerData:function(sSource,aoData,fnCallback){
//						$.ajax({
//							data : $('#formrz').serialize(),
//							type:"POST",
//							dataType : "JSON",
//							url:sSource,
//							success:fnCallback
//						})
//					},
//					sAjaxSource:"cxrz.aj",
//					sAjaxDataProp:'data',
//					aoColumns : [ {
//						data : "id"
//					}, {
//						data : "fydm"
//					}, {
//						data : "ajxh"
//					}, {
//						data : "type"
//					},  {
//						data : "status"
//					}, {
//						data : "scrq"
//					}, {
//						data : "bz"
//					} ]
//
//				});
//			}
//		});
		
	});
	
	$('#spryts').on("click", function() {
		$.ajax({
			cache : true,
			type : "POST",
			url : "spryzzjgts.aj",
			async : true,
			datatype : "json",
			error : function(request) {
				alert("Connection error");
			},
			success : function(data) {
				alert(data);
			}
		});
	});
	
	$('#qrryts').on("click", function() {
		$.ajax({
			cache : true,
			type : "POST",
			url : "qyryzzjgts.aj",
			async : true,
			datatype : "json",
			error : function(request) {
				alert("Connection error");
			},
			success : function(data) {
				alert(data);
			}
		});
	});
	
	
	
});