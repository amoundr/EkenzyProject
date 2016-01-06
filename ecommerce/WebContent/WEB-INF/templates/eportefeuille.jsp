<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><tiles:getAsString name="title"></tiles:getAsString></title>
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <link href="<c:url value="/resources/css/custom2.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-switch.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/star-rating.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/autostyle.css" />" rel="stylesheet">
    
    <!-- EKENZY ASSET -->
    <link href="<c:url value="/resources/assets/css/font-awesome.min.css" />" rel="stylesheet" media="screen">
    <link href="<c:url value="/resources/assets/css/style.css" />" rel="stylesheet" media="screen">
    
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer"/>
		
		
</body>
</html>