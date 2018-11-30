<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="https://fonts.googleapis.com/css?family=Original+Surfer"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<link rel="stylesheet" href="./css/homepage_sr_style.css">
<title>Insert title here</title>
</head>
<body>
	<header>
		<div id="logo">
			<div class="error">${error}</div>
				<h1 id=name>${unP.nombre}</h1>
		</div>
	</header>
	
	<div>${unP.nombre}</div>
	<ul>
		<c:forEach var="unHijo" items="${hijos}">
			<li>
				<div id="nombre_hijo">${unHijo.nombre}</div>
				<div id="saldo_hijo">${unHijo.saldo}</div>
				<div id="red" class="btn-group" role="group"
					aria-label="Basic example">
					<a href="./paga?hid=${unHijo.hid}">Paga</a>
				</div>
				<div id="red" class="btn-group" role="group"
					aria-label="Basic example">
					<a href="./paga?hid=${unHijo.hid}">Transferencia</a>
				</div>
				<div id="red" class="btn-group" role="group"
					aria-label="Basic example">
					<a href="./paga?hid=${unHijo.hid}">Congelar</a>
				</div>
			</li>
		</c:forEach>
	</ul>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>