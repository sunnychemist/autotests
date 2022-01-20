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

public class AuthorizationPage extends BasePage {

    private static final SelenideElement title = $(By.xpath("//h1[@class='content__title']"));
    private static final SelenideElement logininput = $(By.xpath("//input[@name='USER_LOGIN']"));
    private static final SelenideElement passwordinput = $(By.xpath("//input[@name='USER_PASSWORD']"));
    private static final SelenideElement buttoninput = $(By.xpath("//input [@name='Login']"));
    @Override
    @Step("open Authorization page")
    public AuthorizationPage open() {
        Selenide.open("/personal",
                "",
                getBaseAuthLogin(),
                getBaseAuthPassword());
        return new AuthorizationPage();
    }

    @Step("check Authorization page was open")
    public AuthorizationPage shouldBeOpened() {
        title.shouldHave(exactText("Авторизация"));
        return this;
    }

    @Step("fill out login")
    public AuthorizationPage fillOutLogin(String login) {
        logininput.val(login);
        return this;
    }

    @Step("fill out password")
    public AuthorizationPage fillOutPassword(String password) {
        passwordinput.val(password);
        return this;
    }

    @Step("click button")
    public AuthorizationPage clickButton() {
        buttoninput.click();
        return this;
    }
}
