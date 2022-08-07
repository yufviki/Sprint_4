package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingHeader {

    private WebDriver driver;
    //локатор логотипа "Яндекс"
    private By logoYandex = By.className("Header_LogoYandex__3TSOI");
    //локатор логотипа "Самокат"
    private By logoScooter = By.className("Header_LogoScooter__3lsAR");
    //локатор кнопки "Заказать"
    private By buttonOrder = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //локатор кнопки "Статус заказа"
    private By buttonOrderStatus = By.className("Header_Link__1TAG7");
    //локатор поля ввода "Введите номер заказа"
    private By inputOrderStatusNumber = By.cssSelector(".Header_Input__xIoUq");
    //локатор кнопки "Go"
    private By buttonOrderStatusGo = By.cssSelector(".Header_Button__28dPO");


    public LandingHeader(WebDriver driver) {
        this.driver = driver;
    }

    //метод кликает по логотипу "Яндекс"
    public void clickLogoYandex() {
        driver.findElement(logoYandex).click();
    }

    //метод кликает по логотипу "Самокат"
    public void clickLogoScooter() {
        driver.findElement(logoScooter).click();
    }

    //метод кликает по кнопке "Заказать"
    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    //метод кликает по кнопке "Статус заказа"
    public void clickButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }

    //метод заполняет поля ввода "Введите номер заказа"
    public void setOrderStatusNumber(String statusNumber) {
        driver.findElement(inputOrderStatusNumber).sendKeys(statusNumber);
    }

    //метод кликает по кнопке "Go"
    public void clickButtonOrderStatusGo() {
        driver.findElement(buttonOrderStatusGo).click();
    }

    //метод кликает по кнопке "Статус заказа", заполняет поля ввода "Введите номер заказа" и кликает кнопку "Go"
    public void findOrderStatus(String statusNumber) {
        clickButtonOrderStatus();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOf(driver.findElement(inputOrderStatusNumber)));
        setOrderStatusNumber(statusNumber);
        clickButtonOrderStatusGo();
    }
}
