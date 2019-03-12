<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login - Avatar</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >

</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-offset-4 col-sm-4">
			
				<h2>Login - Avatar</h2>
				<br>
				
				<div class="form-group">
					<label>Usuario: </label>
					<input id="txtLogin" type="text" class="form-control"/>
				</div>
				
				<div class="form-group">
					<label>Clave: </label>
					<input id="txtClave" type="password" class="form-control"/>
				</div>
				
				<div class="form-group">
					<br>
					<button id="btnIngresar" type="button" class="btn btn-block btn-success">Ingresar</button>
				</div>
				
				<div class="form-group">
				
					<div id="divMensaje"></div>
					
				</div>
			</div>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<script type="text/javascript" src="login.js"></script>
	
</body>
</html>