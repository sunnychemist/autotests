package ru.optiweb.dev.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AppConfig {
    public void start() {
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
//        Configuration.baseUrl = getSiteBaseUrl();
        Configuration.baseUrl = "http://www.3-6.b2b.dev.optiweb.ru";
        Configuration.timeout = 6000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    public void end() {
        closeWebDriver();
    }
}
