<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<div class="container mart">
	<div class="row">
		<div class="col-sm-6">
		<c:forEach var="produit" items="${produits}">	
						      
						      
		<!-- Product Container -->
            <div class="col-xs-12 col-sm-12 col-md-6">
                <div class="prod-header">
                    <a href=""><i class="fa fa-share" title="Commercialiser par votre Entreprise"></i></a>
                    <a href=""><i class="fa fa-shopping-cart" title="Ajouter au Panier"></i></a>
                    <a href=""><i class="fa fa-money" title="Acheter Maintenant"></i></a>
                </div>
                <div class="thumbnail">
                    <div class="prod-info">
                        <div class="prod-img">
                        <a data-toggle="modal" href="#achatDeProduit${produit.idProduit}" >
                        <img style="max-height: 209px; min-height: 200px; max-width: 245px; min-width: 245px;" src="<%=request.getContextPath()%>/photoProduit?idP=${produit.idProduit}"/>
                        </a>
                        </div>  
                        <div class="caption prod-info-holder">
                            <h3>${produit.designation}</h3>
                            <h4>${produit.categorie.nomCategorie}</h4>
                        </div>
                        <div class="price">
                            <h3>${produit.prix} DH </h3>
                        </div>
                    </div>
                    <div class="prod-footer">
                        <i class="fa fa-eye"> <small>23 234</small></i>
                        <i class="fa fa-heart"> <small>2</small></i>
                        <i class="fa fa-comments"> <small>322</small></i>
                        <i class="fa fa-truck"> <small>565</small></i>
                    </div>
                </div>
                <div class="prod-extra-footer">
                    <small>20/02/2014</small>
                    <small style="float:right;" class="sponsored-link${produit.idProduit}">Par: <a href="<%=request.getContextPath()%>/profile/${produit.entreprise.id}">${produit.entreprise.nom}</a></small>
                </div>
            </div>
            <!-- /Product Container -->
            
            <!-- product's detail Modal -->
        <div class="modal fade" id="achatDeProduit${produit.idProduit}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Achat</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-xs-8">
                            <img class="img-thumbnail"  width="100%" src="<%=request.getContextPath()%>/photoProduit?idP=${produit.idProduit}"/>
                            </div>
                            <div class="col-xs-4">
                                <dl>
                                    <dt>Code</dt>
                                    <dd><span class="text-muted">${produit.idProduit}</span></dd>

                                    <dt>Nom</dt>
                                    <dd><span class="text-muted">${produit.designation}</span></dd>

                                    <dt>Prix</dt>
                                    <dd><span class="text-muted">${produit.prix} DHs</span></dd>
                                </dl>
                            </div> 
                        </div>
                        <div class="row">
                            <div class="col-xs-8">
                                <small>01/03/1000</small>
                                <small class="pull-right">By ${produit.entreprise.nom}</small>
                            </div>
                            <div class="col-xs-4 text-right">
                                <a href=""><i class="fa fa-share" title="Commercialiser par votre Entreprise"></i></a>
                                <a href=""><i class="fa fa-shopping-cart" title="Ajouter au Panier"></i></a>
                                <a href=""><i class="fa fa-money" title="Acheter Maintenant"></i></a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <ul class="nav nav-tabs">
                                    <li><a href="#description${produit.idProduit}" data-toggle="tab">Description</a></li>
                                    <li><a href="#specification${produit.idProduit}" data-toggle="tab">Specification</a></li>
                                    <li><a href="#images${produit.idProduit}" data-toggle="tab">Images</a></li>
                                    <li><a href="#revue${produit.idProduit}" data-toggle="tab">Revue</a></li>
                                </ul>

                                <div class="tab-content">
                                    <div class="tab-pane active" id="description${produit.idProduit}">
                                        <small>${produit.description}</small>
                                    </div>
                                    <div class="tab-pane" id="specification${produit.idProduit}">${produit.specification}</div>
                                    <div class="tab-pane" id="images${produit.idProduit}">images</div>
                                    <div class="tab-pane" id="revue${produit.idProduit}">revue</div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><b>Commercialiser</b></button>
                        <button type="button" class="btn btn-default btn-sm"><b>Ajouter au Panier</b></button>
                        <button type="button" class="btn btn-primary btn-sm"><b>Acheter</b></button>
                    </div>
                </div>
            </div>
        </div>
            
           </c:forEach>	 
		
		

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">changer votre photo de couverture</h4>
      </div>
      <div class="modal-body">
       <!--  upload image -->
		<f:form method="POST" action="${pageContext.request.contextPath}/photo" enctype="multipart/form-data">
 
 
		<div class="form-group">
    	<label for="exampleInputFile">File input</label>   
		<input type="file" name="file" />
    	<p class="help-block">choisir votre photo de couverture.</p>
  		</div>
  		<button type="submit" class="btn btn-default">Upload</button>		
		</f:form>
		
		<br><br>
		
		<img class="enimgpop" src="<%=request.getContextPath()%>/photoCover?idE=30"/>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>




<!-- Modal -->
<div class="modal fade" id="profiletof" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">changer votre photo de couverture</h4>
      </div>
      <div class="modal-body">
       <!--  upload image -->
		<f:form method="POST" action="${pageContext.request.contextPath}/photoprofile" enctype="multipart/form-data">
 
 
		<div class="form-group">
    	<label for="exampleInputFile">File input</label>   
		<input type="file" name="file" />
    	<p class="help-block">choisir votre photo de profile.</p>
  		</div>
  		<button type="submit" class="btn btn-default">Upload</button>		
		</f:form>
		
		<br><br>
		
		<img class="enimgpch" src="<%=request.getContextPath()%>/photoProfile?idE=30"/>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
		
		</div>
		<div class="col-sm-6 gauche">
		 
				 <!-- jumbotron-->

				<div class="jumbotron annuler-margin-bottom  jumboimgk antijumbo">
				<a href="#" data-toggle="modal" data-target="#myModal"><img class="enimg" src="<%=request.getContextPath()%>/photoCover?idE=30"/></a>
				<a href="#" data-toggle="modal" data-target="#profiletof"><img class="enimgp" src="<%=request.getContextPath()%>/photoProfile?idE=30"/></a>
					
					
					<!-- rating system -->
					<div class="raate rating-stars" >	
					<input id="myrate" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg"  disabled="true">
					</div>
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
										<a href="<%=request.getContextPath()%>/entreprise/eportefeuille" >	
										<span class="glyphicon glyphicon-briefcase"></span>	
										 e-Portefeuille
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="<%=request.getContextPath()%>/entreprise/messages" >	
										<span class="glyphicon glyphicon-envelope"></span>	
										Message
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="<%=request.getContextPath()%>/entreprise/abonnement" >	
										<span class="glyphicon glyphicon-cloud"></span>	
										 Réseaux
										</a>
									</div>
								</li> 
								<li>
									<div class="input-group fixa">
										<a href="<%=request.getContextPath()%>/entreprise/infos" >	
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