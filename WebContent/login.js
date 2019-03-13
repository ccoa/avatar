$(document).ready(function() {
    
	$('#btnIngresar').click(function() {
		
		var login = $('#txtLogin').val().trim();
		var clave = $('#txtClave').val().trim();
		
		if (login == '' && clave == '') {
			
			alert('Ingrese usuario y clave');
			
		} else if (login == '') {
			
			alert('Ingrese usuario');
			
		} else if (clave == '') {
			
			alert('Ingrese clave');
			
		} else {
			
			$.ajax({
                url: "./loginServlet",
                type: "POST",
                data : {
                	login: login,
                	clave: clave
                }
            }).done(function(mensaje) {
                
            	$('#divMensaje').hide();
            	$('#divMensaje').html(mensaje);
            	$('#divMensaje').fadeIn();
            	
            }).fail(function( jqXHR, textStatus, errorThrown ) {
            	console.log(errorThrown);
            });
		}
		
	});
	
	
});