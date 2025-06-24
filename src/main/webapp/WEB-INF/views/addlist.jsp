<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="http://localhost:8888/guestbook4/add" meethod="get">
			<table border="1" width="540px">
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" value="">
					</td>
	
					<td>비밀번호</td>
	                <td>
	                	<input type="password" name="password" value="">
	                </td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea cols="72" rows="5" name="content" value=""></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<button type="submit">등록</button>
					</td>
				</tr>
			</table>
		</form>
		<br>
	
		<c:forEach items="${requestScope.gList}" var="guestbookVO">
			<table border="1" width="540px">
				<tr>
					<td>${guestbookVO.no}</td>
					<td>${guestbookVO.name}</td>
					<td>${guestbookVO.regDate}</td>
					<td>
						<a href="http://localhost:8888/guestbook4/remove?no=23&password=13">삭제</a>
					</td>
				</tr>
				<tr>
					<td colspan="4">${guestbookVO.content}</td>
				</tr>
			</table>
			<br>
		</c:forEach>

	</body>
</html>