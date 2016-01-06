$(document).ready(function() {
	
$("#myrate").rating();
 getRateNote() ;
// getMyRateNote();

});



$('#myrate').on('rating.change', function(event, value, caption) {
    console.log(value);
    
    
    /********* DEBUT************/
  //get the path
	var pathname = window.location.pathname;
	
	var idE = ""; 
	splt = pathname.split("/");
	idE = splt[3];
    
    $.ajax({
        type:'GET',
        url:"rating/"+idE+"/"+value,
        dataType:'json',
        
        success:function (result) {
            console.log( JSON.stringify(result) );
            console.log(result); 
            $('#myrate').rating('update', result);
         
           

        },
        error:function (jqXHR, textStatus, errorThrown) {
            //alert("error ");
        }

    });
    
    /************FIN*********/
    
    
    
});


function getRateNote() {
	

    /********* DEBUT************/
	
	//get the path
	var pathname = window.location.pathname;
	
	var myurl = "ratenote/30"; 
	var splt ="";
	if(pathname.indexOf("/ndr/entreprise/") > -1) myurl = "ratenote/" ;
	else { splt = pathname.split("/");
	myurl = "ratenote/"+splt[3];}
	//alert(pathname);
    
    $.ajax({
        type:'GET',
        url: myurl , //"ratenote/30",
        dataType:'json',
        
        success:function (result) {
            console.log( JSON.stringify(result) );
            console.log(result); 
            $('#myrate').rating('update', result);      
          
        },
        error:function (jqXHR, textStatus, errorThrown) {
           // alert("error ");
        }

    });
    
    /************FIN*********/
	
};

function getMyRateNote() {
	

    /********* DEBUT************/
    
    $.ajax({
        type:'GET',
        url:"ratenote/",
        dataType:'json',
        
        success:function (result) {
            console.log( JSON.stringify(result) );
            console.log(result); 
            $('#myrate').rating('update', result);      
          
        },
        error:function (jqXHR, textStatus, errorThrown) {
           // alert("error ");
        }

    });
    
    /************FIN*********/
	
};

function getZones(value){
	
	$.ajax({
        type:'POST',
        url:"/ndr/ville/"+value,
        dataType:'json',
        
        
        success:function (result) {
            console.log( JSON.stringify(result) );
            console.log(result); 
           // $('#myrate').rating('update', result);  
           // alert(result);
          
        },
        error:function (jqXHR, textStatus, errorThrown) {
           // alert("error ");
        }

    });
	
}
