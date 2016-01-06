<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page pageEncoding="utf-8" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8" />
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js" type="text/javascript"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js" type="text/javascript"></script>
    
    
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   
  
    <!-- *******************bootstrap***************** -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/custom.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/bootstrap/jquery.flexselect.js" />"></script>
    <script src="<c:url value="/resources/bootstrap/js/jquery-1.10.2.js" />"></script>
    <script src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>   
     
    <!-- *******************bootstrap***************** -->
     <!-- *******************pour la recherche***************** -->
     <link href="<c:url value="/resources/js/flexselect.css" />" rel="stylesheet">
     <script src="<c:url value="/resources/js/liquidmetal.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.flexselect.js" />"></script>
   <script type="text/javascript">
      $(document).ready(function() {
        $("select.special-flexselect").flexselect();
        $("select.flexselect").flexselect();
  
      });
    </script>
    
      <!-- *******************pour la recherche***************** -->
    <style>
      
      label, input { display: block; }
      label { font-weight: bold; }
      input, .flexselect_dropdown li { font-size: 1em; }
      small { color: #999; }
      .flexselect_selected small { color: #ddd; }
    </style>
    
   <!-- modal-body scroll --> 
    
<style>
 .ccc{
   padding: 0px;
  background-color: #BCBCBC;
  margin-right: -11px;
  margin-left: -10px;
 } 
.ccd{
height: 59px;
  border-radius: 4px;
}


.vvv::-webkit-scrollbar {
    width: 0.5em;
}
 
.vvv::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
}
 
.vvv::-webkit-scrollbar-thumb {
  background-color: darkgrey;
  outline: 1px solid slategrey;
}

 .vvv {
  height: 233px;
    width: 572px;
  overflow-y: auto;
   overflow-x: hidden;
 
  border-bottom-color: #FFFFFF;
  
  border-color: #A9A9A9;
}

.aplusa{
   margin-left: -58px;
}
    

  .vv{
    height: 300px;
    overflow-y: auto;
    }
    
.vv::-webkit-scrollbar {
    width: 1em;
}
 
.vv::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
}
 
.vv::-webkit-scrollbar-thumb {
  background-color: darkgrey;
  outline: 1px solid slategrey;
}
  

 
.messageEnv {
  position: relative;
  min-height: 0px;
  padding-right: 0px;
  padding-left: 0px;
  cursor: pointer;
}
.checbo1{
  margin: -2px -193px -18px;
}

.labelpop{
max-width: 21%;
}

.spanee{
  font-size: 10px;
  border-radius: 9px;
  top: 10px;
}

</style>


<!-- ********css message voir conversation -->

  <style>
	
			.link-with-popup {
			position: relative;
			z-index: 100;
			margin-bottom: 10px;
			font: normal 11px tahoma;
		}
		
		.link-with-popup:hover {
			z-index: 200;
		}
		
		.link {
			/* stylish design */
			background: #E0EAF1;
			padding: 10px 0;
			width: 22px;
			text-align: center;
			cursor: pointer;
		}
		
		.link:hover {
			background: #c4dae9;
		}
		
		.link:hover + .popup {
			display: block;
		}
		
		.popup {
			  position: absolute;
			  top: -38px;
			  left: 257px;
			  width: 292px;
			  bottom: 1px;
			  display: none;

}
		
		.popup:hover {
			display: block;
		}
		
		.popup .box {
			position: absolute;
			top: 0;
			left: 130px;
			right: 0;
			bottom: 0;
			background: #505050;
			color: #fff;
			padding: 10px 20px;
		}
	</style>

<!-- ctyl div message -->
<style>
.textarea {
   position: absolute;
   
   
   
  top: 66px;
  right: 440px;
  bottom: 290px;
  width: 55%;
  margin: 2%;
  margin-top: 0;
  background-color: rgba(249, 247, 255, 1);
  border-radius: 6px;
  height: 210px;
  overflow-y: scroll;
  overflow-x: hidden;
}
.textarea1 {
    position: absolute;
  top: 9px;
  left: 137px;
  right: 398px;
  bottom: 146px;
  width: 57%;
  margin: 4%;
  margin-top: 2px;
  background-color: rgba(175, 181, 186, 0.74);
  border-radius: 21px;
  height: 371px;
}
  

