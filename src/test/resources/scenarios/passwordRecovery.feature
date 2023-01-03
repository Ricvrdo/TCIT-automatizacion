Feature: Recuperacion de contraseña

  Scenario: Recuperacion de credenciales para ingreso
    Given un navegador con la pagina de recuperacion de passwrod cargada
    When se llena el campo "Email" con el correo de la cuenta que se recuperará el acceso
    And se hace click en el boton Submit
    Then Se muestra el Mensaje "Help is on the way!"