package ru.optiweb.dev.desktop;


import org.junit.jupiter.api.Test;
import ru.optiweb.dev.base.BaseTest;
import ru.optiweb.dev.pages.MainPage;

public class MainPageTest extends BaseTest {

    @Test
    public void clickBannerTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickBanner()
                .shouldBeOpened();
    }

    @Test
    public void clickServicesTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickServicesOnHeaderMenu()
                .shouldBeOpened();
    }

    @Test
    public void clickDeliveryTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickDeliveryOnHeaderMenu()
                .shouldBeOpened();
    }

    @Test
    public void clickShopsTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickShopsOnHeaderMenu()
                .shouldBeOpened();
    }

    @Test
    public void clickAboutCompanyTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickAboutCompanyOnHeaderMenu()
                .shouldBeOpened();
    }
}
