package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    WebDriver driver;
    public static long waitTime=10; //in second
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public void waitTimeToBeClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitTimeVisibilityOfElementLocated(By element) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void sendKeys(By element, String value){
        waitTimeVisibilityOfElementLocated(element);
        driver.findElement(element).sendKeys(value);
    }

    public void click(By element){
        waitTimeVisibilityOfElementLocated(element);
        waitTimeToBeClickable(element);
        driver.findElement(element).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getText(By element) {
        waitTimeVisibilityOfElementLocated(element);
        return driver.findElement(element).getText();
    }

    public void selectFromDropDown(By element, String option){
        waitTimeVisibilityOfElementLocated(element);
        Select options = new Select(driver.findElement(element));
        options.selectByVisibleText(option);
    }
}
