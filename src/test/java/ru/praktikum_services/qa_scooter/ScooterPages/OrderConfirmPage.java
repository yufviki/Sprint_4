package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmPage {

    private WebDriver driver;

    //локатор кнопки "Да"
    private By buttonOrderYes = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[text() = 'Да']");

    public OrderConfirmPage(WebDriver driver){
        this.driver = driver;
    }

    //метод кликает по кнопке "Да"
    public void clickButtonOrderYes(){
        driver.findElement(buttonOrderYes).click();
    }
}
