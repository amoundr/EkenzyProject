<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <div class="container">
    <div class="row inscription">
	  <div class="col-sm-6">
	  
	  <!--  upload image -->
		<f:form method="POST" action="photoprofile" enctype="multipart/form-data">
 
 
		Please select a file to upload : <input type="file" name="file" />
		<input type="submit" value="upload" />
 
		</f:form>
		<br><br>
		
		<img src="photoProfile?idE=30"/>
	  
	  </div>
	  <div class="col-sm-6">
	   <div class="containert">
	   
	   <h2>Connectez Vous :</h2>
	   <form class="navbar-form navbar-right signin-marg" method="POST" action="<c:url value='j_spring_security_check' />" name="loginForm">
            <div class="col-sm-5">
            <div class="form-group">
            	<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
              		<input type="text" placeholder="Email" name="j_username" class="form-control">
              	</div>	
             </div>	
            </div>
            
            <div class="col-sm-5">
            <div class="form-group">
            	<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
             		 <input type="password" placeholder="Password" name="j_password" class="form-control">
             	</div>	 
             </div>	 
            </div>
            	 <div class="col-sm-2">	
            <button type="submit" class="btn btn-success">Sign in</button>
            	 </div>	
          </form>
	
	<h2>Créer votre Entreprise :</h2>
	<f:form modelAttribute="entreprise" action="ajouter" cssClass="form-horizontal">
		<div class="error"> ${errors} </div>
	            <div class="form-group">
				<f:input type="hidden" path="id" cssClass="form-control" id="entreprise.IDEntreprise"/> 
				</div>
			  
			    <div class="form-group">
				    <div class="col-sm-8">
				     <div class="input-group">
    					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
						<f:input path="nom" cssClass="form-control" id="entreprise.NomEntreprise" placeholder="Nomer votre entreprise"/>
					</div>
					</div>
					<div class="col-sm-4">		
					<f:select path="secteur.idSecteur" cssClass="form-control">
						<f:option value="NONE"> --Secteur--</f:option>
					    <f:options items="${secteurs}" itemValue="idSecteur" itemLabel="nomSecteur" ></f:options>
					</f:select>
					</div>
				</div>
			
				<div class="form-group">
				<div class="col-sm-12">  
					<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-info-sign"></span></span>
					<f:input path="description" cssClass="form-control" rows="3"  placeholder="présenter l'activité de cette entreprise en quelque mots"/>
					</div>
				</div>
				</div>
			
			
			
			
			<div class="form-group">
				<div class="col-sm-8">
				<f:select path="ville.idVille" cssClass="form-control" id="ville">
					<f:option value="NONE"> --Ville--</f:option>
				    <f:options items="${villes}" itemValue="idVille" itemLabel="nomVille" ></f:options>
				</f:select>
				</div>
			
				<div class="col-sm-4">
					<f:select path="zone.idZone" id="zone" cssClass="form-control">
						<f:option value="NONE"> --Zone--</f:option>
					    <f:options items="${zones}"  itemValue="idZone" itemLabel="nomZone" ></f:options>
					</f:select>
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-8">
					<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
						<f:input path="email" class="form-control"  placeholder="Enter email" />
					</div>	
				</div>
			</div>
			
			
			<div class="form-group">
				<div class="col-sm-6">
					<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
						<f:input path="password"  type="password" class="form-control" id="inputPassword3" placeholder="Password"/>
					</div>	
				</div>
				<div class="col-sm-6">
					<div class="input-group">
					<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
						<input  type="password" class="form-control" id="inputPassword3" placeholder="Password"/>
					</div>	
				</div>
			</div>
			<!-- password zone -->
			
			<p>En cliquant sur "inscription", Vous acceptez les termes et les conditions.</p>
			
			<div class="form-group">
			  	<div class="col-sm-offset-9 col-sm-3">
					<input type="submit"  value="Inscription" class="btn btn-default" />
				</div>
			</div>
			
			</f:form>
			
			
			
		</div>	
		
	  </div>
	</div>
    
    
    </div> <!-- container after nav -->
    
	