package ru.optiweb.dev.core;

import ru.optiweb.dev.utils.PropertiesReader;

public class EnvironmentProperties {
    private static final PropertiesReader propertiesReader;


    static {
        propertiesReader = new PropertiesReader(PropertiesLoader.loadProperties("application.properties"));
    }

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
