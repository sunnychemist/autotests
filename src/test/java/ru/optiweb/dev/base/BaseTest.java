package ru.optiweb.dev.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.optiweb.dev.config.AppConfig;

public class BaseTest {
    protected static AppConfig config = new AppConfig();

    @BeforeEach
    void beforeTest() {
        config.start();
    }

    @AfterEach
    void afterTest() {
        config.end();
    }
}
