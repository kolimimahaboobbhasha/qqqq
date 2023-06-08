Feature: Sandhya
 Scenario: Sandhya login
    Given sandhya browser
    And sandhya url
    When sandhya username as "kmbb4578@gmail.com" and password as "Mbbasha123@"
    And sandhya login
   
   @tag1 
  Scenario: download another image
    And click on other image
    Then download new image
    
    @tag2
     Scenario: give a like to the image
    And like the image
