package ScooterTest;

import ScooterTest.pajeobject.MainPage;
import ScooterTest.pajeobject.ForWhomScooterPaje;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ForWhomScooterPajeTest extends BasicSetTest {
    MainPage mainPage;
   ForWhomScooterPaje ForWhomScooterPaje;
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

    public ForWhomScooterPajeTest(String name, String lastName, String address, String metroStation,
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
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.clickButtonOrder();
        checkOrderHeader();
    }

    @Test
    public void checkSecondOrderButton() {
        mainPage = new MainPage(webDriver);
        mainPage.checkButtonCookies();
        mainPage.clickButtonCookies();
        mainPage.scrollToButton();
        mainPage.clickSecondOrderButton();
        checkOrderHeader();
    }

    public void checkOrderHeader() {
        ForWhomScooterPaje = new ForWhomScooterPaje(webDriver,name,lastName,address,metroStation,
                phoneNumber, rentalDate, leaseTerm, colorScooter,comment);
        ForWhomScooterPaje.fillOrderHeader();
        ForWhomScooterPaje.setStationMetro(metroStation);
        ForWhomScooterPaje.clickButtonNext();
        ForWhomScooterPaje.checkFieldProRent();
        ForWhomScooterPaje.fillFieldWhenBringScooter();
        ForWhomScooterPaje.checFormWantToPlaceAnOrder();
        ForWhomScooterPaje.checFieldOrderIssued();
    }
}
