 $(document).ready(function() {
        $("select.special-flexselect").flexselect();
        $("select.flexselect").flexselect();
  
      });
 
 
 
 //<!--     ***********  message non lu ************   -->

 $(document).ready(function () {
 $("#MrqLu").click(function () {
 		
 		messagenonlu();
 		});
 		
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
               //  alert("Contact " + textStatus + " " + errorThrown + " !");
             }

         });
     };


// <!--   ***************  chat en temps reel   ********************* -->
 
 		/*var timer = setInterval(function() {a= $("#HidER").val();
 			if( a!="test")
 		       {affchTemReel(a)}},500); 
 
 
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
                 if(contact!="walo"){
                    $( "#tab1" ).prepend(contact);
                    $(".row.setborder-top-bottom.k ").remove("#"+nomDestin);
                    $(".vvv").prepend(contact2);
                    
                 }
              
             },
             error:function (jqXHR, textStatus, errorThrown) {
                // alert("Contact " + textStatus + " " + errorThrown + " !");
             }

         });
     };



*/

 /*************Affichage des messages d'une conversation ***********/

 	$(document).ready(
 			
 			function () {
 		$("#tabc").on("click", "div.messageEnv",function(){
 			//alert("ggggggggggggg");
 			var nobrAfich=0;
 			  var id = $(this).attr('id');conversation(id,0);
 			  
 			  $("#HidER").attr({value : id});
 			  $("#avec").attr({value : id});
 			  $('#avec').text(id)
 			  $("#popup").click();
 			  
 			 
 			  });
 	});


 	
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
                 //alert("Contact " + textStatus + " " + errorThrown + " !");
             }

         });
     };
   


 	//<!-- *************envoyer un message a partir d'une conversation*********** -->
 	
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
               //  alert("Contact " + textStatus + " " + errorThrown + " !");
             }

         });
         
         
      
         
         
         
         
     });
 });
 	
 	
 	
 //	<!-- *************envoyer un message*********** -->
 	
 	
 		
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
 	

 //<!-- ***************** scrolling affichage popup***************** -->
 	function scrrouuler(n){		
 		 var nomDestin = $('#HidER').val();
 			  conversation2(nomDestin,n);
 	};

 	
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
                 //alert("Contact " + textStatus + " " + errorThrown + " !");
                 
             }

         });
     };  


// <!-- ***************** scrolling affichage conversation***************** -->
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
                // alert("Contact " + textStatus + " " + errorThrown + " !");
             }

         });
     };   


// <!-- *************  button radio pour l envenement vue d'un message -->
 $(function(){
 	$("#tabc").on("click", "input.nnn",function(){
     	 
     	  var id = $(this).attr('id');
     	  var EE = $('#'+id).val(); //alert(EE);
     	  
           
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

 	
 	