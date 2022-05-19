<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parque de diversiones</title>
</head>
<body>
    <header>
        <ul> 
            <li>
               <a href="./Index.jsp">Inicio</a> 
                
            </li>
            <li>
               <a href="./Registro.jsp">Registro</a>
            </li>
            <li>
               <a href="./Comprar.jsp">Comprar</a>
            </li>
            <li>
               <a href="./PortalEmpresarial.jsp">Portal Empresarial</a>
            </li>
        </ul>
        </header>
        <div class="advertencia">
           <p>Recuerde que las atracciones tienen resticciones de edad y estatura</p>
        </div>
        <div class="compra">
           <form action="comprar" class="from">
               <label for="item1" class="from_item">
                  <span class="from_item__span">Pasaporte tipo Infantil</span>
                  <input type="number" name="item1">
                  <span>Valor $45000</span>
               </label>
               <label for="item2" class="from_item">
                  <span class="from_item__span">Pasaporte tipo joven</span>
                  <input type="number" name="item2">
                  <span>Valor $65000</span>
               </label>
               <label for="item3" class="from_item">
                  <span class="from_item__span">Pasaporte tipo familiar</span>
                  <input type="number" name="item3">
                  <span>Valor $50000</span>
               </label>
               <label for="botones">
                  <input type="submit" value="Pagar">
                  <input type="button" value="Cancelar" onclick="history.back()">
               </label>

           </form>
        </div>
    
</body>
</html>