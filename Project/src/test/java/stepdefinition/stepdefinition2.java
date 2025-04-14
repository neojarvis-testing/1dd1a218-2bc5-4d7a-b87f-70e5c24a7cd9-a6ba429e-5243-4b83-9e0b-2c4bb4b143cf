package stepdefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoryActionPage;
import pages.HomepageActionPage;
import pages.ProductsActionPage;
 
public class stepdefinition2 {
    HomepageActionPage homepage = new HomepageActionPage();
    CategoryActionPage category = new CategoryActionPage();
    ProductsActionPage product = new ProductsActionPage();
 
     /**
     * Description:This method is to enter the data by clicking the searchbar
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    @Given("User clicks on searchbox and enter the data {string}")
public void user_clicks_on_searchbox_and_enter_the_data(String string) {
    homepage.HomepageMain(string);
 
}
    /**
     * Description:This method is select the specific category and verify
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
@When("User selects category and verify")
public void user_selects_category_and_verify() {
    category.CategoryActionMain();
 
}
    /**
     * Description:This method is to explore different wrenches
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
@Then("User explore different wrenches")
public void user_explore_different_wrenches() {
   product.ProductActionMain();
 
}
    /**
     * Description:This method is to scroll to the footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
@Given("User Scrolls to footer")
public void user_scrolls_to_footer() {
System.out.println("User scrolled to the footer");
 
}
    /**
     * Description:This method is to click and verify every link under About Us section
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
@Then("hen User Clicks every Link and Verify Information")
public void hen_user_clicks_every_link_and_verify_information() {
homepage.TC7();
homepage.Tc7();
 
}
 
}