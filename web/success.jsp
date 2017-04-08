<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>Account Creation Successful</h1>
        <p>Your account was successfully created.</p><br>
        <h2>Here is the information you entered.</h2>
        <label>First Name: </label><span>${user.firstName}</span><br>
        <label>Last Name: </label><span>${user.lastName}</span><br>
        <label>Phone: </label><span>${user.phone}</span><br>
        <label>Address: </label><span>${user.address}</span><br>
        <label>City: </label><span>${user.city}</span><br>
        <label>State: </label><span>${user.state}</span><br>
        <label>Zip: </label><span>${user.zip}</span><br>
        <label>Email: </label><span>${user.email}</span><br>
        <label>Username: </label><span>${user.username}</span><br>
        <label>Password: </label><span>${user.password}</span><br>
        <a href="password_reset.jsp">Reset Your Password Here</a>
<c:import url="/includes/footer.jsp" />
