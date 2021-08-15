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

public class AboutCompanyPage extends BasePage {
    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));

    @Override
    @Step("open About Company page")
    public AboutCompanyPage open() {
        Selenide.open("",
                "",
                getBaseAuthLogin(),
                getBaseAuthPassword());
        return new AboutCompanyPage();
    }


    @Step("check About Company page was open")
    public AboutCompanyPage shouldBeOpened() {
        title.shouldHave(exactText("Доставка и оплата"));
        return this;
    }
}
