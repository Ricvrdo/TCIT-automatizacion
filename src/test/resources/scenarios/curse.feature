Feature:  Entrar a la página del curso "Modern React and NodeJS Development" y ver el video

  Scenario: Ingreso a curso y reproduccion del video
    Given un navegador con la pagina "colections" cargada
    When se busca curso "Modern React and NodeJS Development" en la barra de busqueda
    And se hace click en curso  "Modern React and NodeJS Development"
    And se da click al video del curso
    Then se reproduce el video