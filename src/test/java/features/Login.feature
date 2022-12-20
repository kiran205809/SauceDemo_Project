Feature: This feature would be used test login functionlity of the application

  Background: Open The Application
    Given I have opened the application in browser

@Sanity
  Scenario Outline: To verify the succesfullLoginFunction
    When i provide "<username>" and "<password>"
    And when i click on Login button
    Then i should be navigate to home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: To verify the unsuccesfullLoginFunction
    When i provide "<UserName>" and "<Password>"
    And when i click on Login button
    Then i should get a error message as "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | UserName         | Password  |
      | Creator@gaml.com | Reset@123 |
