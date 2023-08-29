<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.springboot.mycgv.repository.MemberMapper" %>
<%@ page import = "com.springboot.mycgv.dto.MemberDto" %>

<jsp:useBean id="memberDto" class="com.springboot.mycgv.dto.MemberDto"  />
<jsp:setProperty property="*" name="memberDto"/>

<%
	MemberMapper memberMapper = new MemberMapper();
	int result = memberMapper.insert(memberDto);

	if(result == 1){
		//alert 창을 띄우려면 
		out.write("<script>");
		out.write("alert('회원가입 성공!!');");
		out.write("location.href = 'http://localhost:9000/login/login.jsp'");
		out.write("</script>");
		
		//response.sendRedirect("http://localhost:9000/login/login.jsp?jresult=1");
	}
%> 









