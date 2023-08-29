package ScooterTest;

import ScooterTest.pajeobject.MainPage;
import ScooterTest.pajeobject.ListOfImportantQuestionsPaje;
import org.junit.Test;
public class ListOfImportantQuestionsPajeTest extends BasicSetTest {
    MainPage mainPage;
    ListOfImportantQuestionsPaje accordionTest;

    @Test
    public void checkFirstQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicFirstQuestion();
    }

    @Test
    public void checSecondQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicSecondQuestion();
    }

    @Test
    public void checThirdQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicThirdButton();

    }

    @Test
    public void checFourthQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicFourthQuestion();
    }

    @Test
    public void checFifthQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicFifthQuestion();
    }

    @Test
    public void checSixQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicSixQuestion();
    }

    @Test
    public void checSeventhQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicSeventhQuestion();
    }

    @Test
    public void checEighthQuestion() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToElement();
        accordionTest = new ListOfImportantQuestionsPaje(webDriver);
        accordionTest.clicEighthQuestion();
    }

}


