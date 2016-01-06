<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<div class="container mart">
	<div class="row">
		<div class="col-sm-6">
		<!-- Product Container -->
            <div class="col-xs-12 col-sm-12 col-md-6">
                <div class="prod-header">
                    <a href=""><i class="fa fa-share" title="Commercialiser par votre Entreprise"></i></a>
                    <a href=""><i class="fa fa-shopping-cart" title="Ajouter au Panier"></i></a>
                    <a href=""><i class="fa fa-money" title="Acheter Maintenant"></i></a>
                </div>
                <div class="thumbnail">
                    <div class="prod-info">
                        <div class="prod-img"><img src="assets/uploads/printer.jpg"></div>
                        <div class="caption prod-info-holder">
                            <h3>HP Printer 1001</h3>
                            <h4>Electronics</h4>
                        </div>
                        <div class="price">
                            <h3>350 DH</h3>
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
                    <small class="sponsored-link">Par: <a href="#">Hic2h</a></small>
                </div>
            </div>
            <!-- /Product Container -->
		</div>
		<div class="col-sm-6 gauche">
		 
				 <!-- jumbotron-->

				<div class="jumbotron annuler-margin-bottom  jumboimg">
					<div class="coverimg text-center">
					<!-- rating system -->
					<div class="raatee rating-stars" >	
					<input id="myrate" type="number" class="rating" min=0 max=5 step=0.2 data-size="lg" >
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
										<a href="<%=request.getContextPath()%>/" >	
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
							</ul>
						</div>
						</div> <!-- end row -->
					</div><!-- End Container-->
				</nav><!-- End navbar -->