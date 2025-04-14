Feature: Homedepot Automation Functionality
 
    Scenario Outline:PHDTC-01 Verify the Wrench and  Explore
 
    Given User clicks on searchbox and enter the data "<Product>"
 
    When User selects category and verify
 
    Then User explore different wrenches
    Examples:
        | Product |
        | wrench  |
 
 
    Scenario:PHDTC-07 Verify and explore About Us section
 
    Given User Scrolls to footer
 
<<<<<<< HEAD
    Then hen User Clicks every Link and Verify Information  
=======
    Then hen User Clicks every Link and Verify Information    
>>>>>>> 4ef1a98cbb1ee767528cd96f2fe7568654a8078d
