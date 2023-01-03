package org.ricardo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.ricardo.pages.RegisterPage;

public class Main {
    public static void main(String[] args) {
        String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",  driverPath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://courses.ultimateqa.com/");


    }
}