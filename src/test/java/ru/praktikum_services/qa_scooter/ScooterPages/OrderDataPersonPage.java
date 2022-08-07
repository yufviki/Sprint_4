package ru.praktikum_services.qa_scooter.ScooterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDataPersonPage {

    private WebDriver driver;

    //локатор поля ввода "Имя"
    private By inputName = By.xpath(".//div/input[@placeholder='* Имя']");

    //локатор ошибки валидации поля "Имя"
    private By errorInputName = By.xpath(".//div[text()='Введите корректное имя']");

    //локатор поля ввода "Фамилия"
    private By inputLastName = By.xpath(".//div/input[@placeholder='* Фамилия']");

    //локатор ошибки валидации поля "Фамилия"
    private By errorInputLastName = By.xpath(".//div[text()='Введите корректную фамилию']");

    //локатор поля ввода "Адрес"
    private By inputAddressTo = By.xpath(".//div/input[@placeholder='* Адрес: куда привезти заказ']");

    //локатор поля ввода "Станция метро"
    private By inputMetroStation = By.xpath(".//div/input[@placeholder='* Станция метро']");

    //локатор ошибки валидации поля "Станция метро"
    private By errorInputMetroStation = By.className("Order_MetroError__1BtZb");

    //локатор выпадающего списка первой станций метро
    private By dropdownMetroStation = By.xpath(".//div[@class='select-search__select']//li");

    //локатор поля ввода "Телефон"
    private By inputPhoneNumber = By.xpath(".//div/input[@placeholder='* Телефон: на него позвонит курьер']");

    //локатор ошибки валидации поля "Телефон"
    private By errorInputPhoneNumber = By.xpath(".//div[text()='Введите корректный номер']");

    //локатор кнопки "Далее"
    private By buttonNext = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");


    public OrderDataPersonPage(WebDriver driver){
        this.driver = driver;
    }

    //метод заполняет поле ввода "Имя"
    public void setName(String name){
        driver.findElement(inputName).sendKeys(name);
    }

    //метод отдает текст ошибки поля "Имя"
    public String getErrorInputName(){
        return driver.findElement(errorInputName).getText();
    }

    //метод заполняет поле ввода "Фамилия"
    public void setLastName(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    //метод отдает текст ошибки поля "Фамилия"
    public String getErrorInputLastName(){
        return driver.findElement(errorInputLastName).getText();
    }

    //метод заполняет поле ввода "Адрес"
    public void setAddressTo (String addressTo){
        driver.findElement(inputAddressTo).sendKeys(addressTo);
    }

    //метод кликает по полю ввода "Станция метро" и заполняет его
    public void setMetroStation(int indexMetroStation){
        driver.findElement(inputMetroStation).click();
        driver.findElements(dropdownMetroStation).get(indexMetroStation).click();
    }

    //метод отдает текст ошибки поля "Станция метро"
    public String getErrorInputMetroStation(){
        return driver.findElement(errorInputMetroStation).getText();
    }

    //метод заполняет поле ввода "Телефон"
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    //метод отдает текст ошибки поля "Телефон"
    public String getErrorInputPhoneNumber(){
        return driver.findElement(errorInputPhoneNumber).getText();
    }

    //метод кликает по кнопке "Далее"
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }

    //метод заполняет форму "Для кого самокат"
    public void orderDataPerson(String name, String lastName, String addressTo, int indexMetroStation, String phoneNumber){
        setName(name);
        setLastName(lastName);
        setAddressTo(addressTo);
        setMetroStation(indexMetroStation);
        setPhoneNumber(phoneNumber);
        clickButtonNext();
    }
}
