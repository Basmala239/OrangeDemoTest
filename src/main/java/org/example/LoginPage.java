package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    By userName=By.xpath("//input[@name=\"username\"]");
    By password=By.xpath("//input[@name=\"password\"]");
    By loginButton =By.xpath("//button[@type=\"submit\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillUserName(String userName) {
        sendKeys(this.userName,userName);
    }
    public void fillPassword(String password) {
        sendKeys(this.password,password);
    }
    public void clickLoginButton() {
        click(loginButton);
    }
}
