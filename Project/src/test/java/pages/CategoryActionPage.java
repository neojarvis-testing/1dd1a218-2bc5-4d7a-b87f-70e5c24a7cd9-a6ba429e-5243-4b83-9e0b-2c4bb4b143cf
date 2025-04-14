package pages;
import uistore.CategoryPageLocators;
import uistore.ProductsPageLocators;
import utils.LogHelper;
import utils.Main;
import utils.UtilsHelper;
 
 
public class CategoryActionPage {
 
    UtilsHelper helper = new UtilsHelper(Main.driver);
    /**
     * Description:This method is to verify wrench is displayed
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
     private void verifyWrench(){
        try {
           
            helper.waitForElementToBeVisible(ProductsPageLocators.wrench, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key1"), Main.driver.findElement(ProductsPageLocators.wrench).getText());
            LogHelper.info("Clicked and verified"+ Main.driver.findElement(ProductsPageLocators.wrench).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Description:This method is to click the category panel
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    private void clickCategory(){
        try {
 
            helper.waitForElementToBeVisible(CategoryPageLocators.categoryClick,20);
            helper.ElementClick(CategoryPageLocators.categoryClick);
 
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    /**
     * Description:This method is to execute CategoryActionMain method
     *  @author 10830785 -Somesh Bhure
     * Test Case ID -PHDTC-001
     */
    public  void CategoryActionMain(){
        verifyWrench();
        clickCategory();
    }
 
}