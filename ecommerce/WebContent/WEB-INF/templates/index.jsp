<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>     
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>

<!DOCTYPE html >
<html>
<head>
<title><tiles:getAsString name="title"></tiles:getAsString></title>

<link href="<c:url value="/resources/css/custom2.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">

<!-- autocomplete -->
<link href="<c:url value="/resources/css/autostyle.css" />" rel="stylesheet">


<!-- EKENZY ASSET -->
    <link href="<c:url value="/resources/assets/css/font-awesome.min.css" />" rel="stylesheet" media="screen">
    <link href="<c:url value="/resources/assets/css/style.css" />" rel="stylesheet" media="screen">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Entreprise</title>
</head>
<body>
<tiles:insertAttribute name="header" />

<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer"/>
		
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>		
		
</body>
</html>