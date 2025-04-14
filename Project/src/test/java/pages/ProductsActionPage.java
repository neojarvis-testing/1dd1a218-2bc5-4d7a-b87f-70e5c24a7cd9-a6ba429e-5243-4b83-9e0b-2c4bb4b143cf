package pages;
<<<<<<< HEAD
import org.junit.Assert;
=======

import org.junit.Assert;

>>>>>>> a5378bd7a2712a31093577617c9a29c0a6a21976
import uistore.CategoryPageLocators;
import uistore.ProductsPageLocators;
import utils.LogHelper;
import utils.Main;
import utils.Screenshot;
import utils.UtilsHelper;

public class ProductsActionPage {

    UtilsHelper helper = new UtilsHelper(Main.driver);

    /**
     * Description:This method is to click and verify Wrench sets is displayed.
     * 
     * @author 10830785 -Somesh Bhure
     *         Test Case ID -PHDTC-001
     */
    private void clickAndVerifyWrenchsets() {
        try {

            helper.waitForElementToBeVisible(ProductsPageLocators.wrenchSetsClick, 20);
            helper.ElementClick(ProductsPageLocators.wrenchSetsClick);
            helper.waitForElementToBeVisible(ProductsPageLocators.wrenchSetsClick, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key2"),
                    Main.driver.findElement(ProductsPageLocators.wrenchSetsClick).getText());
            LogHelper.info(
                    "Clicked and verified" + Main.driver.findElement(ProductsPageLocators.wrenchSetsClick).getText());
            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description:This method is to click and verify Ratcheting sets is displayed.
     * 
     * @author 10830785 -Somesh Bhure
     *         Test Case ID -PHDTC-001
     */
    private void clickAndVerifyRatchetingWrenches() {
        try {

            helper.waitForElementToBeVisible(CategoryPageLocators.categoryClick, 10);
            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.ratcheting);
            helper.waitForElementToBeVisible(ProductsPageLocators.ratcheting, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key3"),
                    Main.driver.findElement(ProductsPageLocators.ratcheting).getText());
            LogHelper.info("Clicked and verified" + Main.driver.findElement(ProductsPageLocators.ratcheting).getText());

            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description:This method is to click and verify Adjustable wrenches is
     * displayed.
     * 
     * @author 10830785 -Somesh Bhure
     *         Test Case ID -PHDTC-001
     */
    private void clickAndVerifyAdjustableWrenches() {
        try {

            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.adjustablewrenches);
            helper.waitForElementToBeVisible(ProductsPageLocators.adjustablewrenches, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key4"),
                    Main.driver.findElement(ProductsPageLocators.adjustablewrenches).getText());
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(ProductsPageLocators.adjustablewrenches).getText());

            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description:This method is to click and verify impact wrenches is displayed.
     * 
     * @author 10830785 -Somesh Bhure
     *         Test Case ID -PHDTC-001
     */
    private void clickAndVerifyImpactWrenches() {
        try {

            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.impactWrenches);
            helper.waitForElementToBeVisible(ProductsPageLocators.impactWrenches, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key5"),
                    Main.driver.findElement(ProductsPageLocators.impactWrenches).getText());
            LogHelper.info(
                    "Clicked and verified" + Main.driver.findElement(ProductsPageLocators.impactWrenches).getText());

            Screenshot.screenshot(Main.driver, "Photo");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description:This method is to execute ProductMain method.
     * 
     * @author 10830785 -Somesh Bhure
     *         Test Case ID -PHDTC-001
     */
    public void ProductActionMain() {
        clickAndVerifyWrenchsets();
        clickAndVerifyRatchetingWrenches();
        clickAndVerifyAdjustableWrenches();
        clickAndVerifyImpactWrenches();
    }

    /**
     * Description: This method is to click on concrete in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void Concrete() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonconcrete);
            helper.ElementClick(ProductsPageLocators.productpageclickonconcrete);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title1");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description: This method is to click on Decking in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void Decking() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickondecking);
            helper.ElementClick(ProductsPageLocators.productpageclickondecking);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title2");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description: This method is to click on Insulation in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void Insulation() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickoninsulation);
            helper.ElementClick(ProductsPageLocators.productpageclickoninsulation);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title3");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description: This method is to click on DryWall3 in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void Drywall() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonshopalldrywall);
            helper.ElementClick(ProductsPageLocators.productpageclickondrywall);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title4");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description: This method is to click on ShopallDrywall in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void shopallDrywall() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonshopalldrywall);
            helper.ElementClick(ProductsPageLocators.productpageclickonshopalldrywall);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description: This method is to click on AllFilter in the resultpage
     * 
     * @author 10830808 -Nisha
     *         Test case ID:PHDTC-009
     */
    public void AllFilter() {
        try {

            helper.ElementClick(ProductsPageLocators.productpageclickonallfilters);
            Screenshot.screenshot(Main.driver, "Testcase 9");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> a5378bd7a2712a31093577617c9a29c0a6a21976
