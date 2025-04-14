package stepdefinition;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 4ef1a98cbb1ee767528cd96f2fe7568654a8078d
=======

>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
=======

>>>>>>> 1f54fdbeae194607d9a30e4f4896fcabdd5cb136
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomepageActionPage;

public class stepdefinition1 {

    HomepageActionPage act = new HomepageActionPage();


    /**
     * Decription:This method is to print the user current information
     * @author 10830767 -Raghul Senthil
     * Test Case ID: PHDTC-005
     */
    @Given("User lands on the homepage")
    public void user_lands_on_the_homepage() {
        System.out.println("Browser started");

    }

     /**
     * Decription:This method is to iterate through the footers  under the support section
     * @author 10830767 -Raghul Senthil
     * Test Case ID: PHDTC-005
     */
    @Then("User clicks on every footer link and navigate back")
    public void user_clicks_on_every_footer_link_and_navigate_back() {
        act.footerTestcase01();

    }

    /**
     * Decription:This method is to print the user current information
     * @author 10830767 -Raghul Senthil
     * Test Case ID: PHDTC-006
     */
    @Given("User land on the homepage")
    public void user_land_on_the_homepage() {
        System.out.println("Browser started");
    }

     /**
     * Decription:This method is to iterate through the footers  under the resources link session
     * @author 10830767 -Raghul Senthil
     * Test Case ID: PHDTC-006
     */
    @Then("User clicks on the footer link under resouces and assertion")
    public void user_clicks_on_the_footer_link_under_resouces_and_assertion() {
        act.footerTestcase02();
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> 4ef1a98cbb1ee767528cd96f2fe7568654a8078d
=======
}
>>>>>>> 9f219f829f86dbf13c3e5531cb180372efe454ad
=======
}
>>>>>>> 1f54fdbeae194607d9a30e4f4896fcabdd5cb136
