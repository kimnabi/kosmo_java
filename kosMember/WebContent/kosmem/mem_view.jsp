<%@page import="java.util.ArrayList"%>
<%@page import="org.slf4j.LoggerFactory"%>
<%@page import="org.slf4j.Logger"%>
<%@page import="a.b.c.kos.mem.vo.MemVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 
 Logger logger = LoggerFactory.getLogger(this.getClass());
 
 Object obj =request.getAttribute("aList");

 ArrayList<MemVO> aList = (ArrayList<MemVO>)obj;	
	if(aList == null) return; 
	
	String mhp = "";
	String memail = "";
	String mgender = "";
	String mhobby = "";
	String mzone = "";
	String mroad = "";	
	String mroaddetail = "";
	String mjibun = "";

 MemVO mvo = aList.get(0);
 //핸드폰
 mhp =mvo.getMhp();
 String []hpstr =mhp.split("-");
 
String emailstr = mvo.getMemail();
String emailstr01 =emailstr.substring(0,emailstr.indexOf("@"));
String emailstr02 =emailstr.substring(emailstr.indexOf("@")+1); // @ 분리 뒷자리이메일

mhobby = mvo.getMhobby();
String [] hobbystr =mhobby.split(",");
String addr =mvo.getMroad();
String [] AddrStr =addr.split("@");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>

<!-- 디바이스에 최적화된 크기로 출력됨 --------------------------------------->
<meta name="viweport" content="width=device-width, iitail-scale=1">

<!-- jQuery CDN 불러오기  -------------------------------------------->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- 다음 주소록 OPEN API CDN 불러오기  ----------------------------------->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">
		alert("자바스크립트 블럭 진입 : ");
	$(document).ready(function(){
		alert("JQuery 블럭 진입 : ");
	
		$("#mpwCheck").click(function(){
			alert("mpwCheck click")
			console.log("mpwCheck 함수 진입");
			var pw = $("#mpw").val();
			var pw_r = $("#mpw_r").val();
			alert(pw + " : " + pw_r);
			if(pw == pw_r) {
				alert("비밀번호가 같습니다.");
				$("#mpw_r").val('');			
				$("#mhp").focus();						
				return true;
			} else {
				alert("비밀번호가 다릅니다.");
				$("#mpw").val('')
				$("#mpw_r").val('');
				$("#mpw").focus();			
				return false;
			} // enf of if(pw == pw_r)
		}); // end of $("#mpwCheck")

	$('#memail2').change(function(){
		alert("change")
			if($('#memail2').val() == 1){
				//select 태그가 value가 직접입력이 선택시
//	    	$('#memail1').prop('disabled','')
		 //   	$('#memail1').prop('disabled',false);
		    	$('#memail1').prop('readonly',false);
		    	$('#memail1').val('');
		    //	$(this).prop('disabled',false);//select 태크 비활성 해제
		    	$(this).prop('readonly',false);//select 태크 비활성 해제
			}else{
				alert($(this).val());
		    	//$(this).prop('disabled',false); //비활성해제
		    	$(this).prop('readonly',false); //비활성해제
				$('#memail1').val($(this).val());
		    	//$('#memail1').prop('disabled',true);
		    	$('#memail1').prop('readonly',true);
			}
		});
	
	// 우편번호	
	$("#mzone_btn").click(function(){
		alert("mzone_btn")
		console.log("mzone_btn >>> : ");
		new daum.Postcode({
			oncomplete: function(data) {
			    $("#mzone").val(data.zonecode); // 5자리 새우편번호 사용
			    $("#mroad").val(data.roadAddress); // 도로명 주소
			    $("#mjibun").val(data.jibunAddress); // 지번주소			
			}
		}).open();
	});// end of $("#mzone_btn")
	
	
		
		$('#mmsg').keyup(function(){
	        cut_80(this);
	    });

		    $('#memInsertBtn').click(function(){
		    
		        if(getTextLength($('#mmsg').val()) > 80){
		            alert("문자는 80바이트 이하로 적어 주세요.");
		            return false;
		        }else{
		            alert("문자가 80바이트 이하입니다.");
		        }
		     });
		

		// 문자열 길이 구하기(한글 포함)
		function getTextLength(str) {
		    var len = 0;
		    for (var i = 0; i < str.length; i++) {
		        if (escape(str.charAt(i)).length == 6) {
		            len++;
		        }
		        len++;
		    }
		    return len;
		}

		function cut_80(obj){
		    var text = $(obj).val();
		    console.log("text >>> "+ text)
		    var leng = text.length;
		    while(getTextLength(text) > 80){
		        leng--;
		        text = text.substring(0, leng);
		    }
		    $(obj).val(text);
		}
		
		$("#memUpdateBtn").click(function(){
		//	$('#isudType').val('SALL');
	    	$("#memForm").attr({'action':'/kosMember/memberUpdate.do',
	    					         'method':'POST',						
	    					         "enctype":"application/x-www-form-urlencoded"                   }).submit();
	    });
			/*====== memForm 태그 END ==========================================*/		
	});
//	$(":radio[name='mgender']").each(function() {
	//	  var $this = $(this);
		//  if($this.val() == 'N')
		   // $this.attr('checked', true);
	//	});
</script>

<style type="text/css">
	/*====== div START ==========================================*/
	div {
			margin: 50px 0px 0px 100px;
		}	
	/*====== div END ==========================================*/		
