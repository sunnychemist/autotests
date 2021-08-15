package ru.optiweb.dev.desktop;


import org.junit.jupiter.api.Test;
import ru.optiweb.dev.base.BaseTest;
import ru.optiweb.dev.pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

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
                .clickServices()
                .shouldBeOpened();
    }
}
