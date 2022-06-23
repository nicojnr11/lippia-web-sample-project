Feature: Login practice

  Background:
    Given El usuario navega en la pagina automation

  @Login
  Scenario Outline: Login-Handles case sensitive

    Given El usuario realiza un click en My Account Menu
    When El usuario completa el campo user con <username>
    And El usuario completa el campo password con <password>
    And El usuario realiza un click en el boton de Login
    Then se muestra el mensaje de error <message>

    Examples:
      | username               | password           | message                                                                                            |
      | automation11@email.com | TestingCrowdar2022 | The password you entered for the username automation11@email.com is incorrect. Lost your password? |

  @Login
  Scenario Outline: Login-Authentication

    Given El usuario realiza un click en My Account Menu
    When El usuario completa el campo user con <username>
    And El usuario completa el campo password con <password>
    And El usuario realiza un click en el boton de Login
    And El usuario realiza un logout
    Then se verifica que esta en la pantalla principal

    Examples:
      | username               | password            |
      | automation11@email.com | TestingCrowdar2022! |
