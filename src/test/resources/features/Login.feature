Feature: Registro exitoso de cliente, validando la correcta creación mediante aserciones.
 @ChallengeWally

  @Regresion
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
      | emildsn847@gmail.com |
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

  @Regresion
    @PasswordIncorrecta
    Scenario Outline: Registro con password incorrecta
    Given Navego a la pagina de automation practice
    And Cliqueo en Sign In
    And Ingreso el <emailSignIn>
    And Cliqueo en create an account
    When completo los datos
    Then verifico que la contraseña es incorrecta
    Examples:
      | emailSignIn |
      | emildsn0002@gmail.com |
















