Feature: Register

  Background:
    Given El usuario ingresa en la web de automation practice

  #@Practico3 @Register no se habilita el boton Register
  Scenario: Registration-Sign-in.
    When Ingresa en la pagina de register e ingresa el email @email.com y la pass TestingCrowdar2022!
    Then Se visualiza el dashboard de usuario

   #@Practico3 @Register no se habilita el boton Register
  Scenario: Registration with invalid Email-id
    When Ingresa en la pagina de register e ingresa el email @email y la pass TestingCrowdar2022!
    Then Se visualiza el mensaje de error Error: Please provide a valid email address.


  #@Practico3 @Register no se habilita el boton Register
  Scenario: Registration with empty Email-id
    When Ingresa en la pagina de register e ingresa la pass TestingCrowdar2022!
    Then Se visualiza el mensaje de error Error: Please provide a valid email address.

  @Practico3 @Register
  Scenario: Registration with empty password
    When Ingresa en la pagina de register e ingresa solo el email @email.com
    Then Se visualiza el mensaje de error Error: Please enter an account password.

  @Practico3 @Register
  Scenario: Registration with empty Email-id & password
    When Ingresa en la pagina de Register e ingresa los datos vacios
    Then Se visualiza el mensaje de error Error: Please provide a valid email address.