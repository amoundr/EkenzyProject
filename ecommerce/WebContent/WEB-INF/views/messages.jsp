<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


				
				<!-- Section message  reseaux ..... -->
				<input type="hidden" name="entreDest" id="HidER" value="test" >
				
				<section class="sectionclass">
				
				<div class="container">
								
						      <button type="button" class="btn btn-primary margdroite" data-toggle="collapse" data-target="#demo"><span class="glyphicon glyphicon-pencil" ></span>
										Composer
										  </button></button>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
										  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;<div class="btn-group">
										  <button type="button" class="btn btn-default" data-toggle="modal" data-target="#id-popup2" id="MrqLu">Message non lu</button>
										  <button type="button" class="btn btn-default">Supprimer</button>		  
									     	</div> 
						          <div id="demo" class="collapse">
							          
										  
															                  
									        <section class="col-sm-5">
									        <hr>
									          <form class="well">
											            <legend>composer un message</legend>
											            <fieldset>
											                                       
																	                   <label for="message2">À :</label>
																						<select  class="special-flexselect" tabindex="1" data-placeholder="looking for enterprise ..." id="EntreDest" >
																							       <option value="" ></option>
																							       <c:forEach items="${AllEntre}" var="e">
																						                    <option value="${e.id}" >${e.nom}</option>
																						           </c:forEach>
																				       	</select><br>
																	                  
																                <label for="message2">Votre message :</label>
																                <textarea  class="form-control" rows="2" name="message" id="message2"></textarea>
																                <p class="help-block">Vous pouvez agrandir la fenêtre</p>
																                <button class="btn btn-primary" type="button" id="send"><span class="glyphicon glyphicon-ok-sign"></span> Envoyer</button>
											            </fieldset>
									          </form>
									        </section>
						                
						           </div>
						           
               </div>
               <hr>
				
					
				
				<div class="row msghead ccc">
					<div class="col-lg-1"><br><span class="glyphicon glyphicon-eye-open"></span> </div>
					<div class="col-lg-2"><br>Destinataire</div>
					<div class="col-lg-6"><br>Message</div>
					<div class="col-lg-3"><br>Date d'envoi</div>
					<div class="messageEnv"><br></div></div>	
				<div class="vvv" id="tabc">
									
				
					<c:forEach items="${mc}" var="c" varStatus="status">
					   
					    <div class="row setborder-top-bottom k" id="${c.value}">
					      
					   <c:choose>
						      <c:when test="${EtatMsg[status.count-1]=='msg msgrecue'}"> 
									   
									    
									   <c:choose>
										      <c:when test="${c.key.vue==true}">
										          <div class="col-lg-1"><input type="checkbox"  checked disabled > </div>
										     </c:when>
										     <c:otherwise>
										      <div class="col-lg-1"><input type="checkbox"   class="nnn" id="${c.key.idMsg}" value="${c.value}"> </div>
										      </c:otherwise>
						               </c:choose>
									    
									    
									    
									    
									    <div class="col-lg-2" id="${c.value}">${c.value}</div>
									    <div class="col-lg-6"><p class="${EtatMsg[status.count-1]}">${c.key.contenu}</p></div>
						      </c:when>
						     
						      <c:otherwise>
						      <div class="col-lg-1">&nbsp;</div>
						      <div class="col-lg-2" id="${c.value}">${c.value}</div>
						     <c:choose>
							      <c:when test="${c.key.vue==false}">
							      <div class="col-lg-6"><p class="${EtatMsg[status.count-1]}">${c.key.contenu} &nbsp;&nbsp;<span class="glyphicon glyphicon-remove spanee">&nbsp;non vu</span></p></div>
							     </c:when>
							     <c:otherwise>
							      <div class="col-lg-6"><p class="${EtatMsg[status.count-1]}">${c.key.contenu} &nbsp;&nbsp;<span class="glyphicon glyphicon-ok spanee">&nbsp;vu</span></p></div>
							      </c:otherwise>
						     </c:choose>
						      </c:otherwise>
						</c:choose>
						<div class="col-lg-2"> <fmt:formatDate value="${c.key.dateMsg}" pattern="yyyy/MM/dd" /></div>
					    <div class="messageEnv" id="${c.value}">
								  
										<span class="link"><span class="pull-right clickable panel-collapsed">
										     <i class="glyphicon glyphicon-plus aplusa"></i></span>
										</span>
										<div class="popup">
											<div class="box">voir la conversation</div>
									    </div>
	                    </div>
						
					</div>
					  
				    </c:forEach>
				</div>
				
				
				
				
				</section>
			</div>
	</div>
	
	<div class="container"> 
    
    <!-- ********************  popup messages d'une conversation  ********************** -->
    <p><button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#id-popup" id="popup" >Afficher la PopUp</button></p>
    

    <!-- construction de la popup 
          data-backdrop="false" pour supprimer le voile au-dessus de la popup
          data-keyboard="false" pour supprimer la touche Echap --> 
    <div class="modal fade" id="id-popup" tabindex="-1" role="dialog" aria-labelledby="titrePopUp" aria-hidden="true"> 
    
      <div class="modal-dialog"> 

				<div class="modal-content"> 
					
									  <!-- le titre de la popup --> 
									  <div class="modal-header"> 
									  <h5 class="modal-title" id="titrePopUp">
									  
									   <!-- lla croix de fermeture de la popup --> 
									  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									   Votre conversation avec : <center><label for="" class="labelpop lbavec" id="avec"></label></center>
									   </h5><hr> 
									  
									  <div class="row msghead ccc">
													<div class="col-lg-2"><br>Destinataire</div>
													<div class="col-lg-7"><br>Message</div>
													<div class="col-lg-3"><br>Date d'envoi</div>
													</div>
									   </div> 
									  
									  <!-- le contenu HTML de la popup --> 
									  <div class="modal-body vv" id="popScroll"> 
									  		
												   	<div class="containioer margtop " id="tab1" >
					                                </div>
									
									  </div>
									  
									  <!-- le pied de page de la popup --> 
									  <div class="modal-footer"> 	
									        <form class="well">
										        <label for="message" class="labelpop">Votre message :</label>
												 <textarea  class="form-control" rows="2" name="message" id="message"></textarea>
											     <p class="help-block">Vous pouvez agrandir la fenêtre</p>
												 <button class="btn btn-primary" type="button" id="button"><span class="glyphicon glyphicon-ok-sign"></span> Envoyer</button>
										</form>
										 </div>     
							</div> 

			     	</div> 

          </div> 









    <!-- ********************    exemple de popup   ********************** -->
    <p><button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#id-popup" id="popup" style="display:none;">Afficher la PopUp</button></p>
    

    <!-- construction de la popup 
          data-backdrop="false" pour supprimer le voile au-dessus de la popup
          data-keyboard="false" pour supprimer la touche Echap --> 
    <div class="modal fade" id="id-popup2" tabindex="-1" role="dialog" aria-labelledby="titrePopUp" aria-hidden="true"> 
    
      <div class="modal-dialog"> 

				<div class="modal-content"> 
					
									  <!-- le titre de la popup --> 
									  <div class="modal-header"> 
											  <h4 class="modal-title" id="titrePopUp"><center> Messges non lus</center>
											   <!-- lla croix de fermeture de la popup --> 
											  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button> </h4><hr> 
											  <div class="row msghead ccc ccd">
													
													<div class="col-lg-2"><br>Destinataire</div>
													<div class="col-lg-6"><br>Message</div>
													<div class="col-lg-3"><br>Date d'envoi</div>
													
													
													
													</div>
									   </div> 
									  
									  <!-- le contenu HTML de la popup --> 
									  <div class="modal-body vv" id="popScroll"> 
									  		<div class="tabnonlu"></div>
					                        
									
									  </div>
									  
									  <!-- le pied de page de la popup --> 
									  <div class="modal-footer"> 	
									       
										 </div>     
							</div> 

			     	</div> 

          </div> 

















    </div>	