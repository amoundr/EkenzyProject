$(document).ready(function() {
$("[name='affActiviteEnDetail-checkbox']").bootstrapSwitch();
$("[name='affStatut-checkbox']").bootstrapSwitch();
$("[name='affCaptitalSocial-checkbox']").bootstrapSwitch();
$("[name='affNumTelephone-checkbox']").bootstrapSwitch();
$("[name='affAdresse-checkbox']").bootstrapSwitch();
$("[name='affAnneeCreation-checkbox']").bootstrapSwitch();
$("[name='affnameManager-checkbox']").bootstrapSwitch(); 

$("[name='affsexeManager-checkbox']").bootstrapSwitch();
$("[name='affdateNaissance-checkbox']").bootstrapSwitch();
$("[name='affvilleNassanceManager-checkbox']").bootstrapSwitch();
$("[name='affvilleActuelleManager-checkbox']").bootstrapSwitch();
$("[name='affemailManager-checkbox']").bootstrapSwitch();

//salah 

  $("select.special-flexselect").flexselect();
  $("select.flexselect").flexselect();
  
  $("#MrqLu").click(function () {
		
		messagenonlu();
		
		});	

  $("#tabc").on("click", "input.nnn",function(){
 	 
	  var id = $(this).attr('id');
	  var EE = $('#'+id).val(); alert(EE);
	  
      
     if( $('#'+id).is(':checked')){ v=true ;} else v=false;
      setvueMsg(id,v,EE);
}
);
  
  
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
  
  $("#tabc").on("click", "div.messageEnv",function(){
		var nobrAfich=0;
		  var id = $(this).attr('id');conversation(id,0);
		  
		  $("#HidER").attr({value : id});
		  $("#avec").attr({value : id});
		  $('#avec').text(id)
		  $("#popup").click();
		  
  });	  
  
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


$('input[name="affActiviteEnDetail-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
  console.log(this); // DOM element
  console.log(event); // jQuery event
  console.log(state); // true | false
  $("#affActiviteEnDetail").text(state);
  $("#affActiviteEnDetail").val(state);
}); 

$('input[name="affStatut-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  console.log(this); // DOM element
	  console.log(event); // jQuery event
	  console.log(state); // true | false
	  $("#affStatut").text(state);
	  $("#affStatut").val(state);
	}); 

$('input[name="affCaptitalSocial-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#affCaptitalSocial").text(state);
	  $("#affCaptitalSocial").val(state);
	}); 

$('input[name="affNumTelephone-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#affNumTelephone").text(state);
	  $("#affNumTelephone").val(state);
	}); 
$('input[name="affAdresse-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#affAdresse").text(state);
	  $("#affAdresse").val(state);
	}); 
$('input[name="affAnneeCreation-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#affAnneeCreation").text(state);
	  $("#affAnneeCreation").val(state);
	}); 

// manager switch 

$('input[name="affnameManager-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#manager\\.affnameManager").text(state);
	  $("#manager\\.affnameManager").val(state);
	});           
	
$('input[name="affsexeManager-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
		  $("#manager\\.affsexeManager").text(state);
		  $("#manager\\.affsexeManager").val(state);
	});
$('input[name="affdateNaissance-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
		  $("#manager\\.affdateNaissance").text(state);
		  $("#manager\\.affdateNaissance").val(state);
	});
$('input[name="affvilleNassanceManager-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#manager\\.affvilleNassanceManager").text(state);
	  $("#manager\\.affvilleNassanceManager").val(state);
});
$('input[name="affvilleActuelleManager-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#manager\\.affvilleActuelleManager").text(state);
	  $("#manager\\.affvilleActuelleManager").val(state);
});
$('input[name="affemailManager-checkbox"]').on('switchChange.bootstrapSwitch', function(event, state) {
	  $("#manager\\.affemailManager").text(state);
	  $("#manager\\.affemailManager").val(state);
});


// salh

function scrrouuler(n){		
	 var nomDestin = $('#HidER').val();
		  conversation2(nomDestin,n);
};

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