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

글목록 (전체 글 : ${pageTotalNum}) <br>

<table>
<tr><td>번호</td><td>제목</td><td>작성자</td><td>작성일</td><td>조회</td></tr>

<c:forEach var="write" items="writeList">
<tr><td>${write.num}</td></tr><a href="list/writeList.do?num=${write.num}"> <td>${write.subject}</td></a><td>${write.writer}</td><td>${write.reg_date}</td><td>${write.reg_date}</td><td>${write.readCount}</td>
</c:forEach>

</table>

<c:forEach var="pnum" begin=${startPage} end=${endPage}>
<a href="list/writeList.do?pageNum=${pnum}">${pnum}</a>
</c:forEach>




</body>
</html>