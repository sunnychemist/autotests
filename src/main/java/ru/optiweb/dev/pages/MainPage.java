package ru.optiweb.dev.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import ru.optiweb.dev.pages.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static ru.optiweb.dev.core.EnvironmentProperties.getBaseAuthLogin;
import static ru.optiweb.dev.core.EnvironmentProperties.getBaseAuthPassword;

public class MainPage extends BasePage {
    private static final SelenideElement banner = $(By.xpath("//div[@class='content']"));

    @Override
    @Step("open Main page")
    public MainPage open() {
        Selenide.open("",
                "",
                getBaseAuthLogin(),
                getBaseAuthPassword());
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
}
