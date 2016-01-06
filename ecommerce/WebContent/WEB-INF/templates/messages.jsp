<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>     
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8" />
<title><tiles:getAsString name="title"></tiles:getAsString></title>  
    
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   
  
    <!-- *******************bootstrap***************** -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/bootstrap/css/messagerie.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/js/flexselect.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/css/star-rating.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/css/custom2.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/bootstrap/css/custom.css" />" rel="stylesheet">
     <link href="<c:url value="/resources/css/autostyle.css" />" rel="stylesheet">
    
    
     
     
    <!-- *******************bootstrap***************** -->
  
    <!-- *******************pour la recherche***************** -->
    
    <!-- EKENZY ASSET -->
    <link href="<c:url value="/resources/assets/css/font-awesome.min.css" />" rel="stylesheet" media="screen">
    <link href="<c:url value="/resources/assets/css/style.css" />" rel="stylesheet" media="screen">
    
  

<title>E-Entreprise</title>
</head>
  <body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer"/>
		

		
</body>
</html>