<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>


<form:form commandName="writeCommand"><br>

<table>
<tr><td><a href="">글목록</a></td></tr>
<tr><td>이름</td><td><form:input path="userName"/></td>
<tr><td>제목</td><td><form:input path="subject"/></td>
<tr><td>이메일</td><td><form:input path="email"/></td>
<tr><td>내용</td><td><form:input path="content"/></td>
<tr><td>비밀번호</td><td><form:input path="password"/></td>
<tr><td><input type="submit"></td></tr>


</table>
</form:form>
</body>
</html>