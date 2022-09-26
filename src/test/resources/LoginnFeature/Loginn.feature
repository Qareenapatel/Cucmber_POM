Feature: Loginn Functionality

  Scenario: Check login with valid credentials
    Given user open chrome browser
    When user enter url "https://www.saucedemo.com/"
    Then users enters username as "problem_user" and password as "secret_sauce"
    And users click on login button
    Then user click on react button
    And users click on logout button
    Then user close the browser