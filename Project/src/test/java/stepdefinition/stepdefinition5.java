package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomepageActionPage;
import pages.ProductsActionPage;

public class stepdefinition5 {

    HomepageActionPage page = new HomepageActionPage();
    ProductsActionPage prof = new ProductsActionPage();


     /**
     * Description: This method is to execute the shopby category method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @Given("User clicks on the shopBy Category")
    public void user_clicks_on_the_shop_by_category() {
        page.category();

    }

     /**
     * Description: This method is to execute concrete method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @Given("User clicks on concrete and Verify")
    public void user_clicks_on_concrete_and_verify() {
        prof.Concrete();
    }

     /**
     * Description: This method is to execute the Decking method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @When("User clicks on Decking and Verify")
    public void user_clicks_on_decking_and_verify() {
        prof.Decking();
    }

     /**
     * Description: This method is to execute the Insulation  method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @When("User clicks on Insulation and Verify")
    public void user_clicks_on_insulation_and_verify() {
        prof.Insulation();
    }

     /**
     * Description: This method is to execute drywall method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @When("User clicks on Drywall and verify")
    public void user_clicks_on_drywall_and_verify() {
        prof.Drywall();
    }

     /**
     * Description: This method is to execute the shopallDrywall method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @When("User clicks on shopAllDryWall")
    public void user_clicks_on_shop_all_dry_wall() {
        prof.shopallDrywall();
    }

     /**
     * Description: This method is to execute the  Allfilter method
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    @Then("User verify  and click AllFilter")
    public void user_verify_and_click_all_filter() {
        prof.AllFilter();
    }

}