$(function() {

	/*
	 * var asFy=new Array(); $('#j_tv_fy a').each(function(){
	 * asFy.push($(this).text()); });
	 */

	/*
	 * $('#xzfy').autocomplete({ autoFocus: true, delay: 0, source: asFy });
	 */

	// jquery treeview
	/*
	 * $('#j_tv_fy').treeview({ collapsed: true, unique: true });
	 */

	function collapse($a) {
		if ($a.prev().hasClass('collapsable-hitarea')) {
			var level = parseInt($a.attr('class').charAt(6));
			$a.nextAll('ul').hide();
			$a.prev()
					.removeClass('collapsable-hitarea lastCollapsable-hitarea')
					.addClass('expandable-hitarea lastExpandable-hitarea');
			$a.parent().removeClass('collapsable collapsable').addClass(
					'expandable lastExpandable');
			$a = $a.children();
		}
	}

	var a$fyC = $('#xzfy-wrap a:only-child');
	var a$fyP = $('#j_tv_fy a:not(only-child)');

	a$fyC.click(function() {
		a$fyP.removeClass('active');
		a$fyC.removeClass('active');
		sFy = $(this).text();
		$(this).addClass('active');
		$("#xzfy").val(sFy);
	});
	a$fyP.click(function() {
		$that = $(this);
		a$fyP.removeClass('active');
		a$fyC.removeClass('active');
		$(this).prev().click();
		sFy = $(this).text();
		$(this).addClass('active');
		$("#xzfy").val(sFy);
		var level = $(this).attr('class').split(' ')[0];
		$('#j_tv_fy a.' + level + ':not(.active)').each(function() {
			collapse($(this));
		});
	});
	$('#btn_fylb').click(function() {
		$('#j_dlg_fy').dialog('open');
	});
	$('.level-1').click();


	$('#xz').on("click", function() {
		$(this).closest('form').submit();
//		window.location="ajxz.aj?fydm="
//		alert("开始");
//		$.ajax({
//			cache : true,
//			type : "POST",
//			url : "ajxz.aj",
//			data : $('#formxz').serialize(),// 你的formid
//			async : true,
//			datatype : "json",
//			error : function(request) {
//				alert("Connection error");
//			},
//			success : function(data) {
//				alert(data);
////				var ajaxobj = eval("(" + data + ")");
////				alert(ajaxobj.name);
////				window.open("http://localhost:8080/Zxjkgl/" + ajaxobj.name);
//
//				/* $("#commonLayout_appcreshi").parent().html(data); */
//			}
//		});
	});

	// 提交，设置cookie
	$('#J_Login').on('click', function(e) {
		e.preventDefault();
		/*
		 * $('#j_tv_fy').find('a').each(function(){
		 * if($.trim($(this).text())==$.trim($('#xzfy').val()))
		 * $('#fybh').val($(this).data('fybh')); }); $.i.cookie('fy',
		 * $('#xzfy').val(), 7); $.i.cookie('fybh', $('#fybh').val(), 7);
		 */
		$(this).closest('form').submit();
	});

	// 获取cookie
	$('#xzfy').val($.i.cookie('fy'));
	$('#fybh').val($.i.cookie('fybh'));

	$('[name="mm"]').keydown(function(e) {
		if (e.keyCode == 13) {
			$('#J_Login').click();
		}
	});

	$("#tbajxx").on("click", function() {
        $("#tbaj").toggle();

		//$("#main").children().hide();
		//$("#divxz").show();
		$("#dqwz").text('同步案件信息');
	});
    $("#gxajxx").on("click",function(){
        $("#main").children().hide();
        $("#divxz").show();
        $("#dqwz").text('同步案件信息-更新案件信息');
    });

    $("#hqajxx").on("click",function(){
        $("#main").children().hide();
        $("#divxz2").show();
        $("#dqwz").text('同步案件信息-下载案件信息');
    });
    /*$("#gjahgx").on("click",function(){
        $("#main").children().hide();
        $("#ahgx").show();
        $("#dqwz").text('根据案号进行案件信息的更新');
    });*/

    $("#gjahgx").on("click",function(){
        $("#main").children().hide();
        $("#diah").show();
        $("#dqwz").text('根据案号进行案件信息的更新');
    });

	$("#cpwsgx").on("click", function() {
		$("#main").children().hide();
		$("#divajts").show();
		$("#dqwz").text('裁判文书更新');
	});
	$("#gjxxwh").on("click", function() {

        $("#gjxx").toggle();
		/*$("#main").children().hide();
		$("#divcxrz").show();*/
		$("#dqwz").text('关键信息维护');
	});
    $("#cpry").on("click",function(){
        $("#main").children().hide();
        $("#divcxrz").show();
        $("#dqwz").text('关键信息维护-裁判人员信息');
    });
    $("#sx").on("click",function(){
        $("#main").children().hide();
        $("#divcxrz2").show();
        $("#dqwz").text('关键信息维护-超审限案件');
    });


	$("#zzjg").on("click", function() {
		$("#main").children().hide();
		$("#divzzjg").show();
		$("#dqwz").text('组织机构推送');
	});

	$("#laxxgl").on("click",function(){
        $("#laxx").toggle();
		/*$("#main").children().hide();
		$("#divzxkajdb").show();*/
		$("#dqwz").text('立案信息管理');
	});
    $("#tdfytdaj").on("click",function(){

        $("#main").children().hide();
         $("#divzxkajdb").show();
        $("#dqwz").text('立案信息管理-更新立案信息');
    });
    $("#dcla").on("click",function(){

       $("#main").children().hide();
         $("#divzxkajdb2").show();
        $("#dqwz").text('立案信息管理-导出立案信息');

    });
   /* $("#download1").on(click,function(){
        alert("1111");
    });

    $("#download2").on(click,function(){

    });*/

});
/*
 * cookie operation $.i.cookie(key), get cookie $.i.cookie(key,null), del cookie
 * $.i.cookie(key,value,[days]), set cookie; del cookie when close browser if
 * don't give days
 */
$.i = {
	cookie : function(key, value, days) {
		if (value === undefined) { // give key only, get cookie
			var c = document.cookie.split('; ');
			for (var i = 0, k; k = c[i] && c[i].split('='); i++) {
				if (decodeURIComponent(k[0]) === key) {
					return decodeURIComponent(k[1]);
				}
			}
		} else { // give key and value
			if (value === null) { // value is null, del cookie
				document.cookie = encodeURIComponent(key)
						+ '=; expires=Thu, 01 Jan 1970 00:00:00 UTC';
			} else { // value isn't null, set cookie
				var e = '';
				if (days !== undefined) {
					var d = new Date();
					d.setTime(d.getTime() + days * 86400000);
					e = '; expires=' + d.toUTCString();
				}
				document.cookie = encodeURIComponent(key) + '='
						+ encodeURIComponent(value) + e;
			}
		}
	}
}