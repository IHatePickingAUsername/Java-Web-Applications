<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="JavaBeans.User" %>
<% User user = (User) request.getAttribute("user"); %>
<c:import url="/includes/header.html" />
        <h1>Account Activity</h1>
    <c:choose>
    <c:when test="${user != null}">
        <p>Welcome, <c:out value="${user.firstName}" /> <c:out value="${user.lastName}" /></p>
    </c:when>
    <c:otherwise><p>You are not logged in.</p></c:otherwise>
    </c:choose>
    <c:import url="/includes/footer.jsp" />