package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardDay = new Select(selectCombo);
        selectBoardDay.selectByIndex(10);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(5);
    }
}
