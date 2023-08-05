package com.narendra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://opensource-demo.orangehrmlive.com/";

        //direct to url
        driver.get(url);
        //set maximize browser
        driver.manage().window().maximize();
        //menahan automation
        delay(2);
        //declaration get title page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        // declaration get image
        boolean imgOrange = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(imgOrange);
        delay(2);
        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        delay(5);
        driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")).click();
        delay(3);
        js.executeScript("window.scrollBy(0,250)","");
        delay(2);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        delay(2);
        driver.close();
        //input[@name='password']
    }
    static void delay(int seconds) {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
