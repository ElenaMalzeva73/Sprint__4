package ScooterTest;

import ScooterTest.pajeobject.MainPage;
import ScooterTest.pajeobject.listOfImportantQuestionsPaje;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class listOfImportantQuestionsPajeTest extends BasicSetTest {
    MainPage mainPage;
    listOfImportantQuestionsPaje accordionTest;
    private final String expectedTest;
    private final String actualTest;

    @Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                 "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"Да, обязательно. Всем самокатов! И Москве, и Московской области.", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        };
    }

    public listOfImportantQuestionsPajeTest(String expectedTest, String actualTest) {
        this.expectedTest = expectedTest;
        this.actualTest = actualTest;
    }

    @Test
    public void Test() {
        this.mainPage = new MainPage(webDriver);
        this.mainPage.checkButtonCookies();
        this.mainPage.clickButtonCookies();
        this.mainPage.scrollToElement();
        importantQuestionsPaje();
    }

    public void importantQuestionsPaje() {
        this.accordionTest = new listOfImportantQuestionsPaje(webDriver,expectedTest,actualTest);
        this.accordionTest.clicOfImportantQuestions();
        this.accordionTest.clicSecondQuestion();
        this.accordionTest.clicThirdButton();
        this.accordionTest.clicFourthQuestion();
        this.accordionTest.clicFifthQuestion();
        this.accordionTest.clicSixQuestion();
        this.accordionTest.clicSeventhQuestion();
        this.accordionTest.clicEighthQuestion();
    }
}
