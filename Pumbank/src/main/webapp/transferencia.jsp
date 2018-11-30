<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Template</title>

<link href="https://fonts.googleapis.com/css?family=Original+Surfer"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<link rel="stylesheet" href="./css/transferencias_style.css">

</head>

<body>
	<div>
		<header>
			<div>
				<a href="./hijo">
					<div id=name>hola</div>
				</a>
			</div>
		</header>

		<form method="POST" action="#">
			<h1 name="hid">Transferencia</h1>

			<div>${mensaje}</div>
			<div class="row" id=money>
				<div class="col-6">Saldo</div>
				<input class="col-4" type="number" min="0.1" max="50" step="0.1"
					name="saldo" required>
				<div class="col-1">€</div>
			</div>
			<div class="row" id="footer">
				<div class="col-6" id="confirmar">
					<button type="submit" id="boton">Confirmar</button>
				</div>
				<div class="col-6" id="cancelar">
					<button type="reset" id="boton">Cancelar</button>
				</div>
			</div>
		</form>

	</div>


</body>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>

</html>