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
            <a href="./Index.html">Inicio</a>
          </li>
          <li class="main_nav__item">
            <a href="./Registro.html">Registro</a>
          </li>
          <li class="main_nav__item">
            <a href="./Comprar.html">Comprar</a>
          </li>
          <li class="main_nav__item">
            <a href="./PortalEmpresarial.html">Portal Empresarial</a>
          </li>
        </ul>
      </nav>
    </header>
    <main>
      <form method="pos" action="RegistroClass" class="formulario">
        <label for="name" class="formulario_item">
          <span class="label_input">¿Cual es tu nombre?</span>
          <input type="text" class="inp_item" name="name" id="name" autocomplete="name"/>
        </label>

        <label for="id" class="formulario_item">
          <span class="label_input">¿Cual es tu identificac&iacuteon?</span>
          <input type="number" class="inp_item" name="id" id="id" autocomplete="cc-number"  />
        </label>

        <label for="email" class="formulario_item">
          <span class="label_input">¿Cual es tu corr&eacuteo?</span>
          <input type="email" class="inp_item" name="email" id="email" autocomplete="email" />
        </label>

        <label for="password" class="formulario_item">
          <span class="label_input">Digita tu pasword </span>
          <input type="password" class="inp_item" name="password" id="password" autocomplete="new-password" />
        </label>

        <label for="birthday" class="formulario_item">
          <span class="label_input">¿Cual es tu fecha de nacimiento?</span>
          <input type="date" class="inp_item" name="birthday" id="birthday" autocomplete="bday-day" />
        </label>
        <label for="botones">
          <input type="submit" id="enviar" />
          <input type="button" class="inp_item" value="Cancelar" id="cancelar" onclick="history.back()"/>
        </label>
      </form>
    </main>
  </body>
</html>
