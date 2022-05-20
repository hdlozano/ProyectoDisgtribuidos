<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parque de diversiones</title>
    <link rel="stylesheet" href="./CCS/stylecompra.css">
</head>
<body>
   <header>
       <nav>
 			<ul class="main_nav"> 
 				<li class="main_nav__item">
					<a href="./Index.jsp">Inicio</a> 
 			
 				</li>
 				<li class="main_nav__item">
					<a href="./Registro.jsp">Registro</a>
 				</li>
 				<li class="main_nav__item">
					<a href="./Comprar.jsp">Comprar</a>
 				</li>
 				<li class="main_nav__item">
					<a href="./PortalEmpresarial.jsp">Portal Empresarial</a>
			 	</li>
 		</ul>
	</nav>
   </header>
        <div class="advertencia">
           <p>Recuerde que las atracciones tienen resticciones de edad y estatura y solo podra comprar un maximo de 4 pasaportes</p>
        </div>
        <div class="compra">
           <form method="post" action="Compra" class="from">
           		<label for="user" class="usuario">
           		<span>Id usuario</span>
           		<input type="number" name="user" value= ${id}>
           		</label>
               <label for="item1" class="from_item">
                  <span class="from_item__span">Pasaporte tipo Infantil</span>
                  <input type="number" name="item1" min="0" max="4" value = "0">
                  <span class="from_item__span">Valor $45000</span>
               </label>
               <label for="item2" class="from_item">
                  <span class="from_item__span">Pasaporte tipo joven</span>
                  <input type="number" name="item2" min="0" max="4" value = "0">
                  <span class="from_item__span">Valor $65000</span>
               </label>
               <label for="item3" class="from_item">
                  <span class="from_item__span">Pasaporte tipo familiar</span>
                  <input type="number" name="item3" min="0" max="4" value = "0">
                  <span class="from_item__span">Valor $50000</span>
               </label>
               <label for="botones" class="from_item">
                  <input type="submit" value="Pagar">
                  <input type="button" value="Cancelar" onclick="history.back()">
               </label>

           </form>
        </div>
    
</body>
</html>