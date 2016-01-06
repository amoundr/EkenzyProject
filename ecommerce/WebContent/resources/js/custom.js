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


/************* get zone by ville ***********/

$(document).ready(function () {
    $('select#ville').change(function () {

        var last = $('#firstInput').val();
        var first = $('select#ville').val();

        $.ajax({
            type:'GET',
            url:"getJSON/" + first,
            dataType:'json',
            success:function (result) {

                var contact = '<option value="NONE"> --SELECT--</option>' ;
               

                
                
               
                console.log( JSON.stringify(result) );
                console.log(result);
                
                for (var key in Object.keys(result)){
                    var t = Object.keys( result )[key];
                    contact +=  '<option value="' +t+ '">' + result[t] + '</option>'; 
                
                     }  
                
                $("select#zone").html(contact);
                
                clearInputs();

            },
            error:function (jqXHR, textStatus, errorThrown) {
                alert("Contact " + textStatus + " " + errorThrown + " !");
            }

        });
    });
});