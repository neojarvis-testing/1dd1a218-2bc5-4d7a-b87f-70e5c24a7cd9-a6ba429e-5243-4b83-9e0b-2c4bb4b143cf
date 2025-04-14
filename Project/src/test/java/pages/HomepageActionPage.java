package pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.Status;
import stepdefinition.Hooks;
import uistore.HomepageLocators;
import utils.LogHelper;
import utils.Main;
import utils.Screenshot;
import utils.UtilsHelper;
import java.util.List;

public class HomepageActionPage {

    UtilsHelper helper = new UtilsHelper(Main.driver);

    /**
     * Description:This method is to iterate through the footer under support section
     *  @author 10830767 -Raghul Senthil
     * Test Case ID -PHDTC-005
     */
    private void footerIterationOne() {
        try {

            List<String> data = new ArrayList<>();
            data.add(Main.prop.getProperty("data1"));
            data.add(Main.prop.getProperty("data2"));
            data.add(Main.prop.getProperty("data3"));
            data.add(Main.prop.getProperty("data4"));
            data.add(Main.prop.getProperty("data5"));
            data.add(Main.prop.getProperty("data6"));
            data.add(Main.prop.getProperty("data7"));
            data.add(Main.prop.getProperty("data8"));
            data.add(Main.prop.getProperty("data9"));

            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,6500)", "");

            List<WebElement> firstFooterLinks = Main.driver
                    .findElements(By.xpath("//li[@class='sui-text-sm sui-mb-2 sui-underline']/a"));
            for (int i = 2; i <= 10; i++) {

                Main.driver.findElement(By.xpath("(//li[@class='sui-text-sm sui-mb-2 sui-underline'])[" + i + "]/a"))
                        .click();

                String actual = Main.driver.getCurrentUrl();

                if (actual.contains(data.get(i - 2))) {
                    Assert.assertTrue(true);
                    Main.driver.navigate().back();

                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Description:This method is to execute the test case 5 
     * Test Case ID -PHDTC-005
     */
    public void footerTestcase01() {
        footerIterationOne();
        Hooks.test.log(Status.PASS, "Footer testcase passed");

    }

    /**
     * Description:This method is to iterate through the footer under Resources section
     *  @author 10830767 -Raghul Senthil
     * Test Case ID -PHDTC-006
     */
    private void footerIterationTwo() {

        try {

            List<String> data = new ArrayList<>();
            data.add(Main.prop.getProperty("data11"));
            data.add(Main.prop.getProperty("data12"));
            data.add(Main.prop.getProperty("data13"));
            data.add(Main.prop.getProperty("data14"));
            data.add(Main.prop.getProperty("data15"));
            data.add(Main.prop.getProperty("data16"));
            data.add(Main.prop.getProperty("data17"));
            data.add(Main.prop.getProperty("data18"));
            data.add(Main.prop.getProperty("data19"));

            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,6500)", "");

            List<WebElement> secondFooterLinks = helper
                    .getElementsByXpath("//li[@class='sui-text-sm sui-mb-2 sui-underline']/a");
            for (int i = 11; i <= 19; i++) {

                Main.driver.findElement(By.xpath("(//li[@class='sui-text-sm sui-mb-2 sui-underline'])[" + i + "]/a"))
                        .click();

                String actual = Main.driver.getCurrentUrl();
                for (int j = 0; j < 9; j++) {
                    if (actual.contains(data.get(j))) {
                        Assert.assertTrue(true);
                        Main.driver.navigate().back();

                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Description:This method is to scroll down to footer and click on gifts
     *  @author 10830767 -Raghul Senthil
     * Test Case ID -PHDTC-006
     */
    private void clicksGifts() {
        JavascriptExecutor js = (JavascriptExecutor) Main.driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        helper.ElementHover(HomepageLocators.gift);
        helper.ElementClick(HomepageLocators.gift);
        helper.navBack();
    }


     /**
     * Description:This method is to scroll down to footer and click on privacy and security
     *  @author 10830767 -Raghul Senthil
     * Test Case ID -PHDTC-006
     */
    private void clicksprivacy() {
        JavascriptExecutor js = (JavascriptExecutor) Main.driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        helper.ElementHover(HomepageLocators.privacy);
        helper.ElementClick(HomepageLocators.privacy);
        helper.navBack();
    }

     /**
     * Description:This method is to execute the test case 06
     * Test Case ID -PHDTC-006
     */
    public void footerTestcase02() {
        footerIterationTwo();
        Hooks.test.log(Status.PASS, "Testcase passed for footer");
        clicksGifts();
        clicksprivacy();

    }
     /**
     * Description:This method is to click on search bar
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    private void searchMethod() {
        helper.ElementClick(HomepageLocators.searchBarClick);
    }
    /**
     * Description:This method is to enter the data
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    private void enterData(String string) {
        try {
            helper.sendValues(HomepageLocators.searchBarClick, string);
            helper.ElementClick(HomepageLocators.searchBarIconClick);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to execute HomepageMain method
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    public void HomepageMain(String string) {
        searchMethod();
        enterData(string);
    }
    /**
     * Description:This method is to click and verify careers link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyCareers() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.careers);
            helper.waitForElementToBeVisible(HomepageLocators.careers, 20);
            helper.ElementClick(HomepageLocators.careers);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key6"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify corporate information link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyCoprporateInformation() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.corporateInformation);
            helper.waitForElementToBeVisible(HomepageLocators.corporateInformation, 20);
            helper.ElementClick(HomepageLocators.corporateInformation);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key7"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Digital Newsroom link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyDigitalNewsroom() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.digitalNewsroom);
            helper.waitForElementToBeVisible(HomepageLocators.digitalNewsroom, 20);
            helper.ElementClick(HomepageLocators.digitalNewsroom);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key8"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Homedepot foundation link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyHDFoundation() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;

            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.HDFoundation);
            helper.waitForElementToBeVisible(HomepageLocators.HDFoundation, 20);
            helper.ElementClick(HomepageLocators.HDFoundation);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key9"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Investor Relations link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyInvestorsRelations() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.investorsRelations);
            helper.waitForElementToBeVisible(HomepageLocators.investorsRelations, 20);
            helper.ElementClick(HomepageLocators.investorsRelations);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key10"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Government Customers link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyGovernmentCustomers() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.governmentsCustomers);
            helper.waitForElementToBeVisible(HomepageLocators.governmentsCustomers, 20);
            helper.ElementClick(HomepageLocators.governmentsCustomers);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key11"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Suppliers and providers link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifySuppliersProviders() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.suppliersProviders);
            helper.waitForElementToBeVisible(HomepageLocators.suppliersProviders, 20);
            helper.ElementClick(HomepageLocators.suppliersProviders);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key12"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Affiliate Program link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyAffiliateProgram() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.affiliateProgram);
            helper.waitForElementToBeVisible(HomepageLocators.affiliateProgram, 20);
            helper.ElementClick(HomepageLocators.affiliateProgram);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key13"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click and verify Eco Actions link in footer
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    private void clickAndVerifyEcoActions() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");

            helper.ElementHover(HomepageLocators.ecoActions);
            helper.waitForElementToBeVisible(HomepageLocators.ecoActions, 20);
            helper.ElementClick(HomepageLocators.ecoActions);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key14"), Main.driver.getCurrentUrl());

            Screenshot.screenshot(Main.driver, "Photograph");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to execute TC7 method
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    public void TC7() {
        try {
            clickAndVerifyCareers();
            clickAndVerifyCoprporateInformation();
            clickAndVerifyDigitalNewsroom();
            clickAndVerifyHDFoundation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to execute Tc7 method
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-007
     */
    public void Tc7() {
        try {
            clickAndVerifyInvestorsRelations();
            clickAndVerifyGovernmentCustomers();
            clickAndVerifySuppliersProviders();
            clickAndVerifyAffiliateProgram();
            clickAndVerifyEcoActions();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
 * Description: Handles clicking the "Shop All" element on the homepage.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clickshopall() {

        try {

            helper.ElementClick(HomepageLocators.clickshopall);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    /**
 * Description: Handles clicking the "Savings" element on the homepage.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clicksaving() {

        try {

            helper.ElementClick(HomepageLocators.clickSavings);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    /**
 * Description: Handles clicking the "Shop All Savings" element, verifies the savings center text, and navigates back.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clickshopallsavings() {

        try {

            helper.ElementClick(HomepageLocators.clickAllSavings);

            helper.verifyAcutalAndExpected(Main.prop.getProperty("value1"),

                    Main.driver.findElement(HomepageLocators.verifySavingCenter).getText());

            Main.driver.navigate().back();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    /**
 * Description: Handles clicking "Shop All" again, verifies the department text, and logs the result.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void againclickshopall() {

        try {

            helper.ElementClick(HomepageLocators.clickshopall);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value2"),
                    Main.driver.findElement(HomepageLocators.verifyShopBydepartment).getText());
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(HomepageLocators.verifyShopBydepartment).getText());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
 * Description: Handles clicking the "All Department" element on the homepage.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clickalldepartment() {

        try {

            helper.ElementClick(HomepageLocators.clickondeparetment);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    /**
 * Description: Handles clicking "Select Appliances," verifies the appliances text, and logs the result.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clickselectappliances() {

        try {

            helper.ElementClick(HomepageLocators.selectappliances);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value4"),
                    Main.driver.findElement(HomepageLocators.verifyshopallappliances).getText());
            LogHelper.info("Clicked on Select Appliances and Veified"
                    + Main.driver.findElement(HomepageLocators.verifyshopallappliances).getText());

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    /**
 * Description: Handles clicking "Shop All Appliances," verifies the appliances text, and logs the result.
 * @author 10830836 - Ritik
 * Test Case ID: PHDTC-002
 */

    private void clickshopallappliances() {

        try {

            helper.ElementClick(HomepageLocators.clickshopallappliances);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value5"),
                    Main.driver.findElement(HomepageLocators.verifyAPPLIANCES).getText());
            LogHelper.info("Clicked Shop All Appliances and verified "
                    + Main.driver.findElement(HomepageLocators.verifyAPPLIANCES).getText());

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    /**
 * Description: Handles clicking "Kitchen Appliances Packages," verifies the package text, and logs the result.
 * @author 10830836 - Ritik
 * Test Case ID:  PHDTC-002
 */

    private void clickkitchenappliances() {

        try {

            helper.ElementClick(HomepageLocators.clickKitchenAppliancesPackages);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value6"),
                    Main.driver.findElement(HomepageLocators.verifykITCHENAppliancesPackahes).getText());

            LogHelper.info("Clicked Kitchen Appliances Packages"
                    + Main.driver.findElement(HomepageLocators.verifykITCHENAppliancesPackahes).getText());

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void home() {

        clickshopall();

    }

    public void grocery() {
        clicksaving();
    }

    public void trim() {
        clickshopallsavings();

        againclickshopall();
    }

    public void depot() {
        clickalldepartment();

        clickselectappliances();

    }

    public void shopdepot() {
        clickshopallappliances();

        clickkitchenappliances();

    }

    public void serivcesClickingOnNavbar() {

        try {

            helper.ElementClick(HomepageLocators.NavbarServicesClicking);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted"),
                    Main.driver.findElement(HomepageLocators.ServiceHeadingVerify).getText());
            System.out.println("Services");
            helper.ElementClick(HomepageLocators.HomePageInstallationandServicesClicking);
            helper.ElementClick(HomepageLocators.ViewInstallationandservices);

        } catch (Exception e) {

            e.getMessage();
        }
    }

    /**
     *  Description: Clicks on categories in homepage.
     *  @author 10830808 -Nisha 
     */
    public void category() {
        try {
            helper.ElementHover(HomepageLocators.homepageshopcategoryclick);
            helper.ElementClick(HomepageLocators.homepageshopcategoryclick);

            // test.log(Status.INFO,"Hovered and clicked category");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }


     /**
     *  Description: This method is to click and verify all the links in the homepage under store 
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-008
     */
    private void clickAndVerify() {
        try {
            helper.ElementHover(HomepageLocators.storelocatorclick);
            LogHelper.info("verify store locator");
            helper.ElementClick(HomepageLocators.storelocatorclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.privacyandsecurityclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.termsclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.mypreferencecenterclickon);
            helper.navBack();
            helper.ElementClick(HomepageLocators.sitemapclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.storedirectoryclick);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

     /**
     *  Description:This method is to execute the combined method
     *  @author 10830839 -Kaustubh sharma
     * Test case ID:PHDTC-010
     */
    public void combinedMethod() {
        clickAndVerify();
    }

}
