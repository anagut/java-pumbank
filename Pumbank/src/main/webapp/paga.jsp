<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paga</title>

<!-- <link rel="stylesheet" href="./css/admin-paga_style.css"> -->

<form method="POST">
	<div>
		<label>Usuario</label>
		<input name="nombre" id="nombre" value="${elHijo.nombre}" required>
	</div>

	<div>
		<label>Cantidad</label>
		<input type="number" name="cantidad" id="cantiad" value="${elSaldo.cantidad}" required>
		<label>€</label>
	</div>
	<div>
		<label>Frecuencia</label> <select required>
			<option value="" disabled selected></option>
			<option value="7">Cada semana</option>
			<option value="15">Cada 15 días</option>
			<option value="30">Cada mes</option>
			<option value="1">Cada día</option>
		</select>
	</div>
	
	<div><button>Aceptar</button></div>
	<div><button>Cancelar</button></div>


</form>
</html>