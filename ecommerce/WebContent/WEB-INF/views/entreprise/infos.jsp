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
    <title>Bootstrap ekenzy</title>

	<link href="<c:url value="/resources/css/custom2.css" />" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-switch.css" />" rel="stylesheet">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    

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
				<div class="col-lg-3"> 
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
				<div class="col-lg-1">  
					<button type="button" class="btn btn-default annulerpadding" >
					  <!-- <span class="input-group-addon"><span class="glyphicon glyphicon-log-in" ></span></span>-->
					  <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
					</button>  
				</div>
				</div>
			</div>	<!-- end row --> 
        </div><!--/.navbar-collapse -->
        
        
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
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse1"><span class="glyphicon glyphicon-briefcase"></span>  Infos sur l'entreprise</a>
						</h4>
					  </div>
					  <div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">	
						
						
						  <!-- form entreprise -->					
							<f:form modelAttribute="entreprise" action="editinfose" method="POST">
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Statut juridique : </label>
										</span>	
										<span class="col-lg-5" >
										 	<f:select path="statut.idStatut" cssClass="form-control">
											    <f:options items="${statuts}" itemValue="idStatut" itemLabel="titreStatut" ></f:options>
											</f:select>											
										</span> 	
										<span class="col-lg-3" >											  
											<f:hidden path="affStatut" value="${entreprise.affStatut}" />		
											 <input type="checkbox" name="affStatut-checkbox" ${entreprise.affStatut ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Capital social : </label>
										</span>	
										<span class="col-lg-5" >
											<f:input type="text" path="capitalSocial" cssClass="form-control"  value="${entreprise.capitalSocial}" /> 
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affCaptitalSocial" value="${entreprise.affCaptitalSocial}" />		
											 <input type="checkbox" name="affCaptitalSocial-checkbox" ${entreprise.affCaptitalSocial ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">N° de Tel : </label>
										</span>	
										<span class="col-lg-5" >
											<f:input type="text" path="numTelephone" cssClass="form-control"  value="${entreprise.numTelephone}" />
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affNumTelephone" value="${entreprise.affNumTelephone}" />		
											 <input type="checkbox" name="affNumTelephone-checkbox" ${entreprise.affNumTelephone ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Adresse : </label>
										</span>	
										<span class="col-lg-5" >
											<f:textarea type="text" path="adresse" cssClass="form-control"  value="${entreprise.adresse}" />
										</span> 	
										<span class="col-lg-3" >
											 <f:hidden path="affAdresse" value="${entreprise.affAdresse}" />		
											 <input type="checkbox" name="affAdresse-checkbox" ${entreprise.affAdresse ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Activité en detail : </label>
										</span>	
										<span class="col-lg-5" >
											<f:textarea type="text" path="activiteEnDetail" cssClass="form-control"  value="${entreprise.activiteEnDetail}" />
										</span> 	
										<span class="col-lg-3" >
											  <f:hidden path="affActiviteEnDetail" value="${entreprise.affActiviteEnDetail}" />		
											  <input type="checkbox" name="affActiviteEnDetail-checkbox" ${entreprise.affActiviteEnDetail ? "checked" : " false"}>		  
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Année de création : </label>
										</span>	
										<span class="col-lg-5" >
											<f:input type="text" path="anneeCreation" cssClass="form-control"  value="${entreprise.anneeCreation}" />
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affAnneeCreation" value="${entreprise.affAnneeCreation}" />		
											 <input type="checkbox" name="affAnneeCreation-checkbox" ${entreprise.affAnneeCreation ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  
								  <button type="submit" class="btn btn-default">Submit</button>
							</f:form>
						</div>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse2"><span class="glyphicon glyphicon-user"></span>  Infos sur le manager</a>
						</h4>
					  </div>
					  <div id="collapse2" class="panel-collapse collapse">
						<div class="panel-body">
						
						<!-- FORMULAIRE MANAGER -->
						<!-- form Manager -->					
							<f:form modelAttribute="entreprise.manager" action="editmanager" method="POST">
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Nom et Prénom : </label>
										</span>	
										<span class="col-lg-5" >
											<f:input type="text" path="nameManager" cssClass="form-control"  value="${manager.nameManager}" />
										</span> 	
										<span class="col-lg-3" >
											 <f:hidden path="affnameManager" value="${manager.affnameManager}" />		
											 <input type="checkbox" name="affnameManager-checkbox" ${manager.affnameManager ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Sexe : </label>
										</span>	
										<span class="col-lg-5" >
											<f:select path="sexeManager" cssClass="form-control">
											    <f:option value="true"  >Femme</f:option>
											    <f:option value="false" >Homme</f:option>
											</f:select>
										</span> 	
										<span class="col-lg-3" >
											 <f:hidden path="affsexeManager" value="${manager.affsexeManager}" />		
											 <input type="checkbox" name="affsexeManager-checkbox" ${manager.affsexeManager ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Date de naissance : </label>
										</span>	
										<span class="col-lg-5" >
											<fmt:formatDate value="${manager.dateNaissance}" var="myDate" type="date" pattern="dd/MM/yyyy" />
											<f:input path="dateNaissance" cssClass="form-control"  value="${myDate }" />
										</span> 	
										<span class="col-lg-3" >
											 <f:hidden path="affdateNaissance" value="${manager.affdateNaissance}" />		
											 <input type="checkbox" name="affdateNaissance-checkbox" ${manager.affdateNaissance ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Ville de naissance : </label>
										</span>	
										<span class="col-lg-5" >
											<f:select path="villeNassanceManager.idVille" cssClass="form-control">
											    <c:choose>
												      <c:when test="${empty  manager.villeActuelleManager }">
												      <f:option value="NONE"> --Ville--</f:option>
												      </c:when>
												
												      <c:otherwise>
												      <f:option value="${manager.villeNassanceManager.idVille}">${manager.villeNassanceManager.nomVille}</f:option>
												      </c:otherwise>
												</c:choose>
											    <f:options items="${villes}" itemValue="idVille" itemLabel="nomVille" ></f:options>	
											</f:select>
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affvilleNassanceManager" value="${manager.affvilleNassanceManager}" />		
											 <input type="checkbox" name="affvilleNassanceManager-checkbox" ${manager.affvilleNassanceManager ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Ville actuelle : </label>
										</span>	
										<span class="col-lg-5" >
											<f:select path="villeActuelleManager.idVille"  cssClass="form-control">
											    <c:choose>
												      <c:when test="${empty  manager.villeActuelleManager }">
												      <f:option value="NONE"> --Ville--</f:option>
												      </c:when>
												
												      <c:otherwise>
												      <f:option value="${manager.villeActuelleManager.idVille}">${manager.villeActuelleManager.nomVille}</f:option>
												      </c:otherwise>
												</c:choose>
											    <f:options items="${villes}" itemValue="idVille" itemLabel="nomVille" ></f:options>									    
											</f:select>
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affvilleActuelleManager" value="${manager.affvilleActuelleManager}" />		
											 <input type="checkbox" name="affvilleActuelleManager-checkbox" ${manager.affvilleActuelleManager ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  <div class="row setmargin-bottom  ">	
									<div class="form-group">
										<span class="col-lg-4" >
											<label for="exampleInputEmail1">Email : </label>
										</span>	
										<span class="col-lg-5" >
											<f:input  path="emailManager" cssClass="form-control"  value="${manager.emailManager}" />
										</span> 	
										<span class="col-lg-3" >
											<f:hidden path="affemailManager" value="${manager.affemailManager}" />		
											 <input type="checkbox" name="affemailManager-checkbox" ${manager.affemailManager ? "checked" : " false"}>
										</span>
									</div>
								  </div>
								  
								  
								  <button type="submit" class="btn btn-default">Submit</button>
							</f:form>
						
						</div>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse3"><span class="glyphicon glyphicon-camera"></span>  Infos sur les produits/services</a>
						</h4>
					  </div>
					  <div id="collapse3" class="panel-collapse collapse">
						<div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						</div>
					  </div>
					</div>
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse4"><span class="glyphicon glyphicon-adjust"></span>  Historiques</a>
						</h4>
					  </div>
					  <div id="collapse4" class="panel-collapse collapse">
						<div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						</div>
					  </div>
					</div>
				  </div> 
				
				</section>
						 
			 
		</div>
	</div>
	

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap-switch.js" />"></script>
    <script src="<c:url value="/resources/js/custom.js" />"></script>
    
  </body>
</html>