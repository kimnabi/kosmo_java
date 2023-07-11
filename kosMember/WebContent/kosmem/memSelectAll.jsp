<%@page import="a.b.c.com.kosmem.common.CodeUtil"%>
<%@page import="a.b.c.kos.mem.vo.MemVO"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.slf4j.Logger"%>
<%@ page import="org.slf4j.LoggerFactory"%>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

    request.setCharacterEncoding("UTF-8");

    Logger logger = LoggerFactory.getLogger(this.getClass());
	logger.info("memSelectAll.jsp 블록");
	
	Object obj=request.getAttribute("aList"); // 주위하자 getParmater구분
	logger.info("request.getAttribute(\"List\") : {}",obj );
	
	ArrayList<MemVO> aList = null;
	//aList = new ArrayList<MemVO>();
	aList = (ArrayList<MemVO>)obj;
	
	String searchFilter =  request.getParameter("searchFilter");	
	logger.info("request.getParameter(\"searchFilter\") >>> : ",searchFilter);
	String keyword =  request.getParameter("keyword");	
	logger.info(" request.getParameter(\"keyword\");	 >>> : ",keyword);
	String fromdate =  request.getParameter("fromdate");	
	logger.info(" request.getParameter(\"fromdate\");	 >>> : ",fromdate);
	String todate =  request.getParameter("todate");	
	logger.info(" request.getParameter(\"todate\");	 >>> : ",todate);
	boolean bool =aList.size()>0 && aList !=null;
	if(bool) {
	//MemVO _mvo = null;
	//_mvo = (MemVO)obj;
			logger.info("ArrayList<MemVO> aList : {}",aList);
			
			
			//logger.info("MemVO: {}",_mvo);
			int nCnt = aList.size();
			logger.info("aList.size() : ", nCnt);
	}else{
		    RequestDispatcher rd = request.getRequestDispatcher("/kosMember/memberList.do");
		    rd.forward(request, response);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<!-- CDN -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- date picker -->
<link rel="stylesheet" href="/kosMember/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.css">
<script src="/kosMember/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.js"></script>
<script src="/kosMember/calendar_datepicker/jquery-ui-1.12.1/datepicker-ko.js"></script>

<script type="text/javascript">
	alert("자바스크립트 블록 진입")
	
	var searchFilter = "<%=searchFilter %>";
	alert("searchFilter : "+searchFilter)
	console.log("searchFilter : "+searchFilter)
	var keyword = "<%= keyword %>";
	alert("keyword : "+keyword)
	console.log("keyword :"+keyword)
	
	if(searchFilter==null || searchFilter=="null" || searchFilter=="" || searchFilter== undefined){
		console.log("if(searchFilter==null searchFilter : "+$("#searchFilter").val())
		$("#searchFilter").val("전체");
	}else{
		console.log("else (searchFilter==null searchFilter : "+$("#searchFilter").val())
		$("#searchFilter").val(searchFilter);
	}
	if(keyword==null || keyword=="null" || keyword==""|| keyword== undefined ){
		$("#keyword").val("");
		console.log("if(keyword==null keyword : "+$("#keyword").val())
	}else{
		console.log("else (keyword==null keyword : "+$("#keyword").val())
		$("#keyword").val(keyword);
	}

	var fromdate = "<%= fromdate %>";
		alert("fromdate : "+$("#fromdate").val())
		console.log("fromdate : "+$("#fromdate").val())
	var todate = "<%= todate %>";
		alert("todate : "+$("#todate").val())
		console.log("todate: "+$("#todate").val())
	
	if(fromdate==null || fromdate=="null" || fromdate==""  || fromdate== undefined){
		console.log("fromdate : "+$("#fromdate").val())
		$("#fromdate").val("");
	}else{
		console.log("fromdate : "+$("#fromdate").val())
		$("#fromdate").val(fromdate);
	}
	if(todate==null || todate=="null" || todate==""  || todate== undefined){
		console.log("todate : "+$("#todate").val())
		$("#todate").val("");
	}else{
		console.log("todate : "+$("#todate").val())
		$("#todate").val(todate);
	}
	
$(document).ready(function(){
	alert("Jquery 블록 진입")
	
	$("#fromdate").datepicker({
		showOn: "button",
        buttonImage: "images/calendar.gif",
	    buttonImageOnly: false
	    ,changeYear:true
        ,yearRange:"-10:+100" /*2009 ~ 2119*/
        ,yearRange:"1920:9999" /*1920 ~ 9999*/
		,buttonText: "Select date"
    });
	$("#todate").datepicker({
		showOn: "button",
        buttonImage: "images/calendar.gif",
	    buttonImageOnly: false
	    ,changeMonth:true
        ,changeYear:true
        ,yearRange:"-10:+100" /*2009 ~ 2119*/
        ,yearRange:"1920:9999" /*1920 ~ 9999*/
		,buttonText: "Select date"
    });
	$("#todate").change(function(){
		alert("$(\"#todate\").change 블록진입")
		 // datapicker태크 빈값 체크
		 if(!$("#fromdate").val()) { alert("시작날짜를 선택하세요");  return false; }
         if(!$("#todate").val()) { alert("끝날짜를 선택하세요");  return false; }
	    // fromdate > todate
		 var firstdate = new Date($("#fromdate").datepicker("getDate"));// date 타입 값 비교하기위해
	     var enddate = new Date($("#todate").datepicker("getDate"));

	    if(enddate<firstdate){
				console.log("($(\"#todate\").val()"+enddate);
	      		alert("끝 날짜가 시작날짜보다 이전일수 없습니다"); 
	      		$("#todate").val('') //초기화
	    }//end if
		});
	$("input[name='mnumCheck']").click(function(chk){
		var chb = $("input[name='mnumCheck']");// input 체크박스 태크
		console.log($(this).prop("checked")) // input 태크에서 선택된 체크박스 객체 
		console.log("chb"+chb.prop("checked"))
		//모든 체크박스중에 check 상태면
		if($(chb).is(':checked')){
		//if(chb.prop("checked") == true){
		//모든 체크박스들은 check 해제
		chb.prop("checked",false)
		}
		//선택된 체크박스 check 속성부여
		$(this).prop("checked",true);
		$("input[name='chkAll']").prop("checked",false);
	});
	
	$("input[name='chkAll']").click(function(){
		var chb = $("input[name='mnumCheck']");// input 체크박스 태크

		console.log("chb"+chb.prop("checked"))
		//모든 체크박스중에 check 상태면
		if($(this).is(':checked')){
		//if(chb.prop("checked") == true){
			//모든 체크박스들은 check 부여
			chb.prop("checked",true)
		}else{
		//모든 체크박스 check 속성 해제
			chb.prop("checked",false)
			
		}
	}); //end
	
	$("#U").click(function(){
		alert("$(\"#U\").click(function() 블록진입");
		  
		var chb = $("input[name='mnumCheck']");// input 체크박스 태크
		
		if($(chb).is(':checked')){
			
			let mnum = $(this).val();
			//if(chb.prop("checked") == true){
        	$("#memSelectAllForm").attr({'action':'/kosMember/memberContent.do?'+mnum,
    					         'method':'GET',						
    					         "enctype":"application/x-www-form-urlencoded"                   }).submit();
        
			}else{
				
			 alert("체크해주세요")
				return false;
			}
		// 빈값 체크
		// if(!$("#keyword").val()) { alert("검색어를 선택하세요");  return false; }
         //if(!$("#fromdate").val()) { alert("시작날짜를 선택하세요");  return false; }
         //if(!$("#todate").val()) { alert("끝날짜를 선택하세요");  return false; }
		
		//	$('#isudType').val('SALL');
	
	});//end $("#U").click(function()
	
	//==========================================================
	$("#search_btn").click(function(){
		alert("$(\"#search_btn\").click 블록진입")
		  
		// 빈값 체크
		 if(!$("#keyword").val()) { alert("검색어를 선택하세요");  return false; }
         if(!$("#fromdate").val()) { alert("시작날짜를 선택하세요");  return false; }
         if(!$("#todate").val()) { alert("끝날짜를 선택하세요");  return false; }
		
		//	$('#isudType').val('SALL');
		 if($("#keyword").val()|| $("#fromdate").val()) {
	    	$("#searchForm").attr({'action':'/kosMember/memberSearch.do',
	    					         'method':'POST',						
	    					         "enctype":"application/x-www-form-urlencoded"                   }).submit();
		 }// end  if($("#keyword")
	    });	
});
</script>
</head>
<body>
<form name="searchForm" id="searchForm">
<table>
<tr>
<td>
<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE" value="">	
<select id="searchFilter" name="searchFilter" style="width:100px;height:21px;">
	<option value="01" selected>전체</option>
	<option value="02">회원번호</option>
	<option value="03">이름</option>
	<option value="04">아이디</option>
</select>
<input type="text" id="keyword" name="keyword" placeholder="검색어 입력">		
</td>
</tr>
<tr>
<td>		
<input type="text" id="fromdate" name="fromdate" placeholder="시작일 " style="width:100px;height:20px;">
~
<input type="text" id="todate" name="todate" placeholder="종료일" style="width:100px;height:20px;">
</td>
<td>
	<input type="button" id="search_btn" name="search_btn" value="검색">
	<input type="reset" value="다시">							
</td>
</tr>
</table>
</form>


<form name="memSelectAllForm" id="memSelectAllForm">
<table border="1">
<thead>

<tr>
	<td class="tt"><input type="checkbox" name="chkAll" id="chkAll"></td>
	<td class="tt" style="width:50px;height:20px ">순번</td>
	<td class="tt" style="width:50px;height:20px ">회원번호</td>
	<td class="tt" style="width:50px;height:20px ">이름</td>
	<td class="tt" style="width:50px;height:20px ">아이디</td>
	<td class="tt" style="width:50px;height:20px ">패스워드</td>
	<td class="tt" style="width:130px;height:20px ">핸드폰</td>
	<td class="tt" style="width:130px;height:20px ">이메일</td>
	<td class="tt" style="width:50px;height:20px ">성별</td>	
	<td class="tt" style="width:50px;height:20px ">취미</td>
	<td class="tt" style="width:50px;height:20px ">우편번호</td>
	<td class="tt" style="width:180px;height:20px ">도로명주소</td>
	<td class="tt" style="width:180px;height:20px ">지번주소</td>
	<td class="tt" style="width:180px;height:20px ">내용</td>	
	<td class="tt" style="width:50px;height:20px ">수정일</td>
</tr>
</thead>
<%	
	String hp = "";
	String email = "";
	String gender = "";
	String hobby = "";
	String addr = "";
	
	for(int i=0; i<aList.size(); i++){		
		MemVO _mvo = aList.get(i);
		//문자열 배열 로 분리하여 한문자열로 표현		
		//문자열 키 value 매핑하여 문자열값으로 치환		
		gender = CodeUtil.gender(_mvo.getMgender());			
		hobby = CodeUtil.hobbys(_mvo.getMhobby());		
		addr = _mvo.getMroad().replace("@", " ");
		
		logger.info("gender >>> : " + gender);
		logger.info("gender >>> : " + gender);
		logger.info("hobby >>> : " + hobby);
		logger.info("addr >>> : " + addr);
%>					
<tbody>
<tr>
	<td class="tt">
		<input type="checkbox" id="mnumCheck" name="mnumCheck" value=<%= _mvo.getMnum() %>>
	</td>		
	<td class="tt" style="width:50px;height:20px "><%= i+1 %></td>
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getMnum() %> </td>
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getMname() %> </td>
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getMid() %> </td>
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getMpw() %> </td>
	<td class="tt" style="width:130px;height:20px "><%= _mvo.getMhp() %> </td>
	<td class="tt" style="width:130px;height:20px "><%= _mvo.getMemail() %> </td>
	<td class="tt" style="width:50px;height:20px "><%= gender %> </td>
	<td class="tt" style="width:50px;height:20px "><%= hobby %> </td>
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getMzone() %> </td>
	<td class="tt" style="width:180px;height:20px "><%= addr %> </td>
	<td class="tt" style="width:180px;height:20px "><%= _mvo.getMjibun() %> </td>
	<td class="tt" style="width:180px;height:20px "><%= _mvo.getMmsg() %> </td>	
	<td class="tt" style="width:50px;height:20px "><%= _mvo.getUpdatedate() %> </td>			
</tr>	
<%
	}//end of if
%>						
<tr>
	<td colspan="20" align="right">
		<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE" value="">			
		<input type="button" value="등록" id="I">
		<input type="button" value="조회" id="SALL">
		<input type="button" value="수정" id="U">
		<input type="button" value="삭제" id="D">									
	</td>
</tr>	
</tbody>			
</table>
</form>		
</body>
</html>