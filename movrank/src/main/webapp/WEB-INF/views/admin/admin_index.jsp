<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	String sid = (String)session.getAttribute("sid");
	if(sid == null){
		out.write("<script>");
		out.write("alert('정상적인 접근방식이 아닙니다. 로그인을 진행해주세요.');");
		out.write("location.href='http://localhost:9000/login/login.jsp';");
		out.write("</script>");
	}else{
		
	if(!sid.equals("admin")){
		out.write("<script>");
		out.write("alert('관리자 접근 권한이 필요합니다. 다시 로그인을 진행해주세요.');");
		out.write("location.href='http://localhost:9000/login/login.jsp';");
		out.write("</script>");
	}else{
--%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
</head>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000_jsp_jsp/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="admin">
			<h1 class="title">관리자 메인</h1>
			<div>
				<article><a href="/admin/admin_notice_list">🛕 공지사항 관리</a></article>
				<article>🚗영화 관리</article>
				<article><a href="/admin/admin_member_list">👩회원 관리</a></article>
			</div>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000_jsp_jsp/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>

<%--
		}//admin check
	}//sid null check
--%>
















