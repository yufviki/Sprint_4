package ru.praktikum_services.qa_scooter.ScooterTests;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.ScooterPages.*;

public class OrderValidationTests extends TestBase{

    @Test
    public void OrderValidationDataPersonTest() {

        LandingHeader landingHeader = new LandingHeader(driver);
        OrderDataPersonPage orderDataPersonPage = new OrderDataPersonPage(driver);

        landingHeader.clickButtonOrder();
        orderDataPersonPage.clickButtonNext();

        String expectedErrorName = "Введите корректное имя";
        String messageErrorName = "Неверное сообщение об ошибке для поля ввода Имя";
        Assert.assertEquals(messageErrorName, expectedErrorName, orderDataPersonPage.getErrorInputName());

        String expectedErrorLastName = "Введите корректную фамилию";
        String messageErrorLastName = "Неверное сообщение об ошибке для поля ввода Фамилия";
        Assert.assertEquals(messageErrorLastName, expectedErrorLastName, orderDataPersonPage.getErrorInputLastName());

        String expectedErrorMetroStation = "Выберите станцию";
        String messageErrorMetroStation = "Неверное сообщение об ошибке для поля ввода Станция Метро";
        Assert.assertEquals(messageErrorMetroStation, expectedErrorMetroStation, orderDataPersonPage.getErrorInputMetroStation());

        String expectedErrorPhoneNumber = "Введите корректный номер";
        String messageErrorPhoneNumber = "Неверное сообщение об ошибке для поля ввода Номер телефона";
        Assert.assertEquals(messageErrorPhoneNumber, expectedErrorPhoneNumber, orderDataPersonPage.getErrorInputPhoneNumber());
    }
}
