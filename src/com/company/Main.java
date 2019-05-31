package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/taicojeszcze/Programy/SElenium/chromedriver");

        WebDriver driver = new ChromeDriver();

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
        System.out.println("Title maches");
    else
        System.out.println(title);

    }
}
