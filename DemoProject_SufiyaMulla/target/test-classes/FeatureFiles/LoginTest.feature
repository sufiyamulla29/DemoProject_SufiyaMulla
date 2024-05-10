Feature: Test login page of application

  Background: This is backgroud
    Given application is launched


  Scenario Outline: user login with Invalid credentials
    When user enter username "<username>"
    And user enter password "<password>"
    And user click on login button
    Then Error message "<error>" is displayed
    Examples:
      | username | password | error |
      | invalid  | invalid  | Username and password do not match any user in this service. |



  Scenario Outline: user login with Valid credentials
    When user enter username "<username>"
    And user enter password "<password>"
    And user click on login button
    Then user lands on "<title>" page
    Examples:
      | username | password | title |
      | standard_user  | secret_sauce  | PRODUCTS |
