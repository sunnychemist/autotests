package ru.optiweb.dev.pages.base;

import com.codeborne.selenide.AuthenticationType;
import com.codeborne.selenide.Credentials;

public abstract class BasePage<T> {

    public T open() {
        open();
        return (T) this;
    }
}
