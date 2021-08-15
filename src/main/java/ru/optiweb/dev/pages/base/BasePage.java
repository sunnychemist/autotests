package ru.optiweb.dev.pages.base;

public abstract class BasePage<T> {

    public T open() {
        open();
        return (T) this;
    }
}
