package org.ricardo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.WebEndpoint;

public class RegisterPage extends SuperPage {
    WebDriver driver;
    @FindBy (id="user[first_name]")
    WebElement firstName;
    @FindBy (id="user[last_name]")
    WebElement lastName;
    @FindBy (id="user[email]")
    WebElement email;
    @FindBy (id="user[password]")
    WebElement password;
    @FindBy (id="user[terms]")
    WebElement termsOfUse;
    @FindBy (xpath = "//*/form//button")
    WebElement signUp;

    public RegisterPage() {
        this.driver = super.driver;
        PageFactory.initElements(driver, this);
        this.driver.navigate().to("https://courses.ultimateqa.com/users/sign_up");
    }

    public void setName (String _firstName) {
        this.firstName.sendKeys(_firstName);
    }
    public void setLastName (String _lastName) {
        this.lastName.sendKeys(_lastName);
    }

    public void setEmail (String _email) {
        this.email.sendKeys(_email);
    }

    public void setPassword (String _password) {
        this.password.sendKeys(_password);
    }
    public void agreeTerms () {
        this.termsOfUse.click();
    }
    public void signUp () {
        this.signUp.click();
    }


}
