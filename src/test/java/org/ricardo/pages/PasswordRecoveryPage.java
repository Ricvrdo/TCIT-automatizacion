package org.ricardo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage extends SuperPage{
    WebDriver driver;

    @FindBy (id="user[email]")
    WebElement email;

    @FindBy (name= "commit")
    WebElement submit;

    public PasswordRecoveryPage() {
        this.driver = super.driver;
        PageFactory.initElements(driver, this);
        this.driver.navigate().to("https://courses.ultimateqa.com/users/password/new");
    }



    public void setEmailRecovery(String _email){
        this.email.sendKeys(_email);
    }

    public void submit(){
        this.submit.click();
    }
}
