<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


				
				<!-- Section message  reseaux ..... -->
				
				<section class="sectionclass">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
					  <div class="panel-heading">
						<h4 class="panel-title">
						  <a data-toggle="collapse" data-parent="#accordion" href="#collapse1"><span class="glyphicon glyphicon-briefcase"></span>  Infos sur l'entreprise</a>
						</h4>
					  </div>
					  <div id="collapse1" class="panel-collapse collapse">
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
	