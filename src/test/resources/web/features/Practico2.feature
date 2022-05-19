Feature: As a potential client i need to search in google to find a web site

  @Ejercicio8
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

  @Ejercicio8
  Scenario: The client search by "Automation"
    Given The client is in google page
    When The client search for word Calidad
    Then The client verify that results are shown properly

  @Ejercicio8
  Scenario: The client search by "Docker"
    Given The client is in google page
    When The client search for word Software
    Then The client verify that results are shown properly

  @Ejercicio8
  Scenario: The client search by "Lippia"
    Given The client is in google page
    When The client search for word Testing
    Then The client verify that results are shown properly