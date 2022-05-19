Feature: As a potential client i need to search in google to find a web site

  @Practico3
  Scenario: El usuario navega en las paginas shop y home en practica de automation
    Given El usuario ingresa en la web de automation practice
    When Ingresa en Shop Menu
    And Clickea en Home
    Then Se visualiza el slider

  @Practico3
  Scenario: El usuario se loguea en la pagina de practica de automation
    Given El usuario ingresa en la web de automation practice
    When Ingresa en la pagina de login e ingresa el email automation11@email.com y la pass TestingCrowdar2022!
    Then Se visualiza el dashboard de usuario
