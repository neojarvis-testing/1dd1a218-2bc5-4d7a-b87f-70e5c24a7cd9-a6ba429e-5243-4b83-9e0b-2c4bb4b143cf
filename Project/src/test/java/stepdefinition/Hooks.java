package stepdefinition;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Main;
import utils.ReporterUtil;

public class Hooks extends Main {

    public static ExtentReports reports;
    public static ExtentTest test;


    /**
     * Description:This method is to create the reports
     */
    @BeforeAll
    public static void reportOpen() {
        reports = ReporterUtil.generateReport("HomeDepot Automation Report");
    }
    /**
     * Description:This condition act as a precondition for opening the browser
     * @param sc
     */
    @Before
    public void browserOpen(Scenario sc) {
        test = reports.createTest(sc.getName());
        openBrowser();
    }

    /**
     * Description:This method is to close the connection and quit the driver
     */
    @After
    public void closeCon() {
        driver.quit();
    }

    /**
     * Description:This method is to close and flush the report 
     */
    @AfterAll
    public static void reportClose() {
        reports.flush();
    }

}