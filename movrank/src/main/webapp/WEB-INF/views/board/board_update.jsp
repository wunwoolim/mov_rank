<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/mycgv/css/mycgv.css">
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
</head>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="board">
			<h1 class="title">게시판</h1>
			<form name="updateForm" action="board_update_proc.do" method="post">
				<table border=1>
					<tr>
						<th>제목</th>
						<td>
							<input type="text" name="btitle" value="${boardVo.btitle }" id="btitle">
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea rows="5" cols="30" name="bcontent">${boardVo.bcontent }</textarea>
						</td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>
							<input type="text" name="id" value="${boardVo.id }" disabled>
							<input type="hidden" name="id" value="${boardVo.id }" >
							<input type="hidden" name="bid" value="${boardVo.bid}" >
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="button" class="btn_style" id="btnBoardUpdate">수정완료</button>
							<button type="reset" class="btn_style">다시쓰기</button>
							<a href="board_content.do?bid=${boardVo.bid}">
								<button type="button" class="btn_style">이전페이지</button></a>
							<a href="board_list.do">
								<button type="button" class="btn_style">리스트</button></a>							
						</td>				
					</tr>
				</table>
			</form>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
















