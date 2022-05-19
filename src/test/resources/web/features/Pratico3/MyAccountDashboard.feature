Feature: my account dashboard

  Background:
    Given El usuario ingresa en la web de automation practice

  @Practico3 @MyAccount
  Scenario: Log-in with valid username and password.
    When Ingresa en la pagina de login e ingresa el email automation11@email.com y la pass TestingCrowdar2022!
    Then Se visualiza el dashboard de usuario


