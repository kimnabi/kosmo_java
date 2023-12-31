<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>

<!-- 디바이스에 최적화된 크기로 출력됨 --------------------------------------->
<meta name="viweport" content="width=device-width, iitail-scale=1">

<!-- jQuery CDN 불러오기  -------------------------------------------->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- 다음 주소록 OPEN API CDN 불러오기  ----------------------------------->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">
	
	$(document).ready(function(){
		alert("ready >>> : ");
	
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
		
		$("#memInsertBtn").click(function(){
		//	$('#isudType').val('SALL');
	    	$("#memForm").attr({'action':'/kosMember/memberInsert.do',
	    					         'method':'POST',						
	    					         "enctype":"application/x-www-form-urlencoded"                   }).submit();
	    });
			/*====== memForm 태그 END ==========================================*/		
	});
	
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
<h3>회원 가입</h3>
<hr>
<form name="memForm" id="memForm">
<table border="1">
<tr>
	<td colspan="2">회원 가입</td>	
</tr>
<tr>
	<td>회원번호</td>
	<td><input type="text" name="mnum"  id="mnum" readonly /></td>
</tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="mname" id="mname" /></td>
</tr>
<tr>
	<td>아이디</td>
	<td>	
		<input type="text" name="mid" mid="mid" placeholder="아이디체크" />
		<input type="button" name="midCheck" id="midCheck" value="아이디중복확인" />
	</td>
</tr>
<tr>
	<td>패스워드</td>
	<td>
		<input type="text" name="mpw" id="mpw" style="width:100px"/><br>
		<input type="text" name="mpw_r" id="mpw_r" placeholder="비밀번호확인" style="width:100px"/>
		<input type="button"  name="mpwCheck" id="mpwCheck" value="비밀번호확인">
	</td>
</tr>
<tr>
	<td>핸드폰</td>
	<td>
		<select name="mhp" id="mhp" style="width:50px;">
        	<option value="010">010</option>
        	<option value="011">011</option>
        	<option value="016">016</option>
        	<option value="017">017</option>		        	
         </select>
         - <input type="text" name="mhp1" id="mhp1" maxlength="4" style="width:50px;"/>
         - <input type="text" name="mhp2" id="mhp2" maxlength="4" style="width:50px;"/>
	</td>
</tr>
<tr>
	<td>이메일</td>
	<td>		
		<input type="text" name="memail"  id="memail" style="width:100px"/>
		@ <input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력" />
		<select name="memail2" id="memail2">
        	 <option value="1" selected>직접입력</option>
       		 <option value="naver.com">naver.com</option>	       	   
      		 <option value="gmail.com">gmail.com</option>
      		 <option value="daum.net">daum.net</option>	       	   
         </select>
	</td>
</tr>
<tr>
	<td>성별</td>
	<td> 
		<input type="radio" name="mgender" value="01" checked="checked" />여자
		<input type="radio" name="mgender" value="02" /> 남자
	</td>
</tr>
<tr>
	<td>취미</td>
	<td> 
		<input type="checkbox" name="mhobby" value="01" />독서		      
		<input type="checkbox" name="mhobby" value="02" />운동
		<input type="checkbox" name="mhobby" value="03" />음악감상
		<input type="checkbox" name="mhobby" value="04" />여행
	</td>
</tr>
<tr>
	<td>주소</td>
 	<td>
 		<input type="text" name="mzone" id="mzone" placeholder="우편번호" style="width:70px" maxlength="6" >
 		<input type="button" name="mzone_btn" id="mzone_btn" value="우편번호 찾기"><br>	 	
 		<input type="text" name="mroad" id="mroad" placeholder="도로명주소" style="width:250px"><br>	 	
 		<input type="text" name="mroaddetail" id="mroaddetail" placeholder="도로명주소 상세주소" style="width:250px"><br>	 	
 		<input type="text" name="mjibun" id="mjibun" placeholder="지번주소" style="width:250px">
 	</td>
</tr>
<tr>
	<td>소개글</td>
	<td>
		<textarea name="mmsg" id="mmsg" rows="5" cols="50"></textarea>
	</td>
</tr>
<tr>
	<td colspan="2"> 		
		<input type="hidden" id="ISUD_TYPE" name="ISUD_TYPE" value="I">		
		<input type="button" value="jsp_보내기" id="memInsertBtn" />	
		<input type="reset" value="취소" />
	</td>				
</tr>
</table>				 		        		     
</form>	
</div>		
</body>
</html>

