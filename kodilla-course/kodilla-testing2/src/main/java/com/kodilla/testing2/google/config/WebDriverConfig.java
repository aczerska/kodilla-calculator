package com.kodilla.testing2.google.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public final static  String CHROME = "CHROME_DRIVER";
    public final static  String FIREFOX = "FIREFOX_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.gecko.driver", "/home/anna/selenium-drivers/firefox/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/home/anna/selenium-drivers/chrome/chromedriver");

        if (driver.equals(FIREFOX)) {
            return new FirefoxDriver();
        } else if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
