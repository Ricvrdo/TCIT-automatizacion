package org.ricardo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Header {
    WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isUserLogged(){
        List<WebElement> userButton = driver.findElements(By.xpath("//header//nav//button"));
        return userButton.size()!=0;


    }

}
