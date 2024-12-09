import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@Listeners(ReportPortalTestNGListener.class)
public class TestBase {

    @BeforeMethod
    public void methodSetUp() {

        String browser = System.getProperty("browser", "MicrosoftEdge");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);
        caps.setPlatform(Platform.WINDOWS);

        Configuration.remote = "http://192.168.100.29:4444/wd/hub";
        Configuration.browserCapabilities = caps;
        Configuration.browser = browser;
        Configuration.pageLoadTimeout = 5000;

        open("https://litecart.stqa.ru/en/");

    }

    @AfterMethod
    public void methodTearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            File screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.FILE);
            try {
                Allure.addAttachment("screenshot" + result.getMethod().getMethodName(), new FileInputStream(screenshot));
            } catch (FileNotFoundException e) {
                System.out.println("Couldn't take screenshot\n" + e.getMessage());
            }
        }

        closeWebDriver();
    }

}

