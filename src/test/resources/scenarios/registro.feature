Feature: Registro correcto de usuario

  Scenario: Crear una nueva cuenta de usuario
    Given un navegador con la pagina de registro cargada
    When se llena el campo  "First Name" con "Juan"
    And se llena el campo "Last Name" con Perez
    And se llena el campo "Email" con "correo5@correo.com"
    And se llena el campo "Password" con "password133"
    And se aceptan los terminos y condiciones
    And se hace click en el boton Sign up
    Then se redirecciona al Homepage con la sesion iniciada

