package org.ricardo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class HomePage extends SuperPage {

    WebDriver driver;
    @FindBy (xpath="//*[@type=\"search\"]")
    WebElement search;

    @FindBy(xpath="//li[@class=\"products__list-item\"]")
    WebElement curso;

    public HomePage() {
        this.driver = super.driver;
        PageFactory.initElements(driver, this);
        this.driver.navigate().to("https://courses.ultimateqa.com/collections");
    }

    public void buscarCurso(){
        this.search.sendKeys("Modern React and NodeJS Development");
        this.search.sendKeys(Keys.RETURN);

    }
    public CursoPage entrarCurso(){

        this.curso.click();
        return new CursoPage(this.driver);
    }


}
