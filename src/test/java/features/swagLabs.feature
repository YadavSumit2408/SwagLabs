
Feature: Login into Application

  Scenario Outline: Login using valid credentials
    Given Initialize the browser with chrome
    And Navigate to "https://www.saucedemo.com/" Site
    When User enters <username> and <password> and logs in
    Then Verify that user is successfully logged in
    And close browsers

    Examples:
      |username			|password	|
      |standard_user	|secret_sauce		|
      |locked_out_user|  secret_sauce     |
      |problem_user   |     secret_sauce  |
      |performance_glitch_user	|secret_sauce     |

  Scenario Outline: Login using invalid credentials
    Given Initialize the browser with chrome
    And Navigate to "https://www.saucedemo.com/" Site
    When User enters <username> and <password> and logs in
    Then Verify that user is unable to log in
    And close browsers

    Examples:
      |username			|password	|
      |standard_user	|secretauce		|
      |locked_ouuser|  secret_sauce     |
      |  |    |

