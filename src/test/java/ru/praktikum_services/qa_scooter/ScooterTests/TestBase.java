package ru.praktikum_services.qa_scooter.ScooterTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.praktikum_services.qa_scooter.ScooterPages.CookieBar;

public class TestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver(new FirefoxOptions());
        driver.get("https://qa-scooter.praktikum-services.ru/");

        CookieBar cookieBar = new CookieBar(driver);
        cookieBar.clickButtonCookie();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
