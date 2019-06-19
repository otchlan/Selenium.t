package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
//    driver.manage().window().maximize();


//    String title = driver.getTitle();
//
//    if(title.equalsIgnoreCase("Google"))
//        System.out.println("Title maches " + title);
//    else
//        System.out.println("Test failed" + title);

 //   driver.navigate().to("https://youtube.com");

//    title = driver.getTitle();
//        if(title.equalsIgnoreCase("Google"))
//            System.out.println("Title maches: " + title);
//        else
//            System.out.println("Test failed " + title);

        //PRZEJDZ NA FB
//    driver.navigate().to("https://facebook.com");
//    String tagName = "", username = "";


//    tagName = driver.findElement(By.id("email")).getTagName();
//    username = driver.findElement(By.id("pass")).getTagName();
//        System.out.println();
//        System.out.println("tagName: " + tagName);
//        System.out.println("className: " + username);

        //KLIKNIJ (PRZYCISK: LOGIN)
//    driver.findElement(By.id("u_0_2")).click();
//        System.out.println();

//    String pSource = driver.getPageSource();
//        System.out.println(pSource);

//    String cUrl = driver.getCurrentUrl();
//        System.out.println(cUrl);

        //STRONA Z POPUP'MI
//    driver.navigate().to("http://popuptest.com/popuptest2.html");
//    TimeUnit.SECONDS.sleep(10);
//    driver.quit();

    //ALERT
//        driver.navigate().to("http://jsbin.com/usidix/1");
//        TimeUnit.SECONDS.sleep(5);
//        driver.switchTo().alert();
//        String alertMessage = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        System.out.println(alertMessage);


//        driver.navigate().to("https://facebook.com");
//        WebElement tboxUsername = driver.findElement(By.id("email"));
//        WebElement tboxPass = driver.findElement(By.id("pass"));
//        if (tboxUsername.isEnabled() && tboxPass.isEnabled()){
//            tboxUsername.sendKeys("qwerty");
//            tboxPass.sendKeys("qwerty");
//
//        }
//        driver.findElement(By.id("u_0_2")).click();
//        TimeUnit.SECONDS.sleep(5);




        try {
            WebElement un = driver.findElement(By.id("gb_70"));
            if (un.isEnabled()) {
                System.out.println("Pass");
                //un.click();
            }
        }catch (NoSuchElementException nsee){
            System.out.println(nsee.toString());
        }


        TimeUnit.SECONDS.sleep(5);
   // driver.close();


    }
}
