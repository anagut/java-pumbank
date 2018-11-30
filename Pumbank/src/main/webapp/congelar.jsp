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

    <link href="https://fonts.googleapis.com/css?family=Original+Surfer" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">

    <link rel="stylesheet" href="./css/congelar_style.css">

</head>

<body>
    <div id="fondo" class="row">
        <header>
            <div id="boton">
                <!-- aqui esta el boton de la bellota -->
                <div class="btn-group dropright">
                    <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" id="dropdownMenuButton"
                        aria-haspopup="true" aria-expanded="false">
                        <img class="bellota" src="./imgs/Bellota-Kawaii-83631.gif" alt="">

                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="./pumbanking.html">Pumbanking</a>
                        <a class="dropdown-item" href="./control_parental.html">Control parental</a>
                        <a class="dropdown-item" href="#">Paga</a>
                        <a class="dropdown-item" href="#">Transferencia</a>
                        <a class="dropdown-item" href="#">Ajustes</a>
                    </div>
                    <div class="dropdown-menu">
                        <!-- Dropdown menu links -->
                    </div>
                </div>
            </div>
            <div id="logo">
                <a href="./homepage_sr.html">
                    <h1 id=name>RICARDO SR</h1>
                </a>
            </div>
        </header>
        <section>
            <div><a href="#">Saldo <p class="derecha">${unH.saldo}</p></a>
                <div id="congelar">
                    <div>
                        <h2 id="tituloseccion">Congelar cuenta</h2>
                    </div>
                    <div>
                        <form action="" method="POST" id="congelarniño" novalidate>
                            <div>
                                <div id="nombre_niño_error" class="error esconder">*Debe el nombre del usuario al que desea congelar la cuenta.</div>
                            </div>

                            <div>
                                <label for="fecha_inicio">Desde</label>
                                <input id="fecha_inicio" type="date" class="noflechas" name="fecha_inicio" required>
                                <div id="fecha_inicio_error" class="error esconder">*Debe introducir una fecha de inicio.</div>
                            </div>

                            <div>
                                <label for="fecha_fin">Hasta</label>
                                <input id="fecha_fin" type="date" class="noflechas" name="fecha_fin" required>
                                <div id="fecha_fin_error" class="error esconder">*Debe introducir una fecha de inicio.</div>
                            </div>

                            <div>
                                <button type="submit" id="confirmar_congelar">Confirmar</button>
                                <button type="reset" id="cancelar_congelar">Cancelar</button>
                            </div>
                        </form>


                    </div>

                </div>
        </section>
    </div>

</body>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
    crossorigin="anonymous"></script>


</html>