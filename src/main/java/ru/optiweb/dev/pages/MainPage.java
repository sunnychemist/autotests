package ru.optiweb.dev.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {
    private static final SelenideElement banner = $(By.xpath("//div[@class='content']"));
    private static final SelenideElement container = $(By.xpath("//div[@class='header-top']"));
    private static final SelenideElement delivery = container.$("a[href='/delivery/']");
    private static final ElementsCollection deliveryPagesSelector = $$(By.xpath(".//li[@class='h-nav__sub-item']"));
    private static final SelenideElement service = container.$("a[href='/service/']");
    private static final SelenideElement shops = container.$("a[href='/shops/']");
    private static final SelenideElement about = container.$("a[href='/about/']");
    private static final ElementsCollection aboutPagesSelector = $$(By.xpath(".//ul[2]//li[@class='h-nav__sub-item']"));

    @Override
    @Step("open Main page")
    public MainPage open() {
//        Selenide.open("",
//                "",
//                getBaseAuthLogin(),
//                getBaseAuthPassword());
        Selenide.open("",
                "",
                "kuchumova",
                "wXKdeN");
        return new MainPage();
    }

    @Step("Check Main Page was open")
    public MainPage shouldBeOpened() {
        banner.shouldBe(visible);
        return this;
    }

    @Step("click banner")
    public CatalogPage clickBanner() {
        banner.click();
        return new CatalogPage();
    }

    @Step("open delivery page")
    public CatalogPage selectDeliveryPages(String select) {
        delivery.hover();
        switch (select) {
            case "Доставка":
                deliveryPagesSelector.get(0).click();
                break;
            case "Оплата":
                deliveryPagesSelector.get(1).click();
                break;
            case "Порядок возврата":
                deliveryPagesSelector.get(2).click();
                break;
        }
        return new DeliveryPage();
    }

    @Step("open service page")
    public CatalogPage openServicePage() {
        service.click();
        return new ServicePage();
    }

    @Step("open shops page")
    public CatalogPage openShopsPage() {
        shops.click();
        return new ShopsPage();
    }

    @Step("open about page")
    public CatalogPage selectAboutPages(String select) {
        about.hover();
        switch (select) {
            case "О компании":
                aboutPagesSelector.get(0).click();
                break;
            case "Оплата":
                aboutPagesSelector.get(1).click();
                break;
            case "Порядок возврата":
                aboutPagesSelector.get(2).click();
                break;
        }
        return new DeliveryPage();
    }
}

