package ru.optiweb.dev.core;

public class PropertyNotFoundException extends RuntimeException {
    public PropertyNotFoundException(String key) {
        super(String.format("Property [%s] not found", key));
    }
}
