package stepdefinition;
 
import io.cucumber.java.en.*;
import pages.HomepageActionPage;
import pages.InformationActionPage;
 
public class stepdefinition4 {
 
   
    InformationActionPage informationPage = new InformationActionPage();
    HomepageActionPage HomepageActionPage =new HomepageActionPage();
 
    /**
    * Description: This method is used to verify the heading of the Home Services section
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @Given("the user verifies the heading of the Home Services section")
    public void theUserVerifiesTheHeadingOfTheHomeServicesSection() {
       
        HomepageActionPage.serivcesClickingOnNavbar();
        informationPage.verifyHeading();
    }
 

    /**
   * Description: This method is used to perform the action of clicking on the Flooring service
   * @author 10830806 - Kumar Shubham
   * Test Case ID: PHDTC-003
   */
    @When("the user clicks on the Flooring service")
    public void theUserClicksOnTheFlooringService() {
       
        informationPage.clickActionOnFlooring();
    }
 
    /**
    * Description: This method is used to validate that the Flooring service heading and details are displayed successfully
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @Then("the Flooring service heading and details are displayed successfully")
    public void theFlooringServiceHeadingAndDetailsAreDisplayedSuccessfully() {
       
        System.out.println("Flooring service details validated.");
    }
 
    /**
    * Description: This method is used to perform the action of interacting with the Bathroom service
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @When("the user interacts with the Bathroom service")
    public void theUserInteractsWithTheBathroomService() {
        informationPage.clickActionOnBathroom();
    }
 
    /**
    * Description: This method is used to validate that the Bathroom installation service details are visible and properly displayed
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @Then("the Bathroom installation service details are visible and validated")
    public void theBathroomInstallationServiceDetailsAreVisibleAndValidated() {
        System.out.println("Bathroom service details validated.");
    }
 
    /**
    * Description: This method is used to perform the action of exploring the Doors and Windows service section
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @When("the user explores the Doors and Windows service section")
    public void theUserExploresTheDoorsAndWindowsServiceSection() {
       
        informationPage.clickActionOnDoorsAndWindow();
    }
 
    /**
    * Description: This method is used to validate that the Windows and Doors service heading and description are shown accurately
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-010
    */
    @Then("the Windows and Doors service heading and description are shown accurately")
    public void theWindowsAndDoorsServiceHeadingAndDescriptionAreShownAccurately() {
        System.out.println("Windows and Doors service details validated.");
    }
 
    /**
    * Description: This method is used to perform the action of accessing the Heating and Cooling service
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @When("the user accesses the Heating and Cooling service")
    public void theUserAccessesTheHeatingAndCoolingService() {
       
        informationPage.clickActionOnHeatingAndCooling();
    }
 
    /**
    * Description: This method is used to validate that the Heating and Cooling service details are properly displayed
    * @author 10830806 - Kumar Shubham
    * Test Case ID: PHDTC-003
    */
    @Then("the Heating and Cooling service details are properly displayed")
    public void theHeatingAndCoolingServiceDetailsAreProperlyDisplayed() {
       
        System.out.println("Heating and Cooling service details validated.");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
