Feature: login

  Background:
    Given El usuario ingresa en la web de automation practice

  @Practico3 @Login
  Scenario: Log-in with valid username and password.
    When Ingresa en la pagina de login e ingresa el email automation11@email.com y la pass TestingCrowdar2022!
    Then Se visualiza el dashboard de usuario

  @Practico3 @Login
  Scenario: Log-in with valid username and incorrect password.
    When Ingresa en la pagina de login e ingresa el email automation11@email.com y la pass TestingCrowdar
    Then Se visualiza el mensaje de error ERROR: The password you entered for the username automation11@email.com is incorrect. Lost your password?

  @Practico3 @Login
  Scenario: Log-in with incorrect username and incorrect password.
    When Ingresa en la pagina de login e ingresa el email automation11@ y la pass TestingCrowdar
    Then Se visualiza el mensaje de error ERROR: Invalid username. Lost your password?

  @Practico3 @Login
  Scenario: Log-in with correct username and empty password.
    When Ingresa en la pagina de login e ingresa solo el email automation11@email.com
    Then Se visualiza el mensaje de error Error: Password is required.

  @Practico3 @Login
  Scenario: Log-in with empty username and valid password.
    When Ingresa en la pagina de login e ingresa la pass TestingCrowdar2022!
    Then Se visualiza el mensaje de error Error: Username is required.

  @Practico3 @Login
  Scenario: Log-in with empty username and empty password.
    When Ingresa en la pagina de login e ingresa los datos vacios
    Then Se visualiza el mensaje de error Error: Username is required.