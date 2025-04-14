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
 
    Then hen User Clicks every Link and Verify Information  