package ScooterTest;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static ScooterTest.config.Appconfig.APP_URL;

public class BasicSetTest {
    static WebDriver webDriver;

    public BasicSetTest() {
    }

    @Before
    public void launchStand() {
        webDriver = WebDriverFactory.getBrowser();
        webDriver.get(APP_URL);
        WebDriver.Timeouts timeouts = webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        timeouts.implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void clean() {
        webDriver.quit();
    }
}
