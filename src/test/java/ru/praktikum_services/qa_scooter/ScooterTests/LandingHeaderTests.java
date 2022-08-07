package ru.praktikum_services.qa_scooter.ScooterTests;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.ScooterPages.LandingHeader;
import java.util.ArrayList;

public class LandingHeaderTests extends TestBase{

    @Test
    public void GoToHomePageScooterTest() {
        LandingHeader landingHeader = new LandingHeader(driver);

        landingHeader.clickLogoScooter();

        String redirectURL = driver.getCurrentUrl();
        String expectedURL = "https://qa-scooter.praktikum-services.ru/";
        String errorMessage = "Неверная ссылка главной страницы Самоката";
        Assert.assertEquals(errorMessage, expectedURL, redirectURL);
    }

    @Test
    public void GoToHomePageYandexTest() {
        LandingHeader landingHeader = new LandingHeader(driver);

        landingHeader.clickLogoYandex();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String redirectURL = driver.getCurrentUrl();
        String expectedURL = "https://yandex.ru/";
        String errorMessage = "Неверная ссылка главной страницы Яндекса";
        Assert.assertEquals(errorMessage, expectedURL, redirectURL);
    }
}
