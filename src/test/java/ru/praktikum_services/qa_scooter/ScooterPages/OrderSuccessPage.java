package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSuccessPage {

    private WebDriver driver;

    //локатор заголовка "Заказ оформлен"
    private By textHeaderOrderSuccess = By.className("Order_ModalHeader__3FDaJ");

    public OrderSuccessPage(WebDriver driver){
        this.driver = driver;
    }

    //метод получает текст заголовка
    public String getTextHeaderOrderSuccess(){
        return driver.findElement(textHeaderOrderSuccess).getText();
    }
}
