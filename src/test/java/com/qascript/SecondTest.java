package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondTest {
    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("http://34.206.63.71:3000/");
        String actualText = driver.findElement(By.cssSelector("h2.text-2xl.font-bold.mb-4")).getText();
        Assert.assertTrue("Register text not found", actualText.contains("Register"));
        Assert.assertTrue("Register text not found", actualText.contains("Register"));
        Assert.assertTrue("Register text not found", actualText.contains("Register"));
        Assert.assertTrue("Register text not found", actualText.contains("Register"));
        Assert.assertTrue("Register text not found", actualText.contains("123"));
    }
}