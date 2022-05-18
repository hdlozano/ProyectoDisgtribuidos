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
        <main>
           
           <form action="Empresa">
            <LAbel for="usuario" class="formulario_item">
               <span>Digita tu usuario</span>
               <input type="text" name="usuario" id="usuario" autocomplete="username" required/>
             </LAbel>

            <LAbel for="contrasena" class="formulario_item">
               <span>Digita tu contrase&ntildea</span>
               <input type="password" name="contrasena" id="contrasena" required/>
             </LAbel>

             <input type="submit" value="Ingresar">
             <input type="button" value="Regresar" onclick="history.back()" >
           </form>
        </main>

</body>
</html>