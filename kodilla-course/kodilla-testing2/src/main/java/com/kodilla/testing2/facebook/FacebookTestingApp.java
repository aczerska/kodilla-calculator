package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//form[@id=\"reg\"]" + "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//form[@id=\"reg\"]" + "//select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//form[@id=\"reg\"]" + "//select[@id=\"year\"]";

    public static final String FACEBOOK_HOME = "https://www.facebook.com/";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_HOME);

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_DAY)));
        selectDay.selectByValue("1");

        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_MONTH)));
        selectMonth.selectByValue("10");

        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_YEAR)));
        selectYear.selectByValue("1984");
    }
}
