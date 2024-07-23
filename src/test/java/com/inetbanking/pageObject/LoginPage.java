package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver d){
        driver= d;
        PageFactory.initElements(d,this);
    }

    @FindBy(name="uid")
    WebElement txtUserName;

    @FindBy(name="password")
    WebElement txtPassword;

    @FindBy(name="btnLogin")
    WebElement btnLogin;

   public void setUserName(String username){
       txtUserName.sendKeys(username);
   }

    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void clickButton(){
        btnLogin.click();
    }


}
