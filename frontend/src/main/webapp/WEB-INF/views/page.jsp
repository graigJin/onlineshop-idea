<%--
  Created by IntelliJ IDEA.
  User: zetto
  Date: 2018-12-21
  Time: 07:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shop - ${title}</title>

    <script>
        window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Theme CSS -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

    <div class="wrapper">

        <!-- Navigation -->
        <%@ include file="./shared/navbar.jsp" %>

        <!-- Page Content -->

        <div class="content">

            <c:if test="${userClickedHome == true}">
                <%@ include file="home.jsp" %>
            </c:if>

            <c:if test="${userClickedAbout == true}">
                <%@ include file="about.jsp" %>
            </c:if>

            <c:if test="${userClickedContact == true}">
                <%@ include file="contact.jsp" %>
            </c:if>

        </div>

        <!-- Footer -->
        <%@ include file="./shared/footer.jsp" %>

        <!-- Bootstrap core JavaScript -->
        <script src="${js}/jquery.js"></script>
        <script src="${js}/bootstrap.bundle.min.js"></script>

        <!-- Self coded Javascript -->
        <script src="${js}/myapp.js"></script>

    </div>

</body>

</html>

