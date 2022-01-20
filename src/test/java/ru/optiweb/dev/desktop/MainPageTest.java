package ru.optiweb.dev.desktop;

import org.junit.Test;
import ru.optiweb.dev.base.BaseTest;
import ru.optiweb.dev.pages.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class MainPageTest extends BaseTest {

    @Test
    public void baseTest() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .clickBanner()
                .shouldBeOpened();
        sleep(1000);
    }

    @Test
    public void checkDeliveryPage() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectDeliveryPages("Доставка")
                .shouldBeOpened();
        sleep(4000);
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectDeliveryPages("Оплата");
//                .shouldBeOpened();
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectDeliveryPages("Порядок возврата");
//                .shouldBeOpened();
    }

    @Test
    public void checkAboutPage() {
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectAboutPages("О компании")
                .shouldBeOpened();
        sleep(4000);
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectAboutPages("Услуги");
//                .shouldBeOpened();
        sleep(4000);
        new MainPage()
                .open()
                .shouldBeOpened()
                .selectAboutPages("Контакты");
//                .shouldBeOpened();
        sleep(4000);
    }
}
