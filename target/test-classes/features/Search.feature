Feature: Busqueda dresses


  @Regresion

    @search
  Scenario: Buscar dresses de color amarillo
    Given Navego a la pagina de automation practice home Dress
    And Cliqueo en Dresses
    When verifico que el color amarillo está disponible
    And cliqueo en la categoria de colores amarillos
    Then obtengo la cantidad de productos de color amarillo

