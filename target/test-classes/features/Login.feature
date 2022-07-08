Feature: Busqueda dresses


  @Regresion

  @login
  Scenario: Login exitoso
    Given Navego a la pagina de automation practice al login
    When Ingreso usuario y contraseña
    Then verifico que el login se realizó correctamente

  @login
  Scenario: Login password fallida
    Given Navego a la pagina de automation practice al login
    When Ingreso usuario y contraseña fallido
    Then verifico mensaje de password fallida


