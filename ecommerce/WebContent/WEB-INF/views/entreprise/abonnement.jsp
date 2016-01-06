<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Abonnement </title>

	<link href="<c:url value="/resources/css/custom2.css" />" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-switch.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/star-rating.css" />" rel="stylesheet">
    
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script> -->
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
     <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          
        </div>
		<a class="pull-left" href="#"><img src="<c:url value="/resources/images/ekenzy.PNG" />" /></a>
        <div id="navbar" class="navbar-collapse collapse">
			<div class="row martop">
				<div class="col-lg-3">  
				  <div class="input-group">
					  <input type="text" class="form-control" placeholder="Search for...">
					  <span class="input-group-addon"><span class="glyphicon glyphicon-search" ></span></span>
				  </div><!-- /input-group -->
				</div>
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
						<div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-shopping-cart" ></span></span></div>
					</button>	
				</div>  
				<div class="col-lg-4"> 
				  <div class="input-group">
					  <span class="input-group-addon"><span class="glyphicon glyphicon-align-justify" ></span></span>	
					  <input type="text" class="form-control" placeholder="Search for...">
					  <span class="input-group-addon"><span class="glyphicon glyphicon-search" ></span></span>
				  </div><!-- /input-group -->
				</div>  
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <span class="input-group-addon"><span class="glyphicon glyphicon-th" ></span></span>
					</button>  
				</div>  
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <span class="input-group-addon"><span class="glyphicon glyphicon-log-in" ></span></span>
					</button>  
				</div>  
				</div>
			</div>	<!-- end row --> 
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
	</div>
	
	<div class="container mart">
	<div class="row">
		<div class="col-sm-6">
		
		</div>
		<div class="col-sm-6 gauche">
		 
				 <!-- jumbotron-->

				<div class="jumbotron annuler-margin-bottom  jumboimg">
					<div class="coverimg text-center">
					<!-- rating system -->
					<div class="raate rating-stars" >	
					<input id="myrate" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg"  >
					</div>
					</div><!-- End container -->
				</div><!-- End jumbotron-->
				
				<!-- Navbar -->
				<nav class="navbar navbar-default hemessage" id="my-navbar">
					<div class="container">
						<div class="row">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>

						</div><!-- Navbar Header-->
						<div class="collapse navbar-collapse backgris" id="navbar-collapse">
							
							<ul class="nav navbar-nav margr">
								<li>
									<div class="input-group fixa">
									<a href="#" >
									<span class="glyphicon glyphicon-bell" ></span>
									</a>
									</div>
								</li>
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-briefcase"></span>	
										 e-Portefeuille
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-envelope"></span>	
										Message
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-cloud"></span>	
										 Réseaux
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-info-sign"></span>	
										 Infos
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-modal-window"></span>	
										 App
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="#feedback" >	
										<span class="glyphicon glyphicon-cog"></span>	
										</a>
									</div>
								</li> 
							</ul>
						</div>
						</div> <!-- end row -->
					</div><!-- End Container-->
				</nav><!-- End navbar -->
				
				<!-- Section message  reseaux ..... -->
				
				<section class="sectionclass">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
						  <span class="glyphicon glyphicon-plus-sign">
						  </span>  
						  Nouveaux Abonnés</a>
						</h4>
					  </div>
					  <div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">	
						
						<!-- Mes Nouveaux Abonnés  -->
						
						<table class="table table-striped">
						    <thead>
						      <tr>
						        <th>Nouveau Abonné</th>
						        <th>date abonnement</th>
						      </tr>
						    </thead>
						    <tbody>
						     <c:forEach var="nab" items="${nouveauxabonnee}">	
						      <tr>
						        <td>${nab.abonnee.nom }</td>
						        <td>${nab.dateAbonnement }</td>  
						      </tr>
						      </c:forEach>						
						    </tbody>
						  </table>
						  
						</div>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">
						  <span class="glyphicon glyphicon-arrow-right"></span>  
						  Abonnés</a>
						</h4>
					  </div>
					  <div id="collapse2" class="panel-collapse collapse">
						<div class="panel-body">
						
						<!-- Mes Abonnée  -->
						
						<table class="table table-striped">
						    <thead>
						      <tr>
						        <th>Abonné</th>
						        <th>date abonnement</th>
						      </tr>
						    </thead>
						    <tbody>
						     <c:forEach var="abe" items="${abonnee}">	
						      <tr>
						        <td>${abe.abonnee.nom }</td>
						        <td>${abe.dateAbonnement }</td>  
						      </tr>
						      </c:forEach>						
						    </tbody>
						  </table>
						
						
						
						
						
						
						
						
						
						
						</div>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">
						  <span class="glyphicon glyphicon-arrow-right"></span> 
						   Abonnements</a>
						</h4>
					  </div>
					  <div id="collapse3" class="panel-collapse collapse">
						<div class="panel-body">
						
						<!-- mes abonnements -->
						<table class="table table-striped">
						    <thead>
						      <tr>
						        <th>Abonnement</th>
						        <th>date abonnement</th>
						      </tr>
						    </thead>
						    <tbody>
						     <c:forEach var="ab" items="${abonnement}">	
						      <tr>
						        <td>${ab.abonne.nom }</td>
						        <td>${ab.dateAbonnement }</td>  
						      </tr>
						      </c:forEach>						
						    </tbody>
						  </table>
						</div>
					  </div>
					</div>
					
				  </div> 
				
				</section>
						 
			 
		</div>
	</div>
	

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>-->
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="/resources/js/jquery-2.1.3.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap-switch.js" />"></script>
    <script src="<c:url value="/resources/js/custom.js" />"></script>
    <script src="<c:url value="/resources/js/star-rating.js" />"></script>
    <script src="<c:url value="/resources/js/rating.js" />"></script>
    
  </body>
</html>