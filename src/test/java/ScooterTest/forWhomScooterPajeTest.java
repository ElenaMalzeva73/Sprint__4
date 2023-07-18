package ScooterTest;

import ScooterTest.pajeobject.MainPage;
import ScooterTest.pajeobject.forWhomScooterPaje;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class forWhomScooterPajeTest extends BasicSetTest {
    MainPage mainPage;
    forWhomScooterPaje ForWhomScooterPaje;
    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String comment;
    String leaseTerm;
    String colorScooter;
    String rentalDate;

    @Parameters
    public static Object[][] getSumData() {
        return new Object[][]{{"Саша", "Иванов", "Ленина 5", "Преображенская площадь", "89123904416", "14", "сутки", "черный жемчуг", "Домофон не работает"},
                {"Елена", "Петрова", "Ленина 10", "Сокол", "89123904416", "14", "сутки", "черный жемчуг", "Домофон сломан"}
        };
    }

    public forWhomScooterPajeTest(String name, String lastName, String address, String metroStation,
                                  String phoneNumber, String rentalDate, String leaseTerm, String colorScooter, String comment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.metroStation = metroStation;
        this.leaseTerm = leaseTerm;
        this.colorScooter = colorScooter;
        this.rentalDate = rentalDate;
    }

    @Test
    public void checkButtonOrder() {
        this.mainPage = new MainPage(webDriver);
        this.mainPage.checkButtonCookies();
        this.mainPage.clickButtonCookies();
        this.mainPage.clickButtonOrder();
        this.checkOrderHeader();
    }

    @Test
    public void checkSecondOrderButton() {
        this.mainPage = new MainPage(webDriver);
        this.mainPage.checkButtonCookies();
        this.mainPage.clickButtonCookies();
        this.mainPage.scrollToButton();
        this.mainPage.clickSecondOrderButton();
        this.checkOrderHeader();
    }

    public void checkOrderHeader() {
        this.ForWhomScooterPaje = new forWhomScooterPaje(webDriver,name,lastName,address,metroStation,
                phoneNumber, rentalDate, leaseTerm, colorScooter,comment);
        this.ForWhomScooterPaje.fillOrderHeader();
        this.ForWhomScooterPaje.setStationMetro(metroStation);
        this.ForWhomScooterPaje.clickButtonNext();
        this.ForWhomScooterPaje.checkFieldProRent();
        this.ForWhomScooterPaje.fillFieldWhenBringScooter();
    }
}
