package ru.optiweb.dev.pages.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.AboutCompanyPage;
import ru.optiweb.dev.pages.DeliveryPage;
import ru.optiweb.dev.pages.ServicesPage;
import ru.optiweb.dev.pages.ShopsPage;

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
    public ServicesPage clickServicesOnHeaderMenu() {
        servicesLink.click();
        return new ServicesPage();
    }

    @Step("click Shops on header menu")
    public ShopsPage clickShopsOnHeaderMenu() {
        shopsLink.click();
        return new ShopsPage();
    }

    @Step("click Delivery on header menu")
    public DeliveryPage clickDeliveryOnHeaderMenu() {
        deliveryLink.click();
        return new DeliveryPage();
    }

    @Step("click about Company on header menu")
    public AboutCompanyPage clickAboutCompanyOnHeaderMenu() {
        aboutCompanyLink.click();
        return new AboutCompanyPage();
    }
}
