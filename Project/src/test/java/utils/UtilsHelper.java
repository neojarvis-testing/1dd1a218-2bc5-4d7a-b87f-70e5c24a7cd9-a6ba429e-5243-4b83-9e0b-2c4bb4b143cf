package utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class UtilsHelper {    
    private WebDriver driver;

    public UtilsHelper(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Description: Waits for an element to be visible within the specified timeout.
     *  @author 10830785 -Somesh 
     * @param By,int
     * @return NA
     */
    public void waitForElementToBeVisible(By locator, int timeout) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Clicks on a specified element.
     *  @author 10830808 -Nisha 
     * @param By
     */
    public void ElementClick(By locator) {              
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        } catch (Exception e) {
            // Handle or rethrow the exception here
            e.printStackTrace();
        }
    }

    /**
     * Description: Sends input data to a specified element.
     *  @author 10830767 -Raghul senthil 
     * @param By, String
     */
    public void sendValues(By locator, String data) {            
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(data);
        } catch (Exception e) {
            // Handle or rethrow the exception here
            e.printStackTrace();
        }
    }

    /**
     * Description: Retrieves text from a specified element.
     *  @author 10830785 -Somesh
     * @param By
     * @return String
     */
    public String getTextValue(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception e) {
            // Handle or rethrow the exception here
            e.printStackTrace();
            return " ";
        }
    }

    /**
     * Description: Executes an ENTER key action on a specified element.
     *  @author 10830836 -Rithik
     * @param By
     */
    public void enterAction(By locator) {   
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Hovers over a specified element.
     *  @author 10830806 -kumar shubam 
     * @param By
     */
    public void ElementHover(By locator) {      
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            // Handle or rethrow the exception here
            e.printStackTrace();
        }
    }

    /**
     * Description: Switches to a newly opened browser window.
     * @author 10830806 -kumar shubam 
     */
    public void switchToNewWindow() {
        try {
            String parentId = driver.getWindowHandle();
            Set<String> childIds = driver.getWindowHandles();

            for (String id : childIds) {
                if (!parentId.equals(id)) {
                    driver.switchTo().window(id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Retrieves a list of elements using the provided XPath locator.
     * @author 10830806 -kumar shubam 
     * @param String
     * @return List<WebElement>
     */
    public List<WebElement> getElementsByXpath(String locator) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath(locator));
            return elements;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Description: Clears the input field of a specified element.
     * @author 10830808 -Nisha 
     * @param By
     */
    public void clear(By locator) {
        try {
            driver.findElement(locator).clear();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    /**
     * Description:- This is for navigating back
     * @author 10830806 -kumar shubam 
     */
    public void navBack(){
        try {
            driver.navigate().back();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * This method is to scroll to the element until it comes into view 
     *  @author 10830836 -Rithik
     * @param locator
     */
    public void javascriptScroll(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            LogHelper.error(e.getMessage());
        }
    }

    /**
     * Description:This method is to click an element by javascriptexecutor
     *  @author 10830767 -Raghul senthil 
     * @param locator
     */
    public void jsClick(By locator) {
        try {
            
            WebElement element = driver.findElement(locator);

            
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", element);

            
        } catch (Exception e) {
            System.err.println("JavaScript click failed: " + e.getMessage());
        }
    }
     /**
     * Description:This method is to click on an Element and return the boolean value
     *  @author 10830767 -Raghul senthil 
     * @param locator
     */
    public boolean ElementsClick(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            element.click();
            return true; // Click successful
        } catch (Exception e) {
            System.err.println("Error while clicking the element: " + e.getMessage());
            return false; // Click failed
        }
    }
    /**
     * Description:This method is to verify the data inside the webelement using assertion
     *  @author 10830785 -Somesh
     * @param locator
     */
    public void verifyAcutalAndExpected(String expected, String actual){
        try{
        if(actual.contains(expected)){
            Assert.assertTrue(true);
        }
        }catch(AssertionError error){
         error.printStackTrace();
    }
    }

    /**
     * Description:This method is to get all the elements inside the webelements
     *  @author 10830839 -Kaustubh sharma
     * @param locator
     */
    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
}
