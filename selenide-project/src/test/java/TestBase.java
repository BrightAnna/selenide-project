import com.codeborne.selenide.Configuration;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@Listeners(ReportPortalTestNGListener.class)
public class TestBase {

    @BeforeMethod
    public void methodSetUp() {

        String browser = System.getProperty("browser", "chrome");
//        Platform platform = Platform.valueOf(System.getProperty("os", "WINDOWS"));

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setBrowserName(CHROME);
//
//        caps.setPlatform(platform);
//
//        Configuration.remote = "http://192.168.100.29:4444/wd/hub";
//        Configuration.browserCapabilities = caps;

        Configuration.browser = browser;
        Configuration.pageLoadTimeout = 5000;

        open("https://litecart.stqa.ru/en/");

    }

    @AfterMethod
    public void methodTearDown() {
        closeWebDriver();
    }
}