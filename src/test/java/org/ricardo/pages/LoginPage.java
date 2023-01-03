package org.ricardo.pages;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage  extends SuperPage{
    WebDriver driver;

    @FindBy (id="user[email]")
    WebElement email;

    @FindBy (id="user[password]")
    WebElement password;

    @FindBy (xpath="//*/form//button")
    WebElement signIn;

    @FindBy (xpath = "//*[contains(text(), 'Forgot')]")
    WebElement forgot;

    public LoginPage() {
        this.driver = super.driver;
        PageFactory.initElements(driver, this);
        this.driver.navigate().to("https://courses.ultimateqa.com/users/sign_in");
    }

    public void setEmail(String _email){
        this.email.sendKeys(_email);
    }

    public void setPassword (String _password){
        this.password.sendKeys(_password);
    }

    public void signIn (){
        this.signIn.click();
    }
    public void forgot(){
        this.forgot.click();
    }

    public boolean hasError(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        List<WebElement> error = driver.findElements(By.xpath("//li[@class='form-error__list-item']"));
        return error.size()!=0;


    }


}