</style>

</head>
<body>
<div>
<h3>상세 보기</h3>
<hr>
<form name="memForm" id="memForm">
<table border="1">
<tr>
	<td colspan="2">상세 보기</td>	
</tr>
<tr>
	<td>회원번호</td>
	<td><input type="text" name="mnum"  id="mnum" readonly  value="<%=mvo.getMnum()%>"/></td>
</tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="mname" id="mname" value="<%=mvo.getMname()%>"/></td>
</tr>
<tr>
	<td>아이디</td>
	<td>	
		<input type="text" name="mid" mid="mid" placeholder="아이디체크"  value="<%=mvo.getMid()%>"/>
		<input type="button" name="midCheck" id="midCheck" value="아이디중복확인" />
	</td>
</tr>
<tr>
	<td>패스워드</td>
	<td>
		<input type="text" name="mpw" id="mpw" style="width:100px" value="<%=mvo.getMpw()%>"/><br>
		<input type="text" name="mpw_r" id="mpw_r" placeholder="비밀번호확인" style="width:100px"/>
		<input type="button"  name="mpwCheck" id="mpwCheck" value="비밀번호확인">
	</td>
</tr>
<tr>
	<td>핸드폰</td>
	<td>
		<select name="mhp" id="mhp" style="width:50px;">
        	<option value="010"  <% if ("010".equals(hpstr[0])) out.print("selected"); %>>010</option>
        	<option value="011"  <% if ("011".equals(hpstr[0])) out.print("selected"); %>>011</option>
        	<option value="016"  <% if ("016".equals(hpstr[0])) out.print("selected"); %>>016</option>
        	<option value="017"  <% if ("017".equals(hpstr[0])) out.print("selected"); %>>017</option>		        	
         </select>
         - <input type="text" name="mhp1" id="mhp1" maxlength="4" style="width:50px;" value="<%=hpstr[1]%>"/>
         - <input type="text" name="mhp2" id="mhp2" maxlength="4" style="width:50px;" value="<%=hpstr[2]%>"/>
	</td>
</tr>
<tr>
	<td>이메일</td>
	<td>		
		<input type="text" name="memail"  id="memail" style="width:100px" value="<%=emailstr01%>"/>
		@ <input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력"  value="<%=emailstr02%>"/>
		<select name="memail2" id="memail2">
        	 <option value="1" selected   >직접입력</option>
       		 <option value="naver.com">naver.com</option>	       	   
      		 <option value="gmail.com">gmail.com</option>
      		 <option value="daum.net">daum.net</option>	       	   
         </select>
	</td>
</tr>
<tr>
	<td>성별</td>
	<td> 
		<input type="radio" name="mgender" value="01" <% if ("01".equals(mvo.getMgender())) out.print("checked"); %> />여자
		<input type="radio" name="mgender" value="02"  <% if ("02".equals(mvo.getMgender())) out.print("checked"); %>/> 남자
	</td>
</tr>
<tr>
	<td>취미</td>
	<td> 
		<input type="checkbox" name="mhobby" value="01"  <% for(int i=0;i< hobbystr.length;i++ ) { if ("01".equals(hobbystr[i])) out.print("checked"); } %> />독서		      
		<input type="checkbox" name="mhobby" value="02"  <% for(int i=0;i< hobbystr.length;i++ ) { if ("02".equals(hobbystr[i])) out.print("checked"); } %>/>운동
		<input type="checkbox" name="mhobby" value="03"  <% for(int i=0;i< hobbystr.length;i++ )  { if ("03".equals(hobbystr[i])) out.print("checked"); } %> />음악감상
		<input type="checkbox" name="mhobby" value="04"  <% for(int i=0;i< hobbystr.length;i++ ) { if ("04".equals(hobbystr[i])) out.print("checked"); } %>/>여행
	</td>
</tr>
<tr>
	<td>주소</td>
 	<td>
 		<input type="text" name="mzone" id="mzone" placeholder="우편번호" style="width:70px" maxlength="6" value="<%=mvo.getMzone()%>" >
 		<input type="button" name="mzone_btn" id="mzone_btn" value="우편번호 찾기"><br>	 	
 		<input type="text" name="mroad" id="mroad" placeholder="도로명주소" style="width:250px" value="<%=AddrStr[0]%>"><br>	 	
 		<input type="text" name="mroaddetail" id="mroaddetail" placeholder="도로명주소 상세주소" style="width:250px"  value="<%=AddrStr[1]%>"><br>	 	
 		<input type="text" name="mjibun" id="mjibun" placeholder="지번주소" style="width:250px" value="<%=mvo.getMjibun()%>">
 	</td>
</tr>
<tr>
	<td>소개글</td>
	<td>
		<textarea name="mmsg" id="mmsg" rows="5" cols="50"><%=mvo.getMmsg() %></textarea>
	</td>
</tr>
<tr>
	<td colspan="2"> 		
		<input type="hidden" id="ISUD_TYPE" name="ISUD_TYPE" value="I">		
		<input type="button" value="목록" id="memListBtn" />	
		<input type="button" value="수정" id="memUpdateBtn" />	
		<input type="reset" value="취소" />
	</td>				
</tr>
</table>				 		        		     
</form>	
</div>		
</body>
</html>

