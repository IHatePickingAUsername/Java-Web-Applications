<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="JavaBeans.User"%>
<%  User user = (User) request.getAttribute("user"); %>
<c:import url="/includes/header.html" />
        <h1>Reset Your Password</h1>
        Welcome, ${user.firstName} ${user.lastName} <br>
        Your current password is ${user.password}. Enter your new password:
        <form action="passwordChange" method="post">
            New Password: <input type="text" name="newPassword"><br>
            <input type="submit" value="Change Password">
        </form>
 <c:import url="/includes/footer.jsp" />