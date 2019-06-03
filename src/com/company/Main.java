package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/taicojeszcze/Programy/SElenium/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "/home/taicojeszcze/Programy/SElenium/geckodriver");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();


//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--no-sandbox");
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//
//        driver.get("https://google.com");
//
//        Thread.sleep(1000);
//
//        if (driver.getPageSource().contains("OK")) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//        driver.quit();



    driver.get("https://google.com");
    driver.manage().window().maximize();

    String title = driver.getTitle();

    if(title.equalsIgnoreCase("Google"))
        System.out.println("Title maches " + title);
    else
        System.out.println("Test failed" + title);

    driver.navigate().to("https://youtube.com");

    title = driver.getTitle();
        if(title.equalsIgnoreCase("Google"))
            System.out.println("Title maches: " + title);
        else
            System.out.println("Test failed " + title);

    driver.navigate().to("https://facebook.com");
    String tagName = "", username = "";

    tagName = driver.findElement(By.id("email")).getTagName();
    username = driver.findElement(By.id("pass")).getTagName();
        System.out.println();
        System.out.println("tagName: " + tagName);
        System.out.println("className: " + username);

    driver.findElement(By.id("u_0_2")).click();

    driver.close();

    }
}
