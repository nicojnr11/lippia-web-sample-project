Feature: My Account practice

  Background:
    Given El usuario navega en la pagina automation
    When El usuario realiza un click en My Account Menu
    When El usuario completa el campo user con automation11@email.com
    And El usuario completa el campo password con TestingCrowdar2022!
    And El usuario realiza un click en el boton de Login

  @MyAccount
  Scenario: My Accounts-Account Details
    Given El usuario realiza un click en la opcion Account Details
    Then El usuario visualiza los detalles de la cuenta

  @MyAccount
  Scenario: My Accounts-Log-Out
    Given El usuario realiza un logout
    Then se verifica que esta en la pantalla principal