.sel {
  position: absolute;
  top: 287px;
  right: 266px;
  bottom: 275px;
  width: 40%;
  margin: 24%;
  margin-top: -5px;
  background-color: rgba(58, 59, 60, 0.74);
  border-radius: 8px;
  height: 98px;
  }


</style>

<!-- css du message dans la popup -->
<style>
.lbavec{
font-size: 22px;
max-width: 60%;}

.maxmsg{
 
  overflow: hidden;
  -o-text-overflow: ellipsis; /* pour Opera 9 */
  text-overflow: ellipsis;
  word-wrap: break-word;
  
  
}
  .msg {
   position: relative;
   
   max-width: 306px;
  
   word-wrap: break-word;
  
   hyphens: auto;

  display: inline-block;
  padding: 6px 12px;
  margin-bottom: 0;
  font-size: 14px;
  font-weight: normal;
  line-height: 1.42857143;
  text-align: left;
  vertical-align: middle;
  border: 1px solid transparent;
  border-radius: 4px;
}

.msgrecue {
  color: #fff;
  background-color: #337ab7;
  border-color: #2e6da4;
}
.msgenvoy {
  color: #333;
  background-color: rgba(75, 221, 43, 0.47);
  border-color: #ccc;
}
  </style>

<title>E-Entreprise</title>

<!--     ***********  message non lu ************   -->

<script type="text/javascript">
$(document).ready(function () {
$("#MrqLu").click(function () {
		
		messagenonlu();
		})
		
		});	

