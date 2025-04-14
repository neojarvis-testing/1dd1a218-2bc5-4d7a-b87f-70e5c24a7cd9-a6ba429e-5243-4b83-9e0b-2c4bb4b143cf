Feature: Homedepot Automation Functionality
 
 
  Scenario Outline: PHDTC-08 Apply for Credit Offer
    Given the user is on the credit offer page
    When the user hovers over the credit offer section
    And the user clicks on the credit offer link
    And the user clicks on the apply now button
    And the user fills in the details with "<FirstName>", "<LastName>", "<Email>", "<PhoneNumber>"
    And the user fills in the address details with "<Address>", "<City>", "<State>", "<Zip>"
    And the user fills in the residence status with "<Residence>", "<MonthlyPayment>", "<AnnualIncome>", "<DOB>", "<SSN>"
    Then the user should see the filled details on the verification page
 
    Examples:
      | FirstName | LastName | Email | PhoneNumber | Address | City | State | Zip | Residence | MonthlyPayment | AnnualIncome | DOB | SSN |
      | demoname | test | demotest123@gmail.com | 99887766553  | Pennsylvania Avenue NW | Washington | DC | 20004 | R | 5000 | 60000 | 04081999 | 998876543 |
 
   
   Scenario: PHDTC-10 Click and Verify Links
   When the user clicks on various links and navigates back to the homepage
<<<<<<< HEAD
   Then all links should be verified successfully
=======
   Then all links should be verified successfully
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
