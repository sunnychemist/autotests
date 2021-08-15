package ru.optiweb.dev.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.base.BasePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static ru.optiweb.dev.core.EnvironmentProperties.getBaseAuthLogin;
import static ru.optiweb.dev.core.EnvironmentProperties.getBaseAuthPassword;

public class ShopsPage extends BasePage {
    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));

    @Override
    @Step("open Shops page")
    public ShopsPage open() {
        Selenide.open("",
                "",
                getBaseAuthLogin(),
                getBaseAuthPassword());
        return new ShopsPage();
    }


    @Step("check Shops page was open")
    public ShopsPage shouldBeOpened() {
        title.shouldHave(exactText("Магазины"));
        return this;
    }
}
