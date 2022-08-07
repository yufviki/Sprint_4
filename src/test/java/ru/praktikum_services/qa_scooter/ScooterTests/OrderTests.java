package ru.praktikum_services.qa_scooter.ScooterTests;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum_services.qa_scooter.ScooterPages.*;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)

public class OrderTests extends TestBase {
    private String name;
    private String lastName;
    private String addressTo;
    private int indexMetroStation;
    private String phoneNumber;
    private String dateWhen;
    private int indexRentDay;
    private String comment;

    public OrderTests(
            String name,
            String lastName,
            String addressTo,
            int indexMetroStation,
            String phoneNumber,
            String dateWhen,
            int indexRentDay,
            String comment
    ) {
        this.name = name;
        this.lastName = lastName;
        this.addressTo = addressTo;
        this.indexMetroStation = indexMetroStation;
        this.phoneNumber = phoneNumber;
        this.dateWhen = dateWhen;
        this.indexRentDay = indexRentDay;
        this.comment = comment;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getOrderData() {
        return new Object[][]{
                {"Имя", "Фамилия", "г. Москва, ул. Ленина, д. 1", 1, "+79998887766", "06.08.2022", 1, "Комментарий 1"},
                {"Иван", "Петров", "г. Екатеринбург, ул. Московская, д. 100", 2, "+79998887766", "07.08.2022", 2, ""},
        };
    }

    @Test
    public void OrderAllColourFromLandingHeaderTest() {

        LandingHeader landingHeader = new LandingHeader(driver);
        OrderDataPersonPage orderDataPersonPage = new OrderDataPersonPage(driver);
        OrderDataRentPage orderDataRentPage = new OrderDataRentPage(driver);
        OrderConfirmPage orderConfirmPage = new OrderConfirmPage(driver);
        OrderSuccessPage orderSuccessPage = new OrderSuccessPage(driver);

        landingHeader.clickButtonOrder();
        orderDataPersonPage.orderDataPerson(name, lastName, addressTo, indexMetroStation, phoneNumber);
        orderDataRentPage.orderDataRentAllColour(dateWhen, indexRentDay, comment);
        orderConfirmPage.clickButtonOrderYes();

        String expectedSuccessHeader = "Заказ оформлен";
        MatcherAssert.assertThat(orderSuccessPage.getTextHeaderOrderSuccess(), containsString(expectedSuccessHeader));
    }

    @Test
    public void OrderAllColourFromLandingHomePageTest() {

        LandingHomePage landingHomePage = new LandingHomePage(driver);
        OrderDataPersonPage orderDataPersonPage = new OrderDataPersonPage(driver);
        OrderDataRentPage orderDataRentPage = new OrderDataRentPage(driver);
        OrderConfirmPage orderConfirmPage = new OrderConfirmPage(driver);
        OrderSuccessPage orderSuccessPage = new OrderSuccessPage(driver);

        landingHomePage.clickButtonOrder();
        orderDataPersonPage.orderDataPerson(name, lastName, addressTo, indexMetroStation, phoneNumber);
        orderDataRentPage.orderDataRentAllColour(dateWhen, indexRentDay, comment);
        orderConfirmPage.clickButtonOrderYes();

        String expectedSuccessHeader = "Заказ оформлен";
        MatcherAssert.assertThat(orderSuccessPage.getTextHeaderOrderSuccess(), containsString(expectedSuccessHeader));
    }
}
