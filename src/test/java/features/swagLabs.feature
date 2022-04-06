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
#Feature: Browse Catalog
#
#  Scenario: To validate functionality of add to cart button
#    Given User has signed in to swaglabs
#    When User clicks on add to cart button
#    Then The product should be added to cart
#
#  Scenario: To validate functionality of remove button
#    Given User has signed in to swaglabs
#    And User clicks on add to cart button
#    When User clicks on remove button
#    Then The product should be removed from cart
#
#  Scenario: To validate functionality of details page
#    Given User has signed in to swaglabs
#    When User clicks on image or name of product
#    Then The details and images of product should be visible
#
#  Scenario: To validate functionality of add to cart button on details page
#    Given User has signed in to swaglabs
#    And clicked on name or image of product
#    When User clicks on add to cart button
#    Then The product should be added to cart
#
#  Scenario: To validate functionality of remove button on details page
#    Given User has signed in to swaglabs
#    And clicked on name or image of product
#    And User clicks on add to cart button
#    When User clicks on remove button
#    Then The product should be removed from cart
#
#  Scenario: To validate functionality of back to products button
#    Given User has signed in to swaglabs
#    And clicked on name or image of product
#    When User clicks on bakc to products button
#    Then The homepage and product catalog should be visible
#
#  Scenario: To validate functionality of filter by name A-Z
#    Given User has signed in to swaglabs
#    When User clicks on drop down filter option
#    And selects name(A-Z) option
#    Then The products should be sorted by their names A-Z
