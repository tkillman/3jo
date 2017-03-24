<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	글목록 (전체 글 : ${writeList.pageTotalNum}) <br>
	
	<table>
		<tr><td>번호</td><td>제목</td><td>작성자</td><td>작성일</td></tr>
		
		<c:forEach var="writeCommand" items="${writeList.writeCommands}">
			<tr>
				<td>${writeCommand.num}</td>
				<td>${writeCommand.subject}</td>
				<td>${writeCommand.userName}</td>
				<td>${writeCommand.reg_date}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>