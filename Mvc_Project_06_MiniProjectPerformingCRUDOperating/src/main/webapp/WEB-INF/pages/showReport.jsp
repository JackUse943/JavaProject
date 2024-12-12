<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 align="center">Report</h1>
<c:choose>
	<c:when test="${!empty reportList}">
		<table align="center" border="1" bgcolor="cyan">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>empEmail</th>
				<th>empSalary</th>
				<th>empDepartment</th>
				<th>edit</th>
				<th>delete</th>
			</tr>
			<c:forEach var="emp" items="${reportList}">
				<tr>
					<td>${emp.empId}</td>
					<td>${emp.empName}</td>
					<td>${emp.empEmail}</td>
					<td>${emp.empSalary}</td>
					<td>${emp.empDepartment}</td>
					<td><a href="edit?no=${emp.empId}"><img
							src="images/edit.png" width="30" height="20"> </a></td>
					<td><a onclick="return confirm('Are you sure to delete?')" href="delete?no=${emp.empId}"> <img src="images/delete.png"
							width="20" height="20">
					</a></td>

				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>data not found</h1>

	</c:otherwise>
</c:choose>
<a href="register"> <img src="images/add.png" width="100"
	height="100" style="border: 1px solid black; border-radius: 10px;" />
</a>
<h1>${message}</h1>
<a href="./"><img src="images/home.png" width="50" height="50">
</a>
