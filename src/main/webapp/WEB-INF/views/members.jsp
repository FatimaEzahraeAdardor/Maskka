<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 23/10/2024
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>members</title>
</head>
<body>

</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>All Members</title>
</head>
<body>
<h1>List of Members</h1>

<table border="1">
  <thead>
  <tr>
    <th>ID</th>
    <th>Membership Number</th>
    <th>Last Name</th>
    <th>First Name</th>
    <th>Identification Document</th>
    <th>Nationality</th>
    <th>Membership Date</th>
    <th>License Expiration Date</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="member" items="${members}">
    <tr>
      <td>${member.id}</td>
      <td>${member.membershipNumber}</td>
      <td>${member.lastName}</td>
      <td>${member.firstName}</td>
      <td>${member.identificationDocument}</td>
      <td>${member.nationality}</td>
      <td>${member.membershipDate}</td>
      <td>${member.licenseExpirationDate}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>