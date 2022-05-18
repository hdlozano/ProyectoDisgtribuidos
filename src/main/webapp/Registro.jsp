<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Parque de diversiones</title>
    <link rel="stylesheet" href="./CCS/styleRegistro.css" />
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
    <main>
      <form action="./" class="formulario">
        <LAbel for="nombre" class="formulario_item">
          <span>¿Cual es tu nombre?</span>
          <input type="text" name="nombre" id="nombre" />
        </LAbel>

        <LAbel for="id" class="formulario_item">
          <span>¿Cual es tu identificac&iacuteon?</span>
          <input
            type="number"
            name="id"
            id="id"
            autocomplete="cc-number"
            required
          />
        </LAbel>

        <LAbel for="correo" class="formulario_item">
          <span>¿Cual es tu corr&eacuteo?</span>
          <input type="email" name="id" id="id" autocomplete="email" required />
        </LAbel>

        <LAbel for="password" class="formulario_item">
          <span>Digita tu pasword </span>
          <input
            type="password"
            name="password"
            id="password"
            autocomplete="new-password"
            required
          />
        </LAbel>

        <LAbel for="birthday" class="formulario_item">
          <span>¿Cual es tu fecha de nacimiento?</span>
          <input
            type="date"
            name="birthday"
            id="birthday"
            autocomplete="bday-day"
            required
          />
        </LAbel>
        <input type="submit" id="enviar">
        <input type="button" value="Cancelar" id="cancelar" onclick="history.back()">

      </form>
    </main>
  </body>
</html>
