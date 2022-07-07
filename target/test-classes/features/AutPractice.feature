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
    Then verifico que la contraseña es incorrecta

    Examples:
      | emailSignIn |
      | emildsn870@gmail.com |
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

  @Login
  Scenario Outline: Ingresar password fallida
    Given Navego a la pagina de automation practice
    And Cliqueo en Sign In
    And verifico create an account esta visible
    And Ingreso el <emailSignIn>
    And Cliqueo en create an account
    When completo los datos <emailSignIn> y <passwordFailed>
    And Cliqueo en crear cuenta
    Then Verifico que la cuenta creada es visible
    Examples:
      | emailSignIn         | passwordFailed |
      | emildsn98@gmail.com | Pass           |






