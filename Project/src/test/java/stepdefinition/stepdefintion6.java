package stepdefinition;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomepageActionPage;
import pages.InformationActionPage;
import utils.Main;
import utils.ReporterUtil;

public class stepdefintion6 {

    HomepageActionPage action = new HomepageActionPage();
    InformationActionPage action1 = new InformationActionPage();
 
    /**
     *  Description: Prints the message in the console
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @Given("the user is on the credit offer page")
    public void the_user_is_on_the_credit_offer_page() {
 
        System.out.println("User is on Credit Offer Page");
 
    }
 
    /**
     * Description:This method is to execute the moveToCreditOfferCall method 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user hovers over the credit offer section")
    public void the_user_hovers_over_the_credit_offer_section() {
 
        action1.moveToCreditOfferCall();
 
    }
 
    /**
     * Description:This method is to execute the  capture the report log
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user clicks on the credit offer link")
    public void the_user_clicks_on_the_credit_offer_link() {
        Hooks.test.log(Status.INFO, "click on terms");
    }
 
    /**
     * Description:This method is to execute the applyNowCall method 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user clicks on the apply now button")
    public void the_user_clicks_on_the_apply_now_button() {
 
        action1.applyNowCall();
 
    }
 
    /**
     * Description:This method is to execute the fillDetailsCall method 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user fills in the details with {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_details_with(String string, String string2, String string3, String string4) {
 
        action1.fillDetailsCall(string, string2, string3, string4);
    }
 
    /**
     * Description:This method is to execute the addressDetailsCall method 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user fills in the address details with {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_address_details_with(String string, String string2, String string3,
            String string4) {
 
        action1.addressDetailsCall(string, string2, string3, string4);
 
    }
 
    /**
     * Description:This method is to execute the residencestatuscall method 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    @When("the user fills in the residence status with {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_residence_status_with(String string, String string2, String string3,
            String string4, String string5) {
 
        action1.residenceStatusCall(string, string2, string3, string4, string5);
 
    }
    /**
     * Description:This method is to execute the message in the terminal
     *  @author 10830839 -Kaustubh sharma
     * est case ID:PHDTC-008
     */
    @Then("the user should see the filled details on the verification page")
    public void the_user_should_see_the_filled_details_on_the_verification_page() {
     System.out.println("This isn the verification part");
    }
 
    /**
     * Description:This method is to execute the combinedMethod
     *  @author 10830839 -Kaustubh sharma
     * est case ID:PHDTC-010
     */
    @When("the user clicks on various links and navigates back to the homepage")
    public void the_user_clicks_on_various_links_and_navigates_back_to_the_homepage() {
        action.combinedMethod();
    }

    /**
     * Description:This method is to execute the attachReport method
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-010
     */
    @Then("all links should be verified successfully")
    public void all_links_should_be_verified_successfully() {

        ReporterUtil.attachToReport("store_directory", Hooks.test,"Verified Store Directory", Main.driver);
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> 4ef1a98cbb1ee767528cd96f2fe7568654a8078d
=======
}
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
