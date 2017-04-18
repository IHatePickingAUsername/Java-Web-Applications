<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="JavaBeans.User"%>
<%@page import="JavaBeans.Account"%>
<%  User user = (User) request.getAttribute("user"); %>
<%  Account checkAccount = (Account) request.getAttribute("checkAccount"); %>
<%  Account savingsAccount = (Account) request.getAttribute("savingsAccount"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
    <h1>Transfer Funds</h1>
    
<c:import url="/includes/footer.jsp" />
