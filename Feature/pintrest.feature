
Feature: Pintrest
  Background: Login
    Given  Browser
    And Enter username and password 
    
    
    Examples: username and password
      | username               | password | 
      | Kmbb4578@gmail.com     |    Mbbasha123@ |
      | jsbnkwq                |  j12kj        |
      Then login in pintrestApp