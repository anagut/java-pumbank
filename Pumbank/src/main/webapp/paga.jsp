<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paga</title>
</head>
<body>
	<form id="formPaga" method="POST">
		<div class="row">
			<label for="niño">Usuario</label>
			<input id="nombre" name="nombre" value="${elHijo.nombre}">
		</div>

		<div class="row">
			<label class="col-4" for="Cantidad">Cantidad</label> <input
				class="col-4" type="text" pattern="[0-9]*" id="cant" name="cant"
				required> <label class="col-1" for="">€</label>
		</div>



		<div class="row" id="frec">
			<label class="col-4" for="Frecuencia">Frecuencia</label> <select
				class="col-5" name="Frecuencia" id="frecuencia" required>
				<option value="" disabled selected></option>
				<option value="cada semana">Cada semana</option>
				<option value="cada 15 días">Cada 15 días</option>
				<option value="cada mes">Cada mes</option>
				<option value="cada día">Cada día</option>
			</select>

		</div>
		<div class="row">
			<div id="datosbancarios" class="row">
				<label for="datosbancarios">Datos bancarios</label>
			</div>
			<div class="row">
				<div>
					<label class="col-5" for="tarjeta">Nº de tarjeta</label> <input
						id="datosbanc" class="col-4" type="text" minlength="16"
						maxlength="18" name="datosbanc" required>

				</div>
				<div>
					<label for="CVV"></label> <input id="CVV" name="CVV"
						class="noflechas" type="number" minlength="3" maxlength="3"
						placeholder="CVV" required>


				</div>
			</div>

			<div id="datostarjeta">
				<div>Caducidad</div>

				<div id="caducidad">
					<div>
						<div>
							<select id="mes" name="mes" class="noflechas" type="number"
								required>
								<option value="0" value="" disabled selected>MM</option>
								<option value="1" type="">01</option>
								<option value="2" type="">02</option>
								<option value="3" type="">03</option>
								<option value="4" type="">04</option>
								<option value="5" type="">05</option>
								<option value="6" type="">06</option>
								<option value="7" type="">07</option>
								<option value="8" type="">08</option>
								<option value="9" type="">09</option>
								<option value="10" type="">10</option>
								<option value="11" type="">11</option>
								<option value="12" type="">12</option>
							</select> <select id="año" name="año" type="number">
								<option value="0" value="" disabled selected>YYYY</option>
								<option value="01">2018</option>
								<option value="02">2019</option>
								<option value="03">2020</option>
								<option value="04">2021</option>
								<option value="05">2022</option>
								<option value="06">2023</option>
								<option value="07">2024</option>
								<option value="08">2025</option>
								<option value="09">2026</option>
								<option value="10">2027</option>
							</select>


						</div>

					</div>
				</div>

			</div>
		</div>
		<div>
			<button id="accederbtn">Cofirmar</button>
			<button id="cancelar_paga">Cancelar</button>
		</div>
	</form>
</body>
</html>