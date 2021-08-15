package ru.optiweb.dev.utils;

import ru.optiweb.dev.core.PropertyNotFoundException;

import java.util.HashMap;
import java.util.Optional;
import java.util.Properties;

public class PropertiesReader {

    private final Properties properties;
    private final HashMap<String, String> propertiesCache = new HashMap<>();

    public PropertiesReader(Properties properties) {
        this.properties = properties;
    }

    public String get(String key) {
        if (propertiesCache.containsKey(key)) {
            return propertiesCache.get(key);
        }

        String value = getSystemProperty(key)
                .or(() -> Optional.ofNullable(properties.getProperty(key)))
                .orElseThrow(() -> new PropertyNotFoundException(key));

        propertiesCache.put(key, value);

        return value;
    }

    public String get(String key, String defaultValue) {
        if (propertiesCache.containsKey(key)) {
            return propertiesCache.get(key);
        }

        String value = getSystemProperty(key)
                .orElse(properties.getProperty(key, defaultValue));

        propertiesCache.put(key, value);

        return value;
    }

    private Optional<String> getSystemProperty(String key) {
        return Optional.ofNullable(System.getProperty(key));
    }
}

