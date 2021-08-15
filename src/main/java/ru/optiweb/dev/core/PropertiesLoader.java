package ru.optiweb.dev.core;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    public static Properties loadProperties(String relativePath) {
        var loader = Thread.currentThread().getContextClassLoader();
        var properties = new Properties();

        try (var resourceStream = loader.getResourceAsStream(relativePath)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            throw new RuntimeException("Error while read properties");
        }

        return properties;
    }
}
