Feature: Registro exitoso de cliente, validando la correcta creación mediante aserciones.

  @Regression

    @Login
    Scenario Outline: Registrar a un cliente exitosamente
    Given Navego a la pagina de automation practice
    And Cliqueo en Sign In
    And verifico create an account esta visible
    And Ingreso el <emailSignIn>
    And Cliqueo en create an account
    When completo los campos y el campo <emailSignIn>
    Then verifico que la pagina esta visible

    Examples:
      | emailSignIn |
      | emildsn860@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |
      #| emildsn70@gmail.com |








