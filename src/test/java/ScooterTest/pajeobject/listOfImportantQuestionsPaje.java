package ScooterTest.pajeobject;

import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class listOfImportantQuestionsPaje {
    WebDriver webDriver;
    boolean isDisplayed;
    String actual;
    String expected;
    private final By questionsAboutTheMain = By.xpath("//div[@id = 'accordion__heading-0' and text()='Сколько это стоит? И как оплатить?']");
    private final By expectedTextFirstQuestion = By.xpath("//div[@id = 'accordion__panel-0']");
    private final By secondQuestion = By.xpath("//div[@id = 'accordion__heading-1']");
    private final By answerToTheSecondQuestion = By.xpath("//div[@id = 'accordion__panel-1']");
    private final By thirdButton = By.xpath("//div[@id = 'accordion__heading-2']");
    private final By pendingThirdReply = By.xpath("//div[@id = 'accordion__panel-2']");
    private final By fourthQuestion = By.xpath("//div[@id = 'accordion__heading-3']");
    private final By fourthAnswer = By.xpath("//div[@id = 'accordion__panel-3']");
    private final By fifthQuestion = By.xpath("//div[@id = 'accordion__heading-4']");
    private final By fifthAnswer = By.xpath("//div[@id = 'accordion__panel-4']");
    private final By sixQuestion = By.xpath("//div[@id = 'accordion__heading-5']");
    private final By sixthAnswer = By.xpath("//div[@id = 'accordion__panel-5']");
    private final By seventhQuestion = By.xpath("//div[@id = 'accordion__heading-6']");
    private final By seventhAnswer = By.xpath("//div[@id = 'accordion__panel-6']");
    private final By eighthQuestion = By.xpath("//div[@id = 'accordion__heading-7']");
    private final By eighthAnswer = By.xpath("//div[@id = 'accordion__panel-7']");

    public listOfImportantQuestionsPaje(WebDriver webDriver, String expectedTest, String actualTest) {
        this.webDriver = webDriver;
        this.expected = expectedTest;
        this.actual = actualTest;
    }

    public void clicOfImportantQuestions() {
        webDriver.findElement(this.questionsAboutTheMain).click();
        isDisplayed = webDriver.findElement(questionsAboutTheMain).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = webDriver.findElement(expectedTextFirstQuestion).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicSecondQuestion() {
        webDriver.findElement(secondQuestion).click();
        isDisplayed =webDriver.findElement(secondQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = webDriver.findElement(answerToTheSecondQuestion).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicThirdButton() {
        webDriver.findElement(thirdButton).click();
        isDisplayed = webDriver.findElement(thirdButton).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = webDriver.findElement(pendingThirdReply).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicFourthQuestion() {
        webDriver.findElement(fourthQuestion).click();
        isDisplayed = webDriver.findElement(fourthQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = webDriver.findElement(fourthAnswer).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicFifthQuestion() {
        webDriver.findElement(fifthQuestion).click();
        isDisplayed = webDriver.findElement(fifthQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = webDriver.findElement(fifthAnswer).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicSixQuestion() {
        webDriver.findElement(sixQuestion).click();
        isDisplayed = webDriver.findElement(sixQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = webDriver.findElement(sixthAnswer).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicSeventhQuestion() {
        webDriver.findElement(seventhQuestion).click();
        isDisplayed = webDriver.findElement(seventhQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = webDriver.findElement(seventhAnswer).getText();
        TestCase.assertEquals(expected, actual);
    }

    public void clicEighthQuestion() {
        webDriver.findElement(eighthQuestion).click();
        isDisplayed = webDriver.findElement(eighthQuestion).isDisplayed();
        Assert.assertTrue(isDisplayed);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = webDriver.findElement(eighthAnswer).getText();
        TestCase.assertEquals(expected, actual);
    }
}
