package ru.optiweb.dev.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class DeliveryPage extends CatalogPage {
    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));

    public DeliveryPage shouldBeOpened() {
        title.shouldHave(exactText("Доставка и оплата"));
        return this;
    }
}
