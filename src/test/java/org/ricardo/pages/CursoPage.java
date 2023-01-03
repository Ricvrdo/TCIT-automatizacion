package org.ricardo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {

    WebDriver driver;

    @FindBy (xpath = "//div[@id=\"wistia_grid_46_center\"]//button[contains(@class,\"w-big-play-button\")]")
    WebElement play;
    public CursoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void playVideo(){
        this.play.click();
    }

}
