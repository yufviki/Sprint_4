package ru.praktikum_services.qa_scooter.ScooterTests;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.ScooterPages.LandingHomePage;

public class AccordionQuestionsTests extends TestBase{

    private final String errorMessage = "Неверный текст ответа на Вопросы о важном";


    @Test
    public void AccordionComponent_0_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_0();

        String expectedAccordionAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_0());
    }

    @Test
    public void AccordionComponent_1_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_1();

        String expectedAccordionAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_1());
    }

    @Test
    public void AccordionComponent_2_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_2();

        String expectedAccordionAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_2());
    }

    @Test
    public void AccordionComponent_3_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_3();

        String expectedAccordionAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_3());
    }

    @Test
    public void AccordionComponent_4_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_4();

        String expectedAccordionAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_4());
    }

    @Test
    public void AccordionComponent_5_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_5();

        String expectedAccordionAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_5());
    }

    @Test
    public void AccordionComponent_6_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_6();

        String expectedAccordionAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_6());
    }

    @Test
    public void AccordionComponent_7_Test() {
        LandingHomePage landingHomePage = new LandingHomePage(driver);
        landingHomePage.clickButtonAccordionComponent_7();

        String expectedAccordionAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(errorMessage, expectedAccordionAnswer, landingHomePage.getTextAccordionAnswer_7());
    }
}
