package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingHomePage {

    private WebDriver driver;

    //локатор кнопки "Заказать"
    private By buttonOrder = By.cssSelector(".Button_UltraBig__UU3Lp");

    //локатор 0 компонента аккордиона
    private By buttonAccordionComponent_0 = By.id("accordion__heading-0");

    //локатор текста ответа 0 компонента аккордиона
    private By textAccordionAnswer_0 = By.xpath(".//div[@id='accordion__panel-0']/p");

    //локатор 1 компонента аккордиона
    private By buttonAccordionComponent_1 = By.id("accordion__heading-1");

    //локатор текста ответа 1 компонента аккордиона
    private By textAccordionAnswer_1 = By.xpath(".//div[@id='accordion__panel-1']/p");

    //локатор 2 компонента аккордиона
    private By buttonAccordionComponent_2 = By.id("accordion__heading-2");

    //локатор текста ответа 2 компонента аккордиона
    private By textAccordionAnswer_2 = By.xpath(".//div[@id='accordion__panel-2']/p");

    //локатор 3 компонента аккордиона
    private By buttonAccordionComponent_3 = By.id("accordion__heading-3");

    //локатор текста ответа 3 компонента аккордиона
    private By textAccordionAnswer_3 = By.xpath(".//div[@id='accordion__panel-3']/p");

    //локатор 4 компонента аккордиона
    private By buttonAccordionComponent_4 = By.id("accordion__heading-4");

    //локатор текста ответа 4 компонента аккордиона
    private By textAccordionAnswer_4 = By.xpath(".//div[@id='accordion__panel-4']/p");

    //локатор 5 компонента аккордиона
    private By buttonAccordionComponent_5 = By.id("accordion__heading-5");

    //локатор текста ответа 5 компонента аккордиона
    private By textAccordionAnswer_5 = By.xpath(".//div[@id='accordion__panel-5']/p");

    //локатор 6 компонента аккордиона
    private By buttonAccordionComponent_6 = By.id("accordion__heading-6");

    //локатор текста ответа 6 компонента аккордиона
    private By textAccordionAnswer_6 = By.xpath(".//div[@id='accordion__panel-6']/p");

    //локатор 7 компонента аккордиона
    private By buttonAccordionComponent_7 = By.id("accordion__heading-7");

    //локатор текста ответа 7 компонента аккордиона
    private By textAccordionAnswer_7 = By.xpath(".//div[@id='accordion__panel-7']/p");


    public LandingHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //метод кликает по кнопке "Заказать"
    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    //метод кликает по 0 компоненту в аккордионе
    public void clickButtonAccordionComponent_0() {
        driver.findElement(buttonAccordionComponent_0).click();
    }

    //метод кликает по 1 компоненту в аккордионе
    public void clickButtonAccordionComponent_1() {
        driver.findElement(buttonAccordionComponent_1).click();
    }

    //метод кликает по 2 компоненту в аккордионе
    public void clickButtonAccordionComponent_2() {
        driver.findElement(buttonAccordionComponent_2).click();
    }

    //метод кликает по 3 компоненту в аккордионе
    public void clickButtonAccordionComponent_3() {
        driver.findElement(buttonAccordionComponent_3).click();
    }

    //метод кликает по 4 компоненту в аккордионе
    public void clickButtonAccordionComponent_4() {
        driver.findElement(buttonAccordionComponent_4).click();
    }

    //метод кликает по 5 компоненту в аккордионе
    public void clickButtonAccordionComponent_5() {
        driver.findElement(buttonAccordionComponent_5).click();
    }

    //метод кликает по 6 компоненту в аккордионе
    public void clickButtonAccordionComponent_6() {
        driver.findElement(buttonAccordionComponent_6).click();
    }

    //метод кликает по 7 компоненту в аккордионе
    public void clickButtonAccordionComponent_7() {
        driver.findElement(buttonAccordionComponent_7).click();
    }

    //метод получает текст ответа 0 компонента аккордиона
    public String getTextAccordionAnswer_0() {
        return driver.findElement(textAccordionAnswer_0).getText();
    }

    //метод получает текст ответа 1 компонента аккордиона
    public String getTextAccordionAnswer_1() {
        return driver.findElement(textAccordionAnswer_1).getText();
    }

    //метод получает текст ответа 2 компонента аккордиона
    public String getTextAccordionAnswer_2() {
        return driver.findElement(textAccordionAnswer_2).getText();
    }

    //метод получает текст ответа 3 компонента аккордиона
    public String getTextAccordionAnswer_3() {
        return driver.findElement(textAccordionAnswer_3).getText();
    }

    //метод получает текст ответа 4 компонента аккордиона
    public String getTextAccordionAnswer_4() {
        return driver.findElement(textAccordionAnswer_4).getText();
    }

    //метод получает текст ответа 5 компонента аккордиона
    public String getTextAccordionAnswer_5() {
        return driver.findElement(textAccordionAnswer_5).getText();
    }

    //метод получает текст ответа 6 компонента аккордиона
    public String getTextAccordionAnswer_6() {
        return driver.findElement(textAccordionAnswer_6).getText();
    }

    //метод получает текст ответа 7 компонента аккордиона
    public String getTextAccordionAnswer_7() {
        return driver.findElement(textAccordionAnswer_7).getText();
    }
}
