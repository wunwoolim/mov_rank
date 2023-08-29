<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
</head>
<body>
	<!-- header -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="board">
			<h1 class="title">게시판</h1>
			<table class="board_content">
				<tr>
					<th>제목</th>
					<td>${boardDto.btitle}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${boardDto.bcontent }<br><br><br>
						<c:if test="${boardDto.bsfile != null}">
							<img src="http://localhost:9000/upload/${boardDto.bsfile}">
						</c:if>
					</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${boardDto.bhits}</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${boardDto.id }</td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td>${boardDto.bdate }</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="/board_update/${bvo.bid}">
							<button type="button" class="btn_style">수정하기</button></a>
						<a href="/board_delete/${bvo.bid}">
							<button type="button" class="btn_style">삭제하기</button></a>
						<a href="/board_list/${page}">
							<button type="button" class="btn_style">리스트</button></a>
						<a href="http://localhost:9000/">
						<button type="button" class="btn_style">홈으로</button></a>
					</td>
				</tr>
			</table>
		</section>
	</div>
	
	<!-- footer -->
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>

















