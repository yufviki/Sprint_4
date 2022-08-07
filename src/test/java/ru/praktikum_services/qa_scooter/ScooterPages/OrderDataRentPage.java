package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderDataRentPage {

    private WebDriver driver;

    //локатор поля ввода "Когда привезти"
    private By inputDateWhen = By.xpath(".//div/input[@placeholder='* Когда привезти самокат']");

    //локатор поля ввода "Срок аренды"
    private By inputRentDays = By.className("Dropdown-control");

    //локатор первого элемента выпадающего списка срока аренды
    private By dropdownRentDays = By.xpath(".//div[@class='Dropdown-menu']/div");

    //локатор черного чекбокса "Цвет самоката"
    private By checkboxColourBlack = By.id("black");

    //локатор серого чекбокса "Цвет самоката"
    private By checkboxColourGrey = By.id("grey");

    //локатор поля ввода "Комментарий"
    private By inputComment = By.xpath(".//div/input[@placeholder='Комментарий для курьера']");

    //локатор кнопки "Заказать"
    private By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Заказать']");

    public OrderDataRentPage(WebDriver driver){
        this.driver = driver;
    }

    //метод заполняет поле ввода "Когда привезти"
    public void setDateWhen(String dateWhen){
        driver.findElement(inputDateWhen).sendKeys(dateWhen);
        driver.findElement(inputDateWhen).sendKeys(Keys.ENTER);
    }

    //метод кликает по полю ввода "Срок аренды" и заполняет его
    public void setRentDays(int indexRentDay){
        driver.findElement(inputRentDays).click();
        driver.findElements(dropdownRentDays).get(indexRentDay).click();
    }

    //метод выбирает черный цвет самоката
    public void clickCheckboxColourBlack(){
        driver.findElement(checkboxColourBlack).click();
    }

    //метод выбирает серый цвет самоката
    public void clickCheckboxColourGrey(){
        driver.findElement(checkboxColourGrey).click();
    }

    //метод заполняет поле ввода "Комментарий"
    public void setComment(String comment) {
        driver.findElement(inputComment).sendKeys(comment);
    }

    //метод кликает по кнопке "Заказать"
    public void clickButtonOrder(){
        driver.findElement(buttonOrder).click();
    }

    //метод заполняет форму "Про аренду" на черный самокат
    public void orderDataRentColourBlack(String dateWhen, int indexRentDay, String comment){
        setDateWhen(dateWhen);
        setRentDays(indexRentDay);
        clickCheckboxColourBlack();
        setComment(comment);
        clickButtonOrder();
    }

    //метод заполняет форму "Про аренду" на серый самокат
    public void orderDataRentColourGrey(String dateWhen, int indexRentDay, String comment){
        setDateWhen(dateWhen);
        setRentDays(indexRentDay);
        clickCheckboxColourGrey();
        setComment(comment);
        clickButtonOrder();
    }

    //метод заполняет форму "Про аренду" на оба цвета самоката
    public void orderDataRentAllColour(String dateWhen, int indexRentDay, String comment){
        setDateWhen(dateWhen);
        setRentDays(indexRentDay);
        clickCheckboxColourBlack();
        clickCheckboxColourGrey();
        setComment(comment);
        clickButtonOrder();
    }
}