function messagenonlu(){
        $.ajax({
            type:'GET',
            url:"nonluMsg/",
            dataType:'json',
            
            success:function (result) {
            	var contact = '' ;
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                
                     }  
               // alert("*****"+contact+"*****");
                if(contact!="walo")
                   $( ".tabnonlu" ).html(contact);
                
               

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
    };
</script>

<!--   ***************  chat en temps reel   ********************* -->
<script type="text/javascript">
		var timer = setInterval(function() {a= $("#HidER").val();
			if( a!="test")
		       {affchTemReel(a)}},500);
</script>	
<script type="text/javascript">
function affchTemReel(nomDestin){
        $.ajax({
            type:'GET',
            url:"reel/"+nomDestin,
            dataType:'json',
            
            success:function (result) {
            	var contact = '' ;var contact2='';
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                    contact2+=t;//alert(t);
                
                     }  
               // alert("*****"+contact+"*****");
                if(contact!="walo" & contact!="waloo"){
                   $( "#tab1" ).prepend(contact);
                   $(".row.setborder-top-bottom.k ").remove("#"+nomDestin);
                   $(".vvv").prepend(contact2);alert("*********");
                   
                }
                if(contact=="waloo"){
                   	 $(".row.setborder-top-bottom.k ").remove("#"+nomDestin);
                     $(".vvv").prepend(contact2);
                       }

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
    };
</script>



<!-- *************Affichage des messages d'une conversation *********** -->
<script type="text/javascript" charset="utf-8">

	$(document).ready(
			
			function () {
		$("#tabc").on("click", "div.messageEnv",function(){
			var nobrAfich=0;
			  var id = $(this).attr('id');conversation(id,0);
			  
			  $("#HidER").attr({value : id});
			  $("#avec").attr({value : id});
			  $('#avec').text(id);
			  $("#popup").click();
			  
			 
			  });
	});

</script>
	<script type="text/javascript">	
	function conversation(nomDestin,nobrAfich){
        $.ajax({
            type:'GET',
            url:"A/"+nomDestin+"/"+nobrAfich,
            dataType:'json',
            
            success:function (result) {
            	var contact = '' ;
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                
                     }  
                
               
                   $( "#tab1" ).html(contact);
                
               

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
    };
</script>    


	<!-- *************envoyer un message a partir d'une conversation*********** -->
	<script type="text/javascript" charset="utf-8">
	$(document).ready(function () {
		 $('#button').click(function () {
			 //alert("****** ");
   
        var msg = $('#message').val();
        var EntrDest = $('#HidER').val();
       

        $.ajax({
            type:'GET',
            url:"C/"+msg+"/"+EntrDest,
            dataType:'json',
            
            success:function (result) {
            	var contact = '' ;
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                
                     }  
                
              $( "#tab1" ).prepend(contact);
                var id='';
             	 $("#message").val(''); 
             	$("#popScroll").animate({
				     scrollTop: 0 }, 400);
               

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
        
        
     
        
        
        
        
    });
});
	
	</script>
	
	<!-- *************envoyer un message*********** -->
	
	
		<script type="text/javascript" charset="utf-8">
	$(document).ready(function () {
		 $('#send').click(function () {
			 //alert("****** ");
   
        var msg = $('#message2').val();
        var idE = $('select#EntreDest').val();
     

        $.ajax({
            type:'GET',
            url:"D/"+msg+"/"+idE,
            dataType:'json',
            
            success:function () {
            	
                
               

            },
            error:function (jqXHR, textStatus, errorThrown) {
                
                
                var id='';
              	 $("#message2").val('');
              	 alert("votre message est envoyé");
                 
              	
            }

        });
    });
});
	
	</script>
<!-- ***************** scrolling affichage popup***************** -->
	<script type="text/javascript" charset="utf-8">
	function scrrouuler(n){		
		 var nomDestin = $('#HidER').val();
			  conversation2(nomDestin,n);
	};

</script>
	
	
	<script>
	jQuery(
			  function($)
			  {var n=6;bool=true;
			     $('.messageEnv').click(function(){   
				  bool=true;n=6;
				  
			     })
			  
			    $('#popScroll').scroll(function(){
			    	                        
			                                if($(this).scrollTop() +    $(this).innerHeight()>=$(this)[0].scrollHeight)
			                                {
			                          if(bool==true){ scrrouuler(n) ;n+=6 ;}
			                          
			                          else
			                        	  return false;
			            
			                                }
			                              })
			     
			 }
			);
</script>
	
<script type="text/javascript">	
	function conversation2(nomDestin,nobrAfich){
        $.ajax({
            type:'GET',
            url:"A/"+nomDestin+"/"+nobrAfich,
            dataType:'json',
            
            success:function (result) {
            	
            	var contact = '' ;
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                
                     }  
                if(contact!="walo"){
                    $( "#tab1" ).append(contact);}
                else{
                	bool=false;
                	
                }

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
                
            }

        });
    };
</script>    


<!-- ***************** scrolling affichage conversation***************** -->
	
	
	<script>
	jQuery(
			  function($)
			  {var n=6;bool=true;
			  
			    $('#tabc').scroll(function(){
			    	                        
			                                if($(this).scrollTop() +    $(this).innerHeight()>=$(this)[0].scrollHeight)
			                                {
			                          if(bool==true){ conversation3(n) ;n+=6 ;}
			                          
			                          else
			                        	  return false;
			            
			                                }
			                              })
			     
			 }
			);
</script>
	
<script type="text/javascript">	
	function conversation3(nobrAfich){
        $.ajax({
            type:'GET',
            url:"A/"+nobrAfich,
            dataType:'json',
            
            success:function (result) {
            	
            	var contact = '' ;
                console.log( JSON.stringify(result) );
                console.log(result); 
             
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    
                    contact +=result[t]; 
                
                     }  
                if(contact!="walo"){
                    $( "#tabc" ).append(contact);}
                else{
                	bool=false;
                	
                }

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
    };
</script>    


<!-- *************  button radio pour l envenement vue d'un message -->
<script type="text/javascript">
$(function(){
	$("#tabc").on("click", "input.nnn",function(){
    	 
    	  var id = $(this).attr('id');
    	  var EE = $('#'+id).val(); alert(EE);
    	  
          
         if( $('#'+id).is(':checked')){v=true} else v=false;
          setvueMsg(id,v,EE);
    }
);          

});
	
	
	function setvueMsg(id,v,EE){
        $.ajax({
            type:'GET',
            url:"vueMsg/"+id+"/"+v+"/"+EE,
            dataType:'json',
            
            success:function () {
            	
            	
                	
                

            },
            error:function (jqXHR, textStatus, errorThrown) {
               
            }

        });
    };

	</script>
	
	

	
	
	
	
	
</head>
  <body>
  
  <input type="hidden" name="entreDest" id="HidER" value="test" >
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
		<a class="pull-left" href="#"><img src="/ndr/ressources/bootstrap/imgs/ekenzy.PNG" /></a>
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
										<a href="<c:url value="/j_spring_security_logout" />" >	
										<span class="glyphicon glyphicon-modal-window"></span>	
										 logout
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
    <p><button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#id-popup" id="popup" style="display:none;">Afficher la PopUp</button></p>
    

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

</div> 






   
  </body>
</html>