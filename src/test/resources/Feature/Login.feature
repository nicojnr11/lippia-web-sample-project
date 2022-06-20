Feature: Login practice

  Background:
    Given The user naviga to in the page automation

  Scenario Outline: Login-Handles case sensitive

  Given Click on My Account Menu
  When Enter the case changed <username> in username textbox
  And Enter the case chenged <password> in the password tetxbox
  And Now click on login button
  Then Login must fail saying incorrect username-password with show <message>

    Examples:
    |username|password|message|
    |        |        |       |


  Scenario Outline: Login-Authentication

    Given Click on My Account Menu
    When Enter the case changed <username> in username textbox
    And Enter the case chenged <password> in the password tetxbox
    And Now click on login button
    And Once your are logged in, sign out of the site
    And Now press back button
    Then User shouldn’t be signed in to his account rather a general webpage must be visible

    Examples:
      |username|password|message|
      |        |        |       |
