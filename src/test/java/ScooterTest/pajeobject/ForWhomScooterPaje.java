package ScooterTest.pajeobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForWhomScooterPaje {
    WebDriver webDriver;
    boolean isDisplayed;
    String nameTest;
    String lastName;
    String addressTest;
    String metroStation;
    String phoneNumberTest;
    String commentTest;
    String leaseTermTest;
    String colorScooterTest;
    String rentalDateTest;

    private final By fieldName = By.xpath(".//input[@placeholder='* Имя']");
    private final By fieldLastName = By.xpath("//input[@placeholder='* Фамилия']");
    private final By fieldAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By fieldStationMetro = By.xpath(".//input[@class='select-search__input']");
    By listStationMetro = By.xpath(".//div[@class='Order_Circle__3uWFr']");
    private final By fieldPhoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");
    private final By fieldProRent = By.xpath(".//div[@class='Order_Form__17u6u']");
    private final By fieldWhenBringScooter = By.xpath("//div[@class='react-datepicker-wrapper']");
    private final By dropdownListCalendar = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--014' or text()='14']");
    private final By fieldTermLease = By.className("Dropdown-arrow");
    private final By dropdownListTermRental = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    private final By scooterColor = By.xpath(".//input[@id='black']");
    private final By commentForTheCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrderFormAboutRent = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private final By formWantToPlaceAnOrder = By.xpath(".//div[@class='Dropdown-control']");
    private final By buttonYes = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private final By fieldOrderIssued = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");

    public ForWhomScooterPaje(WebDriver webDriver, String name, String lastName, String address, String metroStation, String phoneNumber, String rentalDate, String leaseTerm, String colorScooter, String comment) {
        this.webDriver = webDriver;
        this.nameTest = name;
        this.lastName = lastName;
        this.addressTest = address;
        this.phoneNumberTest = phoneNumber;
        this.commentTest = comment;
        this.metroStation = metroStation;
        this.leaseTermTest = leaseTerm;
        this.colorScooterTest = colorScooter;
        this.rentalDateTest = rentalDate;
    }

    public void fillOrderHeader() {
        webDriver.findElement(fieldName).click();
        webDriver.findElement(fieldName).sendKeys(nameTest);
        webDriver.findElement(fieldLastName).click();
        webDriver.findElement(fieldLastName).sendKeys(lastName);
        webDriver.findElement(fieldAddress).click();
        webDriver.findElement(fieldAddress).sendKeys(addressTest);
    }

    public void setStationMetro(String metroStation) {
        webDriver.findElement(fieldStationMetro).click();
        webDriver.findElement(fieldStationMetro).sendKeys(metroStation);
        webDriver.findElement(listStationMetro).click();
        webDriver.findElement(fieldPhoneNumber).sendKeys(phoneNumberTest);
    }

    public void clickButtonNext() {
        webDriver.findElement(buttonNext).click();
    }

    public void checkFieldProRent() {
        isDisplayed = webDriver.findElement(fieldProRent).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    public void fillFieldWhenBringScooter() {
        webDriver.findElement(fieldWhenBringScooter).click();
        webDriver.findElement(dropdownListCalendar).click();
        webDriver.findElement(fieldTermLease).click();
        webDriver.findElement(dropdownListTermRental).click();
        webDriver.findElement(scooterColor).click();
        webDriver.findElement(commentForTheCourier).click();
        webDriver.findElement(commentForTheCourier).sendKeys(commentTest);
        webDriver.findElement(buttonOrderFormAboutRent).click();
    }
    public void checFormWantToPlaceAnOrder() {
        isDisplayed = webDriver.findElement(formWantToPlaceAnOrder).isDisplayed();
        Assert.assertTrue(isDisplayed);
        webDriver.findElement(buttonYes).click();
    }
    public void checFieldOrderIssued(){
        isDisplayed = webDriver.findElement(fieldOrderIssued).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
}
