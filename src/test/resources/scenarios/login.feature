Feature: Login

  Scenario: Ingresar a la web con las credanciales de usuario
    Given un navegador con la pagina de inicio de sesion cargada
    When se llena campo "Email" con "correo3@correo.com"
    And se llena campo "Password" con "password133"
    And se hace click en boton "Sign in"
    Then se redirecciona a Homepage con la sesion iniciada

  Scenario: Intentar ingresar al con una contraseña incorrecta
    Given el navegador con la pagina de inicio de sesion cargada
    When se llena campo "Email" con: "correo3@correo.com"
    And se llena campo "Password" con: "password133p"
    And se hace click en el boton "Sign in"
    Then se muestra mensaje "Invalid email or password"