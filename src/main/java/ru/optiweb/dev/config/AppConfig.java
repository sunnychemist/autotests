package ru.optiweb.dev.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static ru.optiweb.dev.core.EnvironmentProperties.getSiteBaseUrl;

public class AppConfig {
    public void start() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        Configuration.baseUrl = getSiteBaseUrl();
        Configuration.timeout = 6000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    public void end() {
        closeWebDriver();
    }
}
