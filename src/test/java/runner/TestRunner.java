package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"json:test/report/cucumber_report.json"},
        tags = "@Login"
)
public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
    public static void openReport() {
        try {
            System.out.println("Generating report");
            String[] cmd = {"cmd.exe", "c/", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Report generated sucessfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}