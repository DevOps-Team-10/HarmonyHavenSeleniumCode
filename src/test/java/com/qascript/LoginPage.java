package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
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

        driver.quit(); // Don't forget to quit the WebDriver
    }

    @Test
    public void ClickLoginButtonAndCheckHeader() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("http://34.206.63.71:3000/");

        // Locate and click the "Already registered? Log in" button
        driver.findElement(By.cssSelector("button.w-full.bg-gray-500.hover\\:bg-gray-600.text-white.font-bold.py-2.px-4.rounded-lg.transition-colors.duration-300.mt-4")).click();

        // Locate the element with class attributes matching "text-2xl", "font-bold", and "mb-4"
        String loginHeaderText = driver.findElement(By.cssSelector("h2.text-2xl.font-bold.mb-4")).getText();
        Assert.assertTrue("Login text not found", loginHeaderText.contains("123"));
        System.out.println("I have reached the third test case");
        driver.quit(); // Don't forget to quit the WebDriver
    }
}
