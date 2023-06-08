Feature: Nopcommerce login

  Background: 
    Given Nopcom url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And url page is launched
    

  Scenario: login with multiple data or parameters or datadriven concepts
    When Enter username as "admin@yourstore.com" and password as "admin"
    When click on login button
    
     Scenario: 
    When Enter username as "admin@yourstore.com" and password as "admin"
    When click on login button

  Scenario Outline: login with multiple data or parameters or datadriven concepts
    When Enter username as "<username>" and password as "<password>"
    When click on login button
    And nopC homepage is opened
    And click on customers
    Then logout

    Examples: 
      | username            | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | admin    |
