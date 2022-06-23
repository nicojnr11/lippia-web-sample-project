Feature: Registration practice

  Background:
    Given El usuario navega en la pagina automation

  @Register
  Scenario Outline: Registration with empty password
    Given El usuario realiza un click en My Account Menu
    When El usuario completa el campo email con <email> en Email-Address
    And El usuario no ingresa datos en el campo Password
    And El usuario realiza un click en el boton Register
    And se muestra el mensaje de error <mensajeError>

    Examples:
      | email      | mensajeError                             |
      | @email.com | Error: Please enter an account password. |

  @Register
  Scenario Outline: Registration with empty Email-id & password
    Given El usuario realiza un click en My Account Menu
    When El usuario no completa los campos email y password y realiza un click en Register
    And se muestra el mensaje de error <mensajeError>

    Examples:
      | mensajeError                             |
      | Error: Please enter an account password. |