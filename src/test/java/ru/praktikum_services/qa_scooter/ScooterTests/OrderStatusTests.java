package ru.praktikum_services.qa_scooter.ScooterTests;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.ScooterPages.LandingHeader;
import ru.praktikum_services.qa_scooter.ScooterPages.OrderStatusPage;

public class OrderStatusTests extends TestBase{

    @Test
    public void CheckDisplayNotFoundTest() {
        LandingHeader landingHeader = new LandingHeader(driver);
        OrderStatusPage orderStatusPage = new OrderStatusPage(driver);

        landingHeader.findOrderStatus("test");

        Boolean actual = orderStatusPage.checkDisplayNotFound();
        Boolean expected = true;
        String errorMessage = "Страница Not Found не найдена";
        Assert.assertEquals(errorMessage, expected, actual);
    }
}
