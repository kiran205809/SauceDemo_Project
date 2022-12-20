Feature: To validation the price of the product

  Background: Login to application

  Scenario Outline: To verify the succesfullLoginFunction
    Given I have opened the application in browser
    When i provide "<username>" and "<password>"
    And when i click on Login button
    When I click on Sauce Labs Backpack product
      Then should total price as "$29.99"
   

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

      
    
      
      
    