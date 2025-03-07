package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage extends PageBase{
    public String title="Assign Leave";
    public String invalid="Invalid";
    By actualResult=By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]");
    By employeeName=By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By leaveType=By.xpath("//*[@class=\"oxd-select-text oxd-select-text--active\"]");
    By fromDate=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By toDate=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    By comment=By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]");
    By assignButton=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    By invalidField=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");
    public LeavePage(WebDriver driver) {
        super(driver);
    }

    public String ActualResultAssert(){
        return getText(actualResult);
    }
    public String ActualResultForInvalid(){
        return getText(invalidField);
    }

    public void fillEmployeeName(String employeeName) {
        sendKeys(this.employeeName,employeeName);
    }
    public void selectLeaveType(String leaveType) {
        selectFromDropDown(this.leaveType,leaveType);
    }
    public void fillFromDate(String fromDate) {
        sendKeys(this.fromDate,fromDate);
    }
    public void fillToDate(String toDate) {
        sendKeys(this.toDate,toDate);
    }
    public void fillComment(String comment) {
        sendKeys(this.comment,comment);
    }

    public void clickAssignButton() {
        click(assignButton);
    }
}
