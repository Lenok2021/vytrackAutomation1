package com.vytrack.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class VytrackUtils {

    // precondition login and password are tested
    //we assume - login test  was tested and passed already

    public static void login(String username, String password) {
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // pass Username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);

        // pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);

        // click login button
        Driver.getDriver().findElement(By.id("_submit")).click();


    }

    public static void loginAsDriver() {
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // pass Username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));

        // pass password
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys("driver_password");

        // click login button
        Driver.getDriver().findElement(By.id("_submit")).click();

    }

    public static void loginAsStoreManager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));

        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys("store_manager_password");

        Driver.getDriver().findElement(By.id("_submit")).click();


    }

    public static void loginAsSalesManager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));

        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys("sales_manager_password");

        Driver.getDriver().findElement(By.id("_submit")).click();


    }


}
