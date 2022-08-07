package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookieBar {

    private WebDriver driver;

    //локатор кнопки "да все привыкли"
    private By buttonCookie = By.id("rcc-confirm-button");

    public CookieBar(WebDriver driver){
        this.driver = driver;
    }

    //метод кликает по "да все привыкли"
    public void clickButtonCookie(){
        driver.findElement(buttonCookie).click();
    }
}
