package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {

    private WebDriver driver;

    //локатор страницы Not found
    private By displayNotFound = By.xpath(".//div[@class='Track_NotFound__6oaoY']/img[@src='/assets/not-found.png']");

    public OrderStatusPage (WebDriver driver){
        this.driver = driver;
    }

    //метод возвращает true, если элемент Not found появился на странице
    public boolean checkDisplayNotFound(){
        return driver.findElements(displayNotFound).size() > 0;
    }
}
