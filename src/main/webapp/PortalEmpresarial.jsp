<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Parque de diversiones</title>
<link rel="stylesheet" href="./CCS/stylePortal.css">
</head>
<body>
	<header>
		<nav>
			<ul class="main_nav">
				<li class="main_nav__item"><a href="./Index.jsp">Inicio</a></li>
				<li class="main_nav__item"><a href="./Registro.jsp">Registro</a>
				</li>
				<li class="main_nav__item"><a href="./Comprar.jsp">Comprar</a>
				</li>
				<li class="main_nav__item"><a href="./PortalEmpresarial.jsp">Portal
						Empresarial</a></li>
			</ul>
		</nav>
	</header>
	<main>

		<form method="get" action="Portal1">
			<LAbel for="usuario" class="formulario_item"> 
			<span>Selecciona tu puesto de trabajo</span> 
			<select name="Atracciones" id="Atracciones">
					<option value="M" name="M">Montaña Rusa</option>
					<option value="C" name="C">Carros chocones</option>
					<option value="T" name="T">Tronquitos</option>
					<option value="CT" name="CT">Casa del Terror</option>
			</select> 
			</Label>
			
			</LAbel> 
			<LAbel for="idpasaporte" class="formulario_item">
			 <span>Digita el número de pasaporte</span>
			 <input type="number" name= "idpasaporte" id="idpasaporte">
			</LAbel> 
			
			<LAbel for="altura" class="formulario_item">
			 <span>Digita la estatura del usuario</span>
			 <input type="number" name= "altura" id="altura">
			</LAbel> 
			
			<LAbel for="edad" class="formulario_item">
			 <span>Digita la edad del usuario</span>
			 <input type="number" name= "edad" id="edad">
			</LAbel> 
			
			<LAbel for="usuario" class="formulario_item"> 
			<input type="submit" value="Ingresar"> <input type="button"
				value="Regresar" onclick="history.back()">
			</LAbel>
		</form>
	</main>

</body>
</html>