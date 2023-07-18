package ScooterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {

    public static WebDriver getBrowser() {
        WebDriver webDriver;
        switch (System.getProperty("browserName")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                webDriver = new ChromeDriver(options);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions optionsf = new FirefoxOptions();
                optionsf.addArguments();
                webDriver = new FirefoxDriver(optionsf);
                break;
            default:
                throw new RuntimeException("Browser is not detected");
        }

        return webDriver;
    }
}
