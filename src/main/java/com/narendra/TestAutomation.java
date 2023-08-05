package com.narendra;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String pageTitle = driver.getTitle();
        JavascriptExecutor js = (JavascriptExecutor) driver;

//      String url = "https://v3-web-app-micro.staging.superapp.co.id/ ";
        String url = "https://demoqa.com/text-box";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println(pageTitle);

        driver.findElement(By.id("userName")).sendKeys("Evan Narendra");
        driver.findElement(By.id("userEmail")).sendKeys("evanarendra7@gmail.com");
        delay(3);
        js.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.id("currentAddress")).sendKeys("Kos Niaga Sutera");
        driver.findElement(By.id("permanentAddress")).sendKeys("Timoho");
        driver.findElement(By.id("submit")).click();
        delay(3);
        driver.close();
    }
    static void delay(int seconds) {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
