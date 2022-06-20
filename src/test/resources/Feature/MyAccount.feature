Feature: My Account practice

  Background:
    Given The user naviga to in the page automation
    And Click on My Account Menu
    When Enter the case changed username in username textbox
    And Enter the case chenged password in the password tetxbox
    And Now click on login button

  Scenario: My Accounts-Account Details

    Given Click on My Account link
    When Click on Account details
    Then User can view account details where he can change his pasword also

  Scenario: My Accounts-Log-Out

    Given Click on My Account link
    When Click on Logout button
    Then On clicking logout,User successfully comes out from the site


