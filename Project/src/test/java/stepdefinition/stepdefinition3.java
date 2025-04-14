package stepdefinition;
<<<<<<< HEAD
=======

>>>>>>> a5378bd7a2712a31093577617c9a29c0a6a21976
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomepageActionPage;
import pages.InformationActionPage;

public class stepdefinition3 {
    HomepageActionPage action = new HomepageActionPage();
    InformationActionPage action1 = new InformationActionPage();

   /**
 * Description: Simulates user navigation through various sections of the application for testing purposes.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */
    @Given("User Navigate to SopAll and click Saving  then click ShopAllSavings and navigate back to homepage and again click ShopAll")
    public void user_navigate_to_sop_all_and_click_saving_then_click_shop_all_savings_and_navigate_back_to_homepage_and_again_click_shop_all() {
        action.home();

    }
    /**
 * Description: Tests user navigation through multiple sections of the application.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    @When("User click Shop By Department and then click Appliances")
    public void user_click_shop_by_department_and_then_click_appliances() {
        action.depot();

    }
    /**
 * Description: Tests user navigation to "Shop All Appliances" and then to "Kitchen Appliances Packages."
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    @Then("User click Shop All Appliances and then click  Kitchen Appliances Packages")
    public void user_click_shop_all_appliances_and_then_click_kitchen_appliances_packages() {
        action.shopdepot();

    }
    /**
 * Description: Tests user interaction with the DIY section in the navigation bar.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-004
 */

    @Given("User click on DIY present on the navigation bar")
    public void user_click_on_diy_present_on_the_navigation_bar() {
        action1.diy();
    }
    /**
 * Description: Verifies the Free Workshops label after navigating to the Freeworkshop section.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-004
 */

    @When("User click on Freeworkshop and verify Free Workshops label")
    public void user_click_on_freeworkshop_and_verify_free_workshops_label() {
        action1.game();
    }
    /**
 * Description: Verifies the Kids Project after navigating to the KidworkShop section.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-004
 */

    @When("User click on KidworkShop and verify Kids Project")
    public void user_click_on_kidwork_shop_and_verify_kids_project() {
        action1.fame();
    }
    /**
 * Description: Verifies the label "Parent/Guardian First Name" after clicking on Register.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-004
 */

    @Then("User clicks on Register and verify the label Parent\\/Guardian First name")
    public void user_clicks_on_register_and_verify_the_label_parent_guardian_first_name() {
        action1.registration();
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> a5378bd7a2712a31093577617c9a29c0a6a21976
