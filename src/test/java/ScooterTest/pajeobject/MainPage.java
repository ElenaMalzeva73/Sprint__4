package ScooterTest.pajeobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    WebDriver webDriver;
    private final By buttonCookies = By.xpath(".//button[normalize-space(text())='да все привыкли']");
    private final By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By secondOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By questionsAboutImportant = By.xpath(".//div[@class = 'accordion']");
    boolean isDisplayed;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void checkButtonCookies() {
        this.isDisplayed = this.webDriver.findElement(this.buttonCookies).isDisplayed();
        Assert.assertTrue(this.isDisplayed);
    }

    public void clickButtonCookies() {
        this.webDriver.findElement(this.buttonCookies).click();
    }

    public void scrollToButton() {
        WebElement element = this.webDriver.findElement(this.secondOrderButton);
        ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickButtonOrder() {
        this.webDriver.findElement(this.buttonOrder).click();
    }

    public void clickSecondOrderButton() {
        this.webDriver.findElement(this.secondOrderButton).click();
    }

    public void scrollToElement() {
        WebElement element = this.webDriver.findElement(this.questionsAboutImportant);
        ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
