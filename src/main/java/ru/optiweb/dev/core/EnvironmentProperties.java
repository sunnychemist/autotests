package ru.optiweb.dev.core;

import ru.optiweb.dev.utils.PropertyReader;

public class EnvironmentProperties {

    public static PropertyReader propertiesReader;

    public static String getSiteBaseUrl() {
        return propertiesReader.get("baseSiteUrl");
    }
    public static String getBaseAuthLogin() {
        return propertiesReader.get("baseAuthLogin");
    }
    public static String getBaseAuthPassword() {
        return propertiesReader.get("baseAuthPassword");
    }
}
