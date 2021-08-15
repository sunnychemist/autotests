package ru.optiweb.dev.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.base.BasePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class ServicesPage extends BasePage {
    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));

    @Override
    @Step("open Services page")
    public ServicesPage open() {
        Selenide.open("/service",
                "",
                "kuchumova",
                "wXKdeN");
        return new ServicesPage();
    }


    @Step("Check Services Page was open")
    public ServicesPage shouldBeOpened() {
        title.shouldHave(exactText("Title"));
        return this;
    }
}
