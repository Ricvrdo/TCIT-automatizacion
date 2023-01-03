package org.ricardo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperPage {
    WebDriver driver;
    public Header header;
    public SuperPage() {
        String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        //driver.navigate().to("https://courses.ultimateqa.com/");

        header= new Header(driver);
    }
}
