package ru.optiweb.dev.pages.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.ServicesPage;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage<T> {

    private static final SelenideElement headerContainer    = $(By.xpath("//div[@class='header-top']"));
    private static final SelenideElement logo               = headerContainer.$("a.header-top__logo-link");
    private static final SelenideElement servicesLink       = headerContainer.$("a[href='/service/']");
    private static final SelenideElement shopsLink          = headerContainer.$("a[href='/shops/']");
    private static final SelenideElement deliveryLink       = headerContainer.$("a[href='/delivery/']");
    private static final SelenideElement aboutCompanyLink   = headerContainer.$(By.xpath("//li[@text()='Ещё']"));

    public T open() {
        open();
        return (T) this;
    }

    @Step("click Services on header menu")
    public ServicesPage clickServices() {
        servicesLink.click();
        return new ServicesPage();
    }
}
