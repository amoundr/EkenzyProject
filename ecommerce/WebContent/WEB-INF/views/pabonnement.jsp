<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


				
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