<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
</head>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="board">
			<h1 class="title">관리자 - 공지사항</h1>
			<form name="writeForm" action="admin_notice_write_proc.do"  method="post">
				<table border=1>
					<tr>
						<th>제목</th>
						<td>
							<input type="text" name="ntitle" id="ntitle">
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea rows="5" cols="30" name="ncontent"></textarea>
						</td>
					</tr>					
					<tr>
						<td colspan="2">
							<button type="button" id="btnNoticeWrite">등록완료</button>
							<button type="reset">다시쓰기</button>
							<a href="admin_notice_list.do">
								<button type="button">리스트</button></a>
							<a href="http://localhost:9000/admin_index.do">
								<button type="button">관리자홈</button></a>
						</td>				
					</tr>
				</table>
			</form>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../../footer.jsp"></jsp:include>
</body>
</html>
